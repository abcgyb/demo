package com.example.demoshiro;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableDiscoveryClient
@EnableScheduling
@EnableJpaRepositories("com.example.demoshiro.jpa")
@EntityScan("com.example.demoshiro.entity")
@MapperScan(basePackages = {"com.example.demoshiro.mapper", "com.example.demoshiro.mapper"})
public class DemoBaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoBaseApplication.class, args);
    }

}
