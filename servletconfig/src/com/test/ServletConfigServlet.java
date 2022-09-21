package com.test;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet(name = "ServletConfigServlet", value = "/ServletConfigServlet")
public class ServletConfigServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取config对象
        ServletConfig config = this.getServletConfig();
        //获取值
        String value = config.getInitParameter("china");
        System.out.println(value);

        //获取全部的属性值
        Enumeration<String> initParameterNames = config.getInitParameterNames();
        while(initParameterNames.hasMoreElements()){
            String key=initParameterNames.nextElement();
            String value2=config.getInitParameter(key);
            System.out.println(key+"  : "+value2);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }
}
