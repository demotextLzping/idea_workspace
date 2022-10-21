package com.lzp.test;

import com.lzp.dao.EmpDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    @Test
    public void getBean(){
        ApplicationContext appCon = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmpDao empDao =(EmpDao) appCon.getBean("empDaoImpl");
        empDao.addEmp();
    }
}
