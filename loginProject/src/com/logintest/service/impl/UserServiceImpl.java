package com.logintest.service.impl;

import com.logintest.dao.UserDao;
import com.logintest.dao.impl.UserDaoImpl;
import com.logintest.entity.User;
import com.logintest.service.UserService;

public class UserServiceImpl implements UserService {
    UserDao userDao=new UserDaoImpl();
    @Override
    public User checkUser(User user) {
        return userDao.checkUser(user);
    }
}
