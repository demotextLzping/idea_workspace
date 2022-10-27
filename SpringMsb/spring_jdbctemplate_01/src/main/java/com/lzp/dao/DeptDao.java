package com.lzp.dao;

import com.lzp.pojo.Dept;

import java.util.List;

public interface DeptDao {
    int[] deptBatchAdd(List<Dept> depts);

    int[] deptBatchUpdate(List<Dept> depts);

    int[] deptBatchDelete(List<Integer> deptnos);
}
