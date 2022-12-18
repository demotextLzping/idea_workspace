package com.lzp.controller;

import com.lzp.pojo.User;
import com.lzp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

/**
 * @author： LZPing
 * @date： 2022-11-08 09:38
 * @Description
 */

/*
request ,session 这两个域直接放在参数列表上就可以了，springmvc会给我们自动注入
ServletContext不能直接放在参数列表上，需要通过request.getServletContext();方法获得
 */
@Controller
public class ScopeController {
    @Autowired
    private UserService userService;

    @RequestMapping("showData.do")
    public String setData(HttpServletRequest request, HttpSession session) {
        List<User> user = userService.findAllUser();

        request.setAttribute("message", "requestMessage");
        request.setAttribute("user", user);

        session.setAttribute("message", "sessionMessage");
        session.setAttribute("user", user);

        ServletContext application = request.getServletContext();
        application.setAttribute("message", "applicationMessage");
        application.setAttribute("user", user);
        return "/showDataPage.jsp";

    }

    /*
    model对象是addAttribute
    主要是对请求域床底数据进行了api上的封装
    降低了controller和servlet 之间的耦合度
    重定向是无法使用model传递域中的数据
    model中的字符串的键值对信息会转换为请求参数转发给目标文件
     */


    @RequestMapping("showData2.do")
    public String setData(Model model) {
        List<User> user = userService.findAllUser();

        model.addAttribute("message", "requestMessage");
        model.addAttribute("user", user);
        return "redirect:/showDataPage.jsp";

    }

    @RequestMapping("showData3.do")
    public ModelAndView setData3() {
        ModelAndView mv = new ModelAndView();
        Map<String, Object> model = mv.getModel();
//        向request域中放入数据
        List<User> user = userService.findAllUser();
        model.put("message", "requestMessage");
        model.put("user", user);
        //设置视图
//        mv.setViewName("forward:/showDataPage.jsp");
        mv.setViewName("redirect:/showDataPage.jsp");
        return mv;
    }
}
