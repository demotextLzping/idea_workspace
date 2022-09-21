package com.test;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ServletContextServlet", value = "/ServletContextServlet")
public class ServletContextServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //获取ServletContext对象
        ServletContext context =this.getServletContext();
        ServletContext context1 = this.getServletConfig().getServletContext();
        ServletContext context2 = request.getSession().getServletContext();
        System.out.println(context==context1);
        System.out.println(context1==context2);
        System.out.println(context2==context);

        //设置属性值
        context.setAttribute("111","zhangsan");

        //获取web.xml文件的属性值
        String value = context.getInitParameter("china");
        System.out.println(value);
        String value2 = context.getInitParameter("hubei");
        System.out.println(value2);
        //获取资源在服务器上的真实路径
        String realPath = context.getRealPath("/context");
        System.out.println(realPath);

        //返回web项目的上下文路径
        String contextPath = context.getContextPath();
        System.out.println(contextPath);


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }
}
