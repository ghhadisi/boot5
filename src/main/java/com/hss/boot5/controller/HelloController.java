package com.hss.boot5.controller;

import com.hss.starter.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//http://blog.yuqiyu.com/spring-boot-chapter28.html
@RestController
public class HelloController {
    //注入自定义starter内逻辑
    @Autowired
    HelloService helloService;

    //http://127.0.0.1:8080/hello
    /**
     * 测试访问地址/hello
     * @return 格式化字符串
     */
    @RequestMapping(value = "/hello")
    public String sayHello()
    {
        return helloService.sayHello();
    }
}
