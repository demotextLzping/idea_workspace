package com.logintest.control;

import com.logintest.entity.User;
import com.logintest.service.UserService;
import com.logintest.service.impl.UserServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    UserService userService=new UserServiceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //response，request设置编码格式
        response.setCharacterEncoding("utf-8");
        request.setCharacterEncoding("utf-8");

        String name=request.getParameter("name");
        String pwd=request.getParameter("pwd");
        User user=new User(name,pwd);
        User u=userService.checkUser(user);
        System.out.println("查询结果 : "+u);
        if(u!=null){

            response.sendRedirect("hello");
        }else {
            request.setAttribute("str","用户名或密码错误");
            request.getRequestDispatcher("page").forward(request,response);

        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }
}
