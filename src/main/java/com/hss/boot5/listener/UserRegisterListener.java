package com.hss.boot5.listener;

import com.hss.boot5.bean.UserBean;
import com.hss.boot5.event.UserRegisterEvent;
import com.hss.boot5.service.UserService;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.SmartApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * SmartApplicationListener接口继承了全局监听ApplicationListener，并且泛型对象使用的ApplicationEvent来作为全局监听，
 * 可以理解为使用SmartApplicationListener作为监听父接口的实现，监听所有事件发布。
 *
 * SmartApplicationListener接口添加了两个方法supportsEventType、supportsSourceType来作为区分是否是我们监听的事件，
 * 只有这两个方法同时返回true时才会执行onApplicationEvent方法。
 *
 *
 * getOrder方法，这个方法就可以解决执行监听的顺序问题，return的数值越小证明优先级越高，执行顺序越靠前。
 */
@Component
public class UserRegisterListener implements SmartApplicationListener {
    @Override
    public boolean supportsEventType(Class<? extends ApplicationEvent> aClass) {
        //只有UserRegisterEvent监听类型才会执行下面逻辑
        return aClass == UserRegisterEvent.class;
    }


    @Override
    public boolean supportsSourceType(Class<?> sourceType) {
        //只有在UserService内发布的UserRegisterEvent事件时才会执行下面逻辑
        return sourceType == UserService.class;
    }

    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {


        //转换事件类型
        UserRegisterEvent userRegisterEvent = (UserRegisterEvent) applicationEvent;
        //获取注册用户对象信息
        UserBean user = userRegisterEvent.getUser();
        //.../完成注册业务逻辑
        System.out.println("注册信息，用户名："+user.getName()+"，密码："+user.getPassword());
    }

    /**
     * 同步情况下监听执行的顺序
     * @return
     */
    @Override
    public int getOrder() {
        return 0;
    }
}
