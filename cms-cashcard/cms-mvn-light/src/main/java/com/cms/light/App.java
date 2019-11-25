package com.cms.light;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(scanBasePackages = {"com.cms.*"},exclude = DataSourceAutoConfiguration.class)
@MapperScan(value = {"com.cms.*"})
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

}
