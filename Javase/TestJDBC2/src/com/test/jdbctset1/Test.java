package com.test.jdbctset1;

import com.test.dao.Impl.EmpDaoImpl;
import com.test.pojo.Emp;

import java.sql.Date;

/**
 * @author lzp
 * @version 1.0
 * @date 2022/8/12 13:19
 */
public class Test {
    public static void main(String[] args) {
        EmpDaoImpl empDao=new EmpDaoImpl();
//        Emp emp=new Emp("olive","clerk",7782,new Date(System.currentTimeMillis()),2000.0,100.0,30);
//        int row = empDao.addEmp(emp);
//        System.out.println(row);

//        int row = empDao.deleteByEmpno(7937);
//        System.out.println(row);

        EmpDaoImpl emp=new EmpDaoImpl();
        emp.showAll();
    }
}
