package com.hss.boot5;

import com.hss.boot5.bean.UserBean;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class Boot5ApplicationTests {
//    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(Boot5ApplicationTests.class);

    @Test
    public void contextLoads() {
        UserBean user = new UserBean();
        user.setAge(25);
        user.setName("aaaa");
        user.setAddress("address 101");

        UserBean user2 = new UserBean("cc",15,"aa");
        System.out.println(user.toString());
//        System.out.println(user2.toString());
        log.debug(user2.toString());
    }

}
