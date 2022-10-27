package com.lzp.service.impl;

import com.lzp.dao.UserDao;
import com.lzp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    //    @Autowired
//    @Qualifier(value = "userDaoImplA")
//    private UserDao userDao;
    @Resource(name = "userDaoImplA")
    private UserDao userDao;

    //    普通数据类型赋值
//    @Value("丽丽")
//    private String sName;
//    @Value("男")
//    private String sGender;
//    @Value("20")
//    private Integer sAge;
    @Value("${sName}")
    private String sName;
    @Value("${sGender}")
    private String sGender;
    @Value("${sAge}")
    private Integer sAge;

    @Override
    public void add() {
        System.out.println("UserServiceImpl");
        System.out.println(sName);
        System.out.println(sGender);
        System.out.println(sAge);
        userDao.add();
    }
}
