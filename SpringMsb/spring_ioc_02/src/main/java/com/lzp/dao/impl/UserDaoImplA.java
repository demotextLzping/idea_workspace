package com.lzp.dao.impl;

import com.lzp.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImplA  implements UserDao {
    @Override
    public void add() {
        System.out.println("UserDaoImplA");
    }
}
