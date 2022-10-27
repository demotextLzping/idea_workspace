package com.lzp.test;

import com.lzp.pojo.Dept;
import com.lzp.service.DeptService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test2 {
    @Test
    public void test() {
        ApplicationContext appCon = new ClassPathXmlApplicationContext("applicationContext.xml");
        DeptService deptService = appCon.getBean(DeptService.class);
        List<Dept> depts = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            depts.add(new Dept(null, "name" + i, "loc" + i));
        }
        int[] ints = deptService.deptBatchAdd(depts);
        System.out.println(Arrays.toString(ints));

    }

    @Test
    public void test2() {
        ApplicationContext appCon = new ClassPathXmlApplicationContext("applicationContext.xml");
        DeptService deptService = appCon.getBean(DeptService.class);
        List<Dept> depts = new ArrayList<>();
        for (int i = 51; i < 56; i++) {
            depts.add(new Dept(i, "new_name" + i, "new_loc" + i));
        }
        int[] ints = deptService.deptBatchUpdate(depts);
        System.out.println(Arrays.toString(ints));
    }

    @Test
    public void test3() {
        ApplicationContext appCon = new ClassPathXmlApplicationContext("applicationContext.xml");
        DeptService deptService = appCon.getBean(DeptService.class);
        List<Integer> depts = new ArrayList<>();
        for (int i = 51; i < 56; i++) {
            depts.add(i);
        }
        int[] ints = deptService.deptBatchDelete(depts);
        System.out.println(Arrays.toString(ints));

    }
}
