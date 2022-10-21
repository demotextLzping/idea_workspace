package com.lzp.test;

import com.lzp.bean.Book;
import com.lzp.bean.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test3 {
    @Test
    public  void test(){
        ApplicationContext appCon = new ClassPathXmlApplicationContext("applicationContext4.xml");
        Student student = (Student) appCon.getBean("student");
        System.out.println(Arrays.toString(student.getBooks()));
        System.out.println(student.getBookList());
        System.out.println(student.getBookSet());
        System.out.println(student.getBookMap());
        System.out.println(student.getListBook());


    }
    @Test
    public  void test2(){
        ApplicationContext appCon = new ClassPathXmlApplicationContext("applicationContext4.xml");
        Student student = (Student) appCon.getBean("student2");
        System.out.println(student.getListBook());

    }
}
