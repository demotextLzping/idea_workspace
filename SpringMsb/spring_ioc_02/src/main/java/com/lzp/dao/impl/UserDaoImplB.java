package com.lzp.dao.impl;

import com.lzp.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImplB implements UserDao {
    @Override
    public void add() {
        System.out.println("UserDaoImplB");
    }
}
