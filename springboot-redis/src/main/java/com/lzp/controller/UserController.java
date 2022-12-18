package com.lzp.controller;

import com.lzp.pojo.User;
import com.lzp.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * @author: LZPing
 * @date: 2022-12-07 15:34
 * @Description
 */
@Controller
public class UserController {
    @Autowired
    private UserServiceImpl userService;

    @RequestMapping("/show")
    public String test_mybatis(Integer id, Model model) {
        User user = userService.findById(id);
        model.addAttribute("user", user);
        System.out.println(user);
        return "show";
    }
}
