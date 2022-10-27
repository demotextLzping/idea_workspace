package com.lzp.test;

import com.lzp.config.SpringConfig;
import com.lzp.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    @Test
    public void  test(){
        ApplicationContext appCon=new ClassPathXmlApplicationContext("applicationContext2.xml");
        UserServiceImpl userServiceImpl = appCon.getBean("userServiceImpl", UserServiceImpl.class);
        userServiceImpl.add();
    }
    @Test
    public void  test2(){
        ApplicationContext appCon=new AnnotationConfigApplicationContext(SpringConfig.class);
        UserServiceImpl userServiceImpl = appCon.getBean("userServiceImpl", UserServiceImpl.class);
        userServiceImpl.add();
    }
}
