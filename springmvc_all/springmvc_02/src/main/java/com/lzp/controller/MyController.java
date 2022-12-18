package com.lzp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author： LZPing
 * @date： 2022-11-02 20:15
 * @Description 静态资源放行
 */

@Controller
public class MyController {
    @RequestMapping(value = {"/static", "/demo"}, method = {RequestMethod.POST, RequestMethod.GET})
    public String staticController() {
        return "staticPage";
    }
}