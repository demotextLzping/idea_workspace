package com.lzp.test;

import com.lzp.bean.Book;
import com.lzp.bean.BookFactory;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test4 {
    @Test
    public  void test() {
        ApplicationContext appCon = new ClassPathXmlApplicationContext("applicationContext5.xml");
        Book book = (Book) appCon.getBean("bookFactory");
        System.out.println(book);
    }
}
