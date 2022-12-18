package com.lzp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.InternalResourceView;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author： LZPing
 * @date： 2022-11-06 10:59
 * @Description 请求转发和响应重定向
 */
@Controller
public class testChangeController {
    //传统方式请求转发和重定向
    @RequestMapping(value = "demo1")
    public void testChangeDemo1(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//       请求妆发
        request.getRequestDispatcher("/forwardPage.jsp").forward(request, response);
//        重定向
//        response.sendRedirect(request.getContextPath()+"/redirectPage.jsp");
    }

    //SpringMVC方式请求转发和重定向
//    在路径之前放上forward:关键字,就是代表请求转发
//    如果路径前的关键字是forward，可以省略不写
    @RequestMapping(value = "demoForward")
    public String testForward() {
        return "forward:/forwardPage.jsp";
    }

    //SpringMVC方式请求转发和重定向
    //在路径之前放上redirect:关键字,就是代表重定向
    // 如果路径前的关键字是redirect，不能省略不写
    @RequestMapping(value = "demoRedirect")
    public String testRedirect() {
        return "redirect:/redirectPage.jsp";
    }


    @RequestMapping(value = "demoView")
    public View testView(HttpServletRequest request) {
        View view = null;
//        请求转发
//        view = new InternalResourceView("/forwardPage.jsp");
//       重定向
        view=new RedirectView(request.getContextPath()+"/redirectPage.jsp");
        return view;
    }

    @RequestMapping(value = "demoModelAndView")
    public ModelAndView testModelAndView(HttpServletRequest request){
        ModelAndView mv = new ModelAndView();
//        请求转发
//        mv.setViewName("forward:/forwardPage.jsp");
//        mv.setView(new InternalResourceView("/forwardPage.jsp"));
//       重定向
//         mv.setViewName("redirect:/redirectPage.jsp");
       mv.setView(new InternalResourceView("/redirectPage.jsp"));
        return mv;
    }

}
