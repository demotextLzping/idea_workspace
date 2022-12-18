package com.lzp.controller;

import com.github.pagehelper.PageHelper;
import com.lzp.pojo.Emp;
import com.lzp.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author： LZPing
 * @date： 2022-11-23 14:48
 * @Description
 */
@Controller
@RequestMapping("emp")
public class EmpController {
    @Autowired
    private EmpService empService;

    @RequestMapping("findAll")
    @ResponseBody
    public List<Emp> findAll() {
        return empService.findAll();
    }
    //通过RestFul风格传递数据
    @RequestMapping("findByPage/{pageNum}/{pageSize}")
    @ResponseBody
    public List<Emp> findByPage(@PathVariable("pageNum") Integer pageNum, @PathVariable("pageSize") Integer pageSize) {
        return empService.findByPage(pageNum,pageSize);
    }
}
