package com.lzp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author： LZPing
 * @date： 2022-11-11 20:33
 * @Description 异常处理
 */
@Controller
public class ExceptionController {
    @RequestMapping("/testException")
    public String testException() {
        int i = 1 / 0;
        return "success.jsp";
    }

    @RequestMapping("/testException2")
    public String testException2() {
        String s = null;
        System.out.println(s.length());
        return "success.jsp";
    }

    /*
    异常处理
    ****Exception.class对某类异常进行处理
    Exception.class 对全部异常进行处理
     */
//    @ExceptionHandler(value = {ArithmeticException.class/*, NullPointerException.class*/})
//    public ModelAndView HandlerException() {
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("exception.jsp");
//        return modelAndView;
//    }
}
