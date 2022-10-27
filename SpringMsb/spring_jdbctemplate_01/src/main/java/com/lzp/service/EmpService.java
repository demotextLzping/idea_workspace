package com.lzp.service;

import com.lzp.pojo.Emp;

import java.util.List;

public interface EmpService {
//    查询员工数量
    int findEmpCount();

    Emp findEmpById(int empno);


    List<Emp> finByDeptno(int deptno);
}
