package com.xxx.helloword;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Description
 * @Author dousongbo
 * @Date 2019/3/31-18:38
 */
@SpringBootApplication
@EnableEurekaClient
public class HelloWordApplication {
    public static void main(String[] args) {
        SpringApplication.run(HelloWordApplication.class , args);
    }
}
