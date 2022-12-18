package com.lzp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author： LZPing
 * @date： 2022-11-04 12:22
 * @Description 控制请求头和请求行
 */
@Controller
public class MyController2 {
//    //测试控制请求头
    @RequestMapping(value = "/testHeader",headers={"Connection=keep-alive"})
    public String testHeaderMethod() {
        return "staticPage";
    }
    //测试控制请求行
    @RequestMapping(value = "/testParam", params = {"username=123"})
    public String testParamMethod() {
        return "staticPage";
    }

}
