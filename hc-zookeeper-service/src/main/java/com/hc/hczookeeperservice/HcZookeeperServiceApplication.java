package com.hc.hczookeeperservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class HcZookeeperServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(HcZookeeperServiceApplication.class, args);
    }

}
