package com.lzp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author： LZPing
 * @date： 2022-11-11 21:59
 * @Description
 */
@Configuration
public class MyHandlerException implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        ModelAndView mv = new ModelAndView();
        if (e instanceof NullPointerException) {
            mv.setViewName("exception.jsp");
        }
        if (e instanceof ArithmeticException) {
            mv.setViewName("exception.jsp");
        }
        mv.addObject("msg", e.getMessage());
        return mv;
    }
}
