package com.lzp.dao.impl;

import com.lzp.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public int addUser(int useId, String userName) {
        System.out.println("userDao add ... ... ");
        return 1;
    }
}
