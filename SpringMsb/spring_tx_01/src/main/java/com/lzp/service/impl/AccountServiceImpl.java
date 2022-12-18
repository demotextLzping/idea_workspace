package com.lzp.service.impl;

import com.lzp.dao.AccountDao;
import com.lzp.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
//添加在类上当前类的全部方法都添加事务管理
//@Transactional(propagation = Propagation.REQUIRED ,isolation = Isolation.DEFAULT,readOnly = true,noRollbackFor = {NullPointerException.class, ClassCastException.class})
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

    @Override
    @Transactional  //添加在方法上只针对这方法添加事务管理
    public int transMoney(int from, int to, double money) {
        int rows = 0;
//        转出操作
        rows += accountDao.transMoney(from, 0 - money);
//        模拟异常
//        int i=1 / 0;
//        转入操作
        rows += accountDao.transMoney(to, money);
        return rows;
    }
}
