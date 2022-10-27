package com.lzp.dao;

import com.lzp.pojo.Emp;

import java.util.List;

public interface EmpDao {
    int findEmpCount();

    Emp findEmpById(int empno);

    List<Emp> findByDeptno(int deptno);
}
