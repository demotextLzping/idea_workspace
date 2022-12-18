package com.lzp.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author： LZPing
 * @date： 2022-11-11 16:02
 * @Description
 */

public class MyInterceptor implements HandlerInterceptor {
    /**
     * @param request  请求对象
     * @param response 响应对象
     * @param handler  目标要调用的handler
     * @return 返回true放行
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        /*
        在请求到到达我们定义的handler之前工作的
         */
        System.out.println("MyInterceptor  preHandle");
        /*
        返回的是true代表放行，可以继续到达handler（controller）
         */
        /*
        1.编码处理
        2。判断是否登录
        3.用户权限控制
         */


        return true;
    }

    /*
    在业务代码处理完请求后，但是dispatcherServlet向客户端返回响应前被调用，在该方法中对用户请求的request域进行处理
     */

    /**
     * @param request      请求对象
     * @param response     响应对象
     * @param handler
     * @param modelAndView 视图和数据
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
       /*
       handler 处理单元返回ModelAndView时候进行解析
        */
        System.out.println("MyInterceptor  postHandle");
        /*
        1.修改视图
        2.控制试图
         */
    }

    /**
     *
     * @param request 请求对象
     * @param response 响应对象
     * @param handler
     * @param ex
     * @throws Exception 异常处理
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
         /*
       页面渲染完毕，但是还没有给游览器响应数据的时候
        */
        System.out.println("MyInterceptor  afterCompletion");
        /*
        无论是否出现异常都会执行的一个方法
        1.异常处理
        2.资源关闭
         */
    }
}
