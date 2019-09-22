package com.hc.hcadminservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
public class HcAdminServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(HcAdminServiceApplication.class, args);
    }

    /**
     * 解决找不到RestTemplate 模板，通过@Bean 注册到spring boot 容器当中
     * @return
     */
    @Bean
    //@LoadBalanced 可以使RestTemplate 负有负载均衡能力
    @LoadBalanced
    public RestTemplate restTemplate(){
        return  new RestTemplate();
    }
}
