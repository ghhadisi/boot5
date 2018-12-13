package com.hss.boot5.listener;

import com.hss.boot5.bean.UserBean;
import com.hss.boot5.event.UserRegisterEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class RegisterListener implements ApplicationListener<UserRegisterEvent> {

    @Override
    @Async
    public void onApplicationEvent(UserRegisterEvent userRegisterEvent) {
        try {
            Thread.sleep(3000);//静静的沉睡3秒钟
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        //获取注册用户对象
        UserBean user = userRegisterEvent.getUser();

        //../省略逻辑

        //输出注册用户信息
        System.out.println("RegisterListener 注册信息，用户名："+user.getName()+"，密码："+user.getPassword());
    }
}
