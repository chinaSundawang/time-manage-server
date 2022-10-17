package com.sdw.timemanage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = {"com.sdw.timemanage"})
@MapperScan(basePackages = "com.sdw.timemanage.mapper" )
public class TimeManageApplication {

    public static void main(String[] args) {
        SpringApplication.run(TimeManageApplication.class, args);
    }

}
