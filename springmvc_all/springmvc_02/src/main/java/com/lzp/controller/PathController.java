package com.lzp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author： LZPing
 * @date： 2022-11-04 16:17
 * @Description PathVariable注解和Rest风格支持
 */
@Controller
public class PathController {
    @RequestMapping("/testPathVariable/{username}/{password}")
    public String testPathVariable(@PathVariable(value = "username") Integer username, @PathVariable(value = "password") String password) {
        System.out.println("username: " + username + "\npassword: " + password);
        return "staticPage";
    }





}
