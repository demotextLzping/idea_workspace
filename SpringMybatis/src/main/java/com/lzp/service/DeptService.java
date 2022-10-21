package com.lzp.service;

import com.lzp.pojo.Dept;

import java.util.List;

public interface DeptService {
    int insertDept(Dept dept);

    int deleteDept(Integer deptno);

    List<Dept> selectAll();
}
