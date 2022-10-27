package com.lzp.service.impl;

import com.lzp.dao.DeptDao;
import com.lzp.pojo.Dept;
import com.lzp.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptDao deptDao;

    @Override
    public int[] deptBatchAdd(List<Dept> depts) {
        return deptDao.deptBatchAdd(depts);
    }

    @Override
    public int[] deptBatchUpdate(List<Dept> depts) {
        return deptDao.deptBatchUpdate(depts);
    }

    @Override
    public int[] deptBatchDelete(List<Integer> deptnos) {
        return deptDao.deptBatchDelete(deptnos);
    }
}
