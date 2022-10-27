package com.lzp.dao.impl;

import com.lzp.dao.EmpDao;
import org.springframework.stereotype.Repository;

@Repository
public class EmpDaoImpl implements EmpDao {

    @Override
    public int addEmp(int empno, String name, String job) {
        System.out.println("empDao add ... ... ");
        return 1;
    }
}
