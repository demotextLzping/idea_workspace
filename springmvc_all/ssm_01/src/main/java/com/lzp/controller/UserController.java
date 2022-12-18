package com.lzp.controller;

import com.lzp.pojo.User;
import com.lzp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author： LZPing
 * @date： 2022-11-06 19:14
 * @Description
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("login.do")
    public String login(String name, String pwd) {
        String view = "";
        User user = userService.findUser(name, pwd);
        if (null != user) {
            view = "/success.jsp";
        } else {
            view = "/failed.jsp";
        }
        return view;
    }

    @ResponseBody
    @RequestMapping("findAllUser.do")
    public List<User> findAllUser() {
        return userService.findAllUser();
    }
}
