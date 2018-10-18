package com.example.springboot2mybatisdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@MapperScan("com.example.springboot2mybatisdemo.dao")
public class Springboot2MybatisDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot2MybatisDemoApplication.class, args);
    }
}
