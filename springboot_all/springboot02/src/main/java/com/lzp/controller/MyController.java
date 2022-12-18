package com.lzp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author： LZPing
 * @date： 2022-11-19 16:27
 * @Description
 */
@Controller
public class MyController {
    @RequestMapping("secondController")
    @ResponseBody
    public String firstController() {
        return "hello springboot";
    }
}
