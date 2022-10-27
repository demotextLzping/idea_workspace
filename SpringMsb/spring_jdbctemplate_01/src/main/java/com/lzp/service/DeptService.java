package com.lzp.service;

import com.lzp.pojo.Dept;

import java.util.List;

public interface DeptService {
    int[] deptBatchAdd(List<Dept> depts);
    int[] deptBatchUpdate(List<Dept> depts);

    int[] deptBatchDelete(List<Integer> deptnos);
 }
