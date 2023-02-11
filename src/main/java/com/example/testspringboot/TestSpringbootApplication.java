package com.example.testspringboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.testspringboot.mapper")

public class TestSpringbootApplication {

    public static void main(String[] args) {
//        System.out.println(System.getProperty("user.dir"));
        SpringApplication.run(TestSpringbootApplication.class, args);
    }

}
