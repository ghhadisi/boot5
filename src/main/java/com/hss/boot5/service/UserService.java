package com.hss.boot5.service;

import com.hss.boot5.bean.UserBean;
import com.hss.boot5.event.UserRegisterEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import java.applet.AppletContext;

@Service
public class UserService {
    @Autowired
    ApplicationContext applicationContext;


    public void register(UserBean user){
        //事件发布是由ApplicationContext对象管控的
        applicationContext.publishEvent(new UserRegisterEvent(this, user));
    }
}
