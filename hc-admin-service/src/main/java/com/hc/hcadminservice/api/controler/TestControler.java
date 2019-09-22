package com.hc.hcadminservice.api.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author: liuhongchun
 * @program: springcloud-hc-demo
 * @description: test调用massage服务
 * @Creationtime: 2019-09-21 19:12
 **/
@RestController
public class TestControler {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/findInfo")
    public String getMassage() {
        String result = restTemplate.getForObject("http://HC-MESSAGE-PRODUCER-SERVICE/findMessage", String.class);
        return result;
    }

}
