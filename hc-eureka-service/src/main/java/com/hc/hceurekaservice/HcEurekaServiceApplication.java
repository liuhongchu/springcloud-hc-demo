package com.hc.hceurekaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class HcEurekaServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(HcEurekaServiceApplication.class, args);
    }

}
