package com.itheima.service.impl;

import com.itheima.service.UserService;
import org.apache.dubbo.config.annotation.Service;

//@Service // 将该类的对象创建出来，放到spring的IOC容器里 bean的声明

@Service // dubbo 将这个类提供的方法（服务）对外发布，将访问的地址，ip，端口，路径注册到注册中心里
public class UserServiceImpl implements UserService {
    @Override
    public String sayHello() {
        return "Hello,World!";
    }
}
