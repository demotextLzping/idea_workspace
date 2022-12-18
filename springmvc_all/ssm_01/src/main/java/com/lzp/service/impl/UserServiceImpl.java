package com.lzp.service.impl;

import com.lzp.mapper.UserMapper;
import com.lzp.pojo.User;
import com.lzp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author： LZPing
 * @date： 2022-11-06 19:14
 * @Description
 */
@Transactional
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User findUser(String name, String pwd) {
        return userMapper.findUser(name,pwd);
    }

    @Override
    public List<User> findAllUser() {
        return userMapper.findAllUser();
    }
}
