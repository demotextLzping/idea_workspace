package com.lzp.test;

import com.lzp.bean.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    //    lazy-init
    @Test
    public void test() {
        ApplicationContext appCon = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user1 = (User) appCon.getBean("user1");
        System.out.println(user1);
    }

    //    scope
    @Test
    public void test2() {
        ApplicationContext appCon = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user1 = (User) appCon.getBean("user1");
        User user2 = (User) appCon.getBean("user1");
        System.out.println(user1 == user2);
    }

    //无参构造注入
    @Test
    public void test3() {
        ApplicationContext appCon = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user2 = (User) appCon.getBean("user2");
        System.out.println(user2);
    }

    //有参构造注入
    @Test
    public void test4() {
        ApplicationContext appCon = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user3 = (User) appCon.getBean("user3");
        User user4 = (User) appCon.getBean("user4");
        User user5 = (User) appCon.getBean("user5");
        User user6 = (User) appCon.getBean("user6");
        System.out.println(user3);
        System.out.println(user4);
        System.out.println(user5);
        System.out.println(user6);
    }

    //空值和符号
    @Test
    public void test5() {
        ApplicationContext appCon = new ClassPathXmlApplicationContext("applicationContext2.xml");
        User user = (User) appCon.getBean("user");
        System.out.println(user);

    }
}
