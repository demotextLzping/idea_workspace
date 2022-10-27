package com.lzp.test;

import com.lzp.bean.Emp;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test6 {
    @Test
    public void  test(){
        ClassPathXmlApplicationContext appCon = new ClassPathXmlApplicationContext("applicationContext7.xml");
        Emp emp = appCon.getBean("emp", Emp.class);
        System.out.println(emp);

        Emp emp2 = appCon.getBean("emp2", Emp.class);
        System.out.println(emp2);

        Emp emp3 = appCon.getBean("emp3", Emp.class);
        System.out.println(emp3);

        Emp emp4 = appCon.getBean("emp4", Emp.class);
        System.out.println(emp4);

    }
}
