package com.lzp.test;

import com.lzp.bean.Student;
import com.lzp.bean.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    @Test
    public void test() {
        ApplicationContext appCon = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student stu1 = appCon.getBean("stu1", Student.class);
        System.out.println(stu1);
        User user1 = appCon.getBean("user1", User.class);
        System.out.println(user1);

    }
}
