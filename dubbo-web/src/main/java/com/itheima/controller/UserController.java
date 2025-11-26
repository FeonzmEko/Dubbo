package com.itheima.controller;

import com.itheima.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    /*
    *  1. 从zookeeper注册中心获取userService的访问url
    *  2. 进行远程调用RPC
    *  3. 将结果封装为一个代理对象，给变量赋值
    *
    * */
    @Reference
    private UserService userService;

    @RequestMapping("sayHello")
    public String sayHello(){
        return userService.sayHello();
    }
}
