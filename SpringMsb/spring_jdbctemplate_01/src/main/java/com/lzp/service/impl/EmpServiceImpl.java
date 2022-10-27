package com.lzp.service.impl;

import com.lzp.dao.EmpDao;
import com.lzp.pojo.Emp;
import com.lzp.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpDao empDao;

    @Override
    public int findEmpCount() {
        return empDao.findEmpCount();
    }

    @Override
    public Emp findEmpById(int empno) {
        return empDao.findEmpById(empno);
    }

    @Override
    public List<Emp> finByDeptno(int deptno) {
        return empDao.findByDeptno(deptno);
    }
}
