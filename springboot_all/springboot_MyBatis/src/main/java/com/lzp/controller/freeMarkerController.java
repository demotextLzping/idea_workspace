package com.lzp.controller;

import com.lzp.pojo.Emp;
import com.lzp.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * @author： LZPing
 * @date： 2022-11-23 19:01
 * @Description
 */
@Controller
public class freeMarkerController {

    @Autowired
    private EmpService empService;

    @RequestMapping("/showEmpIf")
    public ModelAndView testIf() {
        ModelAndView mv = new ModelAndView();
        List<Emp> list = empService.findAll();
        mv.addObject("empListIf", list);
        mv.setViewName("showEmpIf");
        return mv;
    }

    @RequestMapping("/showEmpMap")
    public ModelAndView testMap() {
        ModelAndView mv = new ModelAndView();
        List<Emp> list = empService.findAll();
        HashMap<String, Emp> empMap = new HashMap<>();
        for (Emp emp : list) {
            empMap.put(emp.getEmpno().toString(), emp);
        }
        mv.addObject("empMap", empMap);
        mv.setViewName("showEmpMap");
        return mv;
    }

    @RequestMapping("/showEmp")
    public ModelAndView testList() {
        ModelAndView mv = new ModelAndView();
        List<Emp> list = empService.findAll();
        mv.addObject("empList", list);
        mv.setViewName("showEmp");
        return mv;
    }


    @RequestMapping("/showPage")
    public String freemarker(Map<String, Object> map) {
        map.put("name", "zhansan");
        return "show";
    }
}
