package com.hss.boot5.listener;

import com.hss.boot5.event.UserRegisterEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class RegisterUserEmailListener {
    /**
     * 发送邮件监听实现
     * @param userRegisterEvent 用户注册事件
     */
    @EventListener
    public void sendMail(UserRegisterEvent userRegisterEvent)
    {
        System.out.println("用户注册成功，发送邮件。");
    }
}
