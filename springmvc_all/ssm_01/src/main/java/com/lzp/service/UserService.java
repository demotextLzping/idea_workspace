package com.lzp.service;

import com.lzp.pojo.User;

import java.util.List;

/**
 * @author： LZPing
 * @date： 2022-11-06 19:15
 * @Description
 */

public interface UserService{
    User findUser(String name, String pwd);

    List<User> findAllUser();
}
