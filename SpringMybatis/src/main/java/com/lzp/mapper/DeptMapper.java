package com.lzp.mapper;

import com.lzp.pojo.Dept;

import java.util.List;

public interface DeptMapper {

    public int insertDept(Dept dept);

    public int deleteDept(Integer deptno);

    public List<Dept> selectAll();


}