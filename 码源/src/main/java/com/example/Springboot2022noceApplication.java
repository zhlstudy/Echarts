package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.dao")
public class Springboot2022noceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot2022noceApplication.class, args);
    }

}
