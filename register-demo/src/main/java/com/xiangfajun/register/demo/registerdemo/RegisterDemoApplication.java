package com.xiangfajun.register.demo.registerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RegisterDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(RegisterDemoApplication.class, args);
    }
}
