package com.hss.boot5.controller;

import com.hss.boot5.bean.UserBean;
import com.hss.boot5.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    //http://127.0.0.1:8080/register?name=admin&password=123456
    @RequestMapping(value = "/register")
    public String register(UserBean user){
        //调用注册业务逻辑
        userService.register(user);
        return "注册成功.";
    }
}
