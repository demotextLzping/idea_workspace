package com.lzp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author： LZPing
 * @date： 2022-11-04 19:47
 * @Description 获取请求参数（紧耦合方式，解耦合方式）
 */
@RestController
public class testDataController {
    /**
     * 紧耦合方式参数注入
     * 使用传统的httpServletRequest对象获取参数  javax.servlet
     */
    @RequestMapping("getParamByRequest.do")
    public String getParam1(HttpServletRequest request, HttpServletResponse response) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("username : " + username + " password : " + password);
        return "getParamSuccess";
    }

    /**
     * 解耦合方式参数注入
     * HttpServletRequest对象获取参数 通过springMVC框架功能自动转换类型
     * 处理单元的参数列表和请求中的参数名一致，如果不一致可以使用RequestParam调用
     * 也有自动类型转换功能
     */
    @RequestMapping("getParamByArgName.do")
    public String getParam2(String username, @RequestParam("pwd") String password) {
        System.out.println("username : " + username + " password : " + password);
        return "getParamSuccess";
    }

}
