package nl.sri.devCloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "nl.sri")
public class DevCloudApplication {


    public static void main(String[] args) {
        SpringApplication.run(DevCloudApplication.class, args);
    }

}