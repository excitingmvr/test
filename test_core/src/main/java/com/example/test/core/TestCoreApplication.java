package com.example.test.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class TestCoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestCoreApplication.class, args);
    }

}
