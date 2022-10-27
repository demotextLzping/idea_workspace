package com.lzp.test;

import com.lzp.config.SpringConfig;
import com.lzp.dao.UserDao;
import com.lzp.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    @Test
    public void test() {
        ApplicationContext appCon = new ClassPathXmlApplicationContext("applicationContext2.xml");
        UserDao userDao = appCon.getBean("userDao", UserDao.class);
        userDao.addUser(1, "zhangsan");
//        EmpServiceImpl empServiceImpl = appCon.getBean("empServiceImpl", EmpServiceImpl.class);
//        empServiceImpl.addEmp(2, "job", "it");
    }


    //    测试配置类
    @Test
    public void test2() {
        ApplicationContext appCon = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserServiceImpl userServiceImp = appCon.getBean("userServiceImpl", UserServiceImpl.class);
        userServiceImp.addUser(1, "zhangsan");
        System.out.println();
    }

    //    测试配置类
}
