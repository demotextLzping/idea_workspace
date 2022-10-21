package com.lzp.test;

import com.lzp.bean.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {
    @Test
    public void  test(){
        ClassPathXmlApplicationContext appCon = new ClassPathXmlApplicationContext("applicationContext6.xml");
        User user = appCon.getBean("user", User.class);
        System.out.println("第四步 User获取");
        System.out.println(user);
        appCon.close();
    }
}
