package com.lzp.controller;

import com.lzp.pojo.User;
import com.lzp.service.UserService;
import com.sun.org.apache.bcel.internal.generic.LSTORE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author： LZPing
 * @date： 2022-11-20 20:24
 * @Description
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("findAll")
    @ResponseBody
    public List<User> findAll() {
        return userService.findAll();
    }


}
