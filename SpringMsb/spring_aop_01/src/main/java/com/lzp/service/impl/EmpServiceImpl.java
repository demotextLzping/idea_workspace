package com.lzp.service.impl;

import com.lzp.dao.EmpDao;
import com.lzp.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpDao empDao;

    @Override
    public int addEmp(int empno, String name, String job) {
        System.out.println("empService add ... ...");
        empDao.addEmp(empno,name,job);
        return 1;
    }
}
