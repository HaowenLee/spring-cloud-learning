package com.example.eurekamember;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@MapperScan("com.example.eurekamember.mapper")
@EnableEurekaClient
@SpringBootApplication
public class EurekaMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaMemberApplication.class, args);
    }

}
