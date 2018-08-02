package com.xiangfajun.cloud.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 使用@EnableFeignClients开启Feign
 */
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class MovieFeignHystrixApplication {
  public static void main(String[] args) {
    SpringApplication.run(MovieFeignHystrixApplication.class, args);
  }
}
