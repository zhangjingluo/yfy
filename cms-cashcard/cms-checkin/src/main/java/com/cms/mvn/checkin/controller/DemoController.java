package com.cms.mvn.checkin.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author lyd
 * @Date 2019/11/24 22:50
 * @Description
 */
//当前controller访问地址为 localhost:端口/getMsg  修改@RequestMapping("/service")时 地址为localhost:端口/service/getMsg
//接口地址应以业务模块来区分 方便后期查找调试
@RestController
public class DemoController {

    private static final Logger logger = (Logger) LoggerFactory.getLogger(DemoController.class);

    @RequestMapping("/hello")
    public String  sayHello(){
        return "Hello world";
    }
}