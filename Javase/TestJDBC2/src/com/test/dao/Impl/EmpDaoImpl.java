package com.test.dao.Impl;

import com.test.dao.BaseDao;
import com.test.dao.EmpDao;
import com.test.pojo.Emp;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author lzp
 * @version 1.0
 * @date 2022/8/12 12:52
 */
public class EmpDaoImpl extends BaseDao implements EmpDao {
    @Override
    public int addEmp(Emp emp) {
            String sql ="insert into emp values(null,?,?,?,?,?,?,?)";
            return baseUpdate(sql,emp.getEname(),emp.getJob(),emp.getMgr(),emp.getHiredate(),emp.getSal(),emp.getComm(),emp.getDeptno());
    }
    @Override
    public int deleteByEmpno(int empno) {
        String sql ="delete from  emp where empno=?";
        return baseUpdate(sql,empno);
    }
    @Override
    public List<Emp> showAll() {
        String sql ="select * from emp";
        return baseQuery(Emp.class,sql);
    }
    @Override
    public int updateEmp(Emp emp) {
        String sql ="update emp set ename=?,job=?,mgr=?,hiredate=?,sal=?,comm=?,deptno=? where empno=?";
        return baseUpdate(sql,emp.getEname(),emp.getJob(),emp.getMgr(),emp.getHiredate(),emp.getSal(),emp.getComm(),emp.getDeptno(),emp.getEmpno());
    }
}
