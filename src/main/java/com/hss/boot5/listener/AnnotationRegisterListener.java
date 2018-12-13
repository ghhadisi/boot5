package com.hss.boot5.listener;

import com.hss.boot5.bean.UserBean;
import com.hss.boot5.event.UserRegisterEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @EventListener注解、
 * 实现ApplicationListener泛型接口、
 * 实现SmartApplicationListener接口等
 */
@Component
public class AnnotationRegisterListener {

    @EventListener
    public void register(UserRegisterEvent userRegisterEvent){
        //获取注册用户对象
        UserBean user = userRegisterEvent.getUser();
        System.out.println("@EventListener注册信息，用户名："+user.getName()+"，密码："+user.getPassword());
    }
}
