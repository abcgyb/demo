package com.example.cloudclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableEurekaClient
@EnableFeignClients
/*@EnableHystrix*/
@EnableHystrixDashboard
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class}, scanBasePackages = {"com.example.*"})
public class DemoCloudClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoCloudClientApplication.class, args);
    }

}
