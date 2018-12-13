package com.hss.boot5.event;

import com.hss.boot5.bean.UserBean;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * @EventListener注解、实现ApplicationListener泛型接口、实现SmartApplicationListener接口等
 */
@Getter
public class UserRegisterEvent extends ApplicationEvent {
    private UserBean user;

    /**
     * 其中source参数指的是发生事件的对象，一般我们在发布事件时使用的是this关键字代替本类对象，
     * 而user参数是我们自定义的注册用户对象，该对象可以在监听内被获取。
     * @param source
     * @param user
     */
    public UserRegisterEvent(Object source,UserBean user) {
        super(source);
        this.user = user;
    }

    public UserBean getUser() {
        return user;
    }
}
