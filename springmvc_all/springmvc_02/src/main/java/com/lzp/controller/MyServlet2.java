package com.lzp.controller;


/**
 * @author： LZPing
 * @date： 2022-11-02 20:15
 * @Description  注解配置
 */

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

@WebServlet("/myServlet.do")
public class MyServlet2 extends HttpServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        req.getRequestDispatcher("first.jsp").forward(req,res);
    }
}
