package com.lzp.service;

import com.lzp.pojo.User;

import java.util.List;

/**
 * @author： LZPing
 * @date： 2022-11-20 20:26
 * @Description
 */

public interface UserService {
    List<User> findAll();
}
