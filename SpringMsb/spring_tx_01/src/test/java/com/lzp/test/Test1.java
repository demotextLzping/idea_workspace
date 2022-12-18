package com.lzp.test;

import com.lzp.config.SpringConfig;
import com.lzp.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
//    基于注解的事务
    @Test
    public void test1() {
        ApplicationContext appCon = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountService accountService = appCon.getBean(AccountService.class);
        int rows = accountService.transMoney(1, 2, 100);
        System.out.println(rows);
    }
//    基于XML的事务

    @Test
    public void test2() {
        ApplicationContext appCon = new ClassPathXmlApplicationContext("applicationContext2.xml");
        AccountService accountService = appCon.getBean(AccountService.class);
        int rows = accountService.transMoney(1, 2, 100);
        System.out.println(rows);
    }
//    基于零xml的事务
    @Test
    public void test3() {
        ApplicationContext appCon = new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountService accountService = appCon.getBean(AccountService.class);
        int rows = accountService.transMoney(1, 2, 100);
        System.out.println(rows);
    }
}

