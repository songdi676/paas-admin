/*
 *  Copyright 2019-2020 Zheng Jie
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package me.zhengjie.modules.mnt.config;

import java.util.List;

import javax.sql.DataSource;

import com.baomidou.dynamic.datasource.DynamicRoutingDataSource;
import com.baomidou.dynamic.datasource.creator.DataSourceCreator;
import com.baomidou.dynamic.datasource.spring.boot.autoconfigure.DataSourceProperty;

import lombok.RequiredArgsConstructor;
import me.zhengjie.modules.mnt.domain.Database;
import me.zhengjie.modules.mnt.repository.DatabaseRepository;
import me.zhengjie.modules.mnt.service.DatabaseService;
import me.zhengjie.modules.mnt.service.dto.DatabaseDto;
import me.zhengjie.modules.mnt.service.mapstruct.DatabaseMapper;
import me.zhengjie.modules.quartz.domain.QuartzJob;
import me.zhengjie.modules.quartz.repository.QuartzJobRepository;
import me.zhengjie.modules.quartz.utils.QuartzManage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * @author Zheng Jie
 * @date 2019-01-07
 */
@Component
@RequiredArgsConstructor
public class DataSourceRunner implements ApplicationRunner {
    private static final Logger log = LoggerFactory.getLogger(DataSourceRunner.class);

    private final DatabaseRepository databaseRepository;
    private final DatabaseService databaseService;

    /**
     * 项目启动时重新激活启用的定时任务
     *
     * @param applicationArguments /
     */
    @Override
    public void run(ApplicationArguments applicationArguments) {
        log.info("--------------------加载数据源---------------------");
        List<Database> databaseList = databaseRepository.findAll();
        databaseList.forEach(db -> {
            databaseService.addDatabase2Dynamic(db);
        });
        log.info("--------------------加载数据源完成---------------------");
    }
}
