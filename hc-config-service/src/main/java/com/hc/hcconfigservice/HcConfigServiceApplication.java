package com.hc.hcconfigservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigServer
public class HcConfigServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(HcConfigServiceApplication.class, args);
    }

}
