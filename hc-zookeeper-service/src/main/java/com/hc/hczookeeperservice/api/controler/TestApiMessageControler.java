package com.hc.hczookeeperservice.api.controler;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: liuhongchun
 * @program: springcloud-hc-demo
 * @description: 测试api控制器
 * @Creationtime: 2019-09-21 18:31
 **/
@RestController
public class TestApiMessageControler {

    @RequestMapping(value = "/findMessage" ,method = RequestMethod.GET)
    public String getMessage(){
        return "这是第一个消息";
    }
}
