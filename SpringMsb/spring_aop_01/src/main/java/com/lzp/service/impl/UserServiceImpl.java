package com.lzp.service.impl;

import com.lzp.aspect.DaoAspect;
import com.lzp.dao.UserDao;
import com.lzp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public int addUser(int useId, String userName) {
        System.out.println("userService add ... ...");
        userDao.addUser(useId,userName);
        return 1;
    }
}
