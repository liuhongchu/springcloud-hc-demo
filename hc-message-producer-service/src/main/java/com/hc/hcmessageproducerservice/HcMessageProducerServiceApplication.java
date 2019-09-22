package com.hc.hcmessageproducerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class HcMessageProducerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(HcMessageProducerServiceApplication.class, args);
    }

}
