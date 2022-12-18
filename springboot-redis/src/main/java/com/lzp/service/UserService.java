package com.lzp.service;

import com.lzp.pojo.User;
import org.springframework.stereotype.Component;

/**
 * @author: LZPing
 * @date: 2022-12-07 15:31
 * @Description
 */
@Component
public interface UserService {
    public User findById(Integer id);
}
