package com.lzp.test;

import com.lzp.pojo.Dept;
import com.lzp.service.DeptService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.List;

import org.junit.Test;

public class SpringTest {

    @Test
    public void test() throws Exception {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        DeptService deptService=(DeptService) app.getBean("deptServiceImpl");
        List<Dept> depts = deptService.selectAll();
        for (Dept dept : depts) {
            System.out.println(dept.getDeptno()+" "+dept.getDname()+" "+dept.getLoc());
        }
    }

    @Test
    public void test2() throws Exception {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        DeptService deptService=(DeptService) app.getBean("deptServiceImpl");
        int i = deptService.deleteDept(50);
        System.out.println(i>0?"删除成功":"删除失败");
    }

    @Test
    public void test3() throws Exception {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        DeptService deptService=(DeptService) app.getBean("deptServiceImpl");
        Dept dept = new Dept(50,"tech","hangzhou");
        int i = deptService.insertDept(dept);
        System.out.println(i>0?"添加成功":"添加失败");
    }
}
