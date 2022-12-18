package com.lzp.controller;

import com.lzp.pojo.Emp;
import com.lzp.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

/**
 * @author： LZPing
 * @date： 2022-11-24 10:27
 * @Description
 */
@Controller
public class ThymeleafController {
    @Autowired
    private EmpService empService;

    @RequestMapping("showEmp")
    public String showEmp(Map<String, Object> map) {
        List<Emp> list = empService.findAll();
        map.put("empList", list);
        return "index";
    }

    @RequestMapping("showIndex")
    public String showIndex(Map<String, Object> map) {
        map.put("message", "message");
        return "index";
    }
}
