package com.test2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "NumberServlet", value = "/NumberServlet")
public class NumberServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置编码格式
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        //创建ServletContext对象
        ServletContext context = this.getServletContext();
        //获取键为num的value值
        Integer num =(Integer) context.getAttribute("num");
        //判断是否null，第一次创建为null
        if(num==null){
            context.setAttribute("num", 1);
        }else {
            //num的值自增
            num++;
            context.setAttribute("num",num);
        }
        PrintWriter out = response.getWriter();
        out.write("<html>");
        out.write("<head>");
        out.write("</head>");
        out.write("<body>");
        out.write("<h1>用户访问的次数为"+context.getAttribute("num")+"次</h1>");
        out.write("</body>");
        out.write("</html>");


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }
}
