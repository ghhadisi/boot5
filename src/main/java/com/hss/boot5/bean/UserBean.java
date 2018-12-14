package com.hss.boot5.bean;

import lombok.*;

/*@Getter
@Setter
@ToString*/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserBean {
    //名称
    private String name;
    //年龄
    private int age;
    //家庭住址
    private String address;
}
