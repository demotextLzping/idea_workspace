package com.lzp.test;

import com.lzp.bean.Cat;
import com.lzp.bean.Mouse;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {

    @Test
    public void test() {
        ApplicationContext appCon = new ClassPathXmlApplicationContext("applicationContext3.xml");
        Mouse mouse1 = (Mouse) appCon.getBean("mouse1");
        System.out.println(mouse1);
        Cat cat1 = (Cat) appCon.getBean("cat1");
        System.out.println(cat1);
        Cat cat2 = (Cat) appCon.getBean("cat2");
        System.out.println(cat2);
        Cat cat3 = (Cat) appCon.getBean("cat3");
        System.out.println(cat3);


    }
}
