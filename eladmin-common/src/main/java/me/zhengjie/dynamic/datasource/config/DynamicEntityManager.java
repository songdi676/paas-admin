package me.zhengjie.dynamic.datasource.config;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.sql.DataSource;

import com.alibaba.druid.pool.DruidDataSource;
import com.baomidou.dynamic.datasource.DynamicRoutingDataSource;

import lombok.RequiredArgsConstructor;
import org.hibernate.dialect.DB2Dialect;
import org.hibernate.dialect.DerbyTenSevenDialect;
import org.hibernate.dialect.H2Dialect;
import org.hibernate.dialect.HANAColumnStoreDialect;
import org.hibernate.dialect.HSQLDialect;
import org.hibernate.dialect.InformixDialect;
import org.hibernate.dialect.MySQL5Dialect;
import org.hibernate.dialect.Oracle12cDialect;
import org.hibernate.dialect.PostgreSQL95Dialect;
import org.hibernate.dialect.SQLServer2012Dialect;
import org.hibernate.dialect.SybaseDialect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateProperties;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateSettings;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.boot.jdbc.DatabaseDriver;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

@Configuration
@RequiredArgsConstructor
public class DynamicEntityManager {
    private final DataSource dataSource;
    private final EntityManagerFactoryBuilder builder;

    @Autowired
    private HibernateProperties hibernateProperties;
    @Autowired
    private JpaProperties jpaProperties;
    private final Map<DatabaseDriver, LocalContainerEntityManagerFactoryBean> entityManagerFactoryBeanMap =
        new HashMap<>();
    private final Map<DatabaseDriver, EntityManager> entityManagerMap = new HashMap<>();

    public LocalContainerEntityManagerFactoryBean entityManagerFactoryMain(DatabaseDriver databaseDriver) {
        if (entityManagerFactoryBeanMap.containsKey(databaseDriver)) {
            return entityManagerFactoryBeanMap.get(databaseDriver);
        }
        Class<?> databaseDialectClass = determineDatabaseDialectClass(databaseDriver);
        Map<String, Object> properties =
            hibernateProperties.determineHibernateProperties(jpaProperties.getProperties(), new HibernateSettings());
        properties.put("hibernate.dialect", databaseDialectClass.getName());
        LocalContainerEntityManagerFactoryBean ss = builder.dataSource(dataSource).properties(properties)
            .packages("me.zhengjie","nl.sri") //设置实体类所在位置,自行调整，如：com.test.entity
            .persistenceUnit("persistenceUnit").build();
        ss.afterPropertiesSet();
        entityManagerFactoryBeanMap.put(databaseDriver, ss);
        return entityManagerFactoryBeanMap.get(databaseDriver);
    }

    public EntityManager get() {
        DatabaseDriver databaseDriver = getDatabaseDriver();
        if (entityManagerMap.containsKey(databaseDriver)) {
            return entityManagerMap.get(databaseDriver);
        }
        LocalContainerEntityManagerFactoryBean entityManagerFactory = entityManagerFactoryMain(databaseDriver);
        EntityManager em = entityManagerFactory.getObject().createEntityManager();
        entityManagerMap.put(databaseDriver, em);
        return entityManagerMap.get(databaseDriver);
    }

    private DatabaseDriver getDatabaseDriver() {
        DynamicRoutingDataSource ds = (DynamicRoutingDataSource)dataSource;
        DruidDataSource cd = (DruidDataSource)ds.determineDataSource();
        String url = cd.getUrl();
        return fromJdbcUrl(url);
    }
    public static DatabaseDriver fromJdbcUrl(String url) {
        if (StringUtils.hasLength(url)) {
            Assert.isTrue(url.startsWith("jdbc"), "URL must start with 'jdbc'");
            String urlWithoutPrefix = url.substring("jdbc".length()).toLowerCase(Locale.ENGLISH);
            for (DatabaseDriver driver : DatabaseDriver.values()) {
                for (String urlPrefix : getUrlPrefixes(driver)) {
                    String prefix = ":" + urlPrefix + ":";
                    if (driver != DatabaseDriver.UNKNOWN && urlWithoutPrefix.startsWith(prefix)) {
                        return driver;
                    }
                }
            }
        }
        return DatabaseDriver.MYSQL;
    }
    protected static Collection<String> getUrlPrefixes(DatabaseDriver driver) {
        return Collections.singleton(driver.name().toLowerCase(Locale.ENGLISH));
    }

    protected Class<?> determineDatabaseDialectClass(DatabaseDriver databaseDriver) {
        switch (databaseDriver) {
            case DB2:
                return DB2Dialect.class;
            case DERBY:
                return DerbyTenSevenDialect.class;
            case H2:
                return H2Dialect.class;
            case HANA:
                return HANAColumnStoreDialect.class;
            case HSQLDB:
                return HSQLDialect.class;
            case INFORMIX:
                return InformixDialect.class;
            case MYSQL:
                return MySQL5Dialect.class;
            case ORACLE:
                return Oracle12cDialect.class;
            case POSTGRESQL:
                return PostgreSQL95Dialect.class;
            case SQLSERVER:
                return SQLServer2012Dialect.class;
            default:
                return null;
        }
    }

}
