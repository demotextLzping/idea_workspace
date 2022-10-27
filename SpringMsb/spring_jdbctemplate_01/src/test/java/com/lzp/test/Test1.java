package com.lzp.test;

import com.lzp.pojo.Emp;
import com.lzp.service.impl.EmpServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test1 {
    @Test
    public void test() {
        ApplicationContext appCon = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmpServiceImpl empServiceImpl = appCon.getBean("empServiceImpl", EmpServiceImpl.class);
        int row = empServiceImpl.findEmpCount();
        System.out.println("员工数量 : " + row);
    }

    @Test
    public void test2() {
        ApplicationContext appCon = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmpServiceImpl empServiceImpl = appCon.getBean("empServiceImpl", EmpServiceImpl.class);
        Emp emp = empServiceImpl.findEmpById(7654);
        System.out.println(emp);
    }

    @Test
    public void test3() {
        ApplicationContext appCon = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmpServiceImpl empServiceImpl = appCon.getBean("empServiceImpl", EmpServiceImpl.class);
        List<Emp> emps = empServiceImpl.finByDeptno(20);
        emps.forEach(System.out::println);

    }
}
