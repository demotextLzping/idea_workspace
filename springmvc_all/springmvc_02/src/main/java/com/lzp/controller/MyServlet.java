package com.lzp.controller;

/**
 * @author： LZPing
 * @date： 2022-11-02 20:15
 * @Description 编程式servlet
 */


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/web")
public class MyServlet {
    @RequestMapping("/firstController.do")
    public String firstController() {
        System.out.println("firstController");
        return "first";
    }
}

