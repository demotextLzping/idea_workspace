package com.lzp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Calendar;

/**
 * @author： LZPing
 * @date： 2022-11-06 10:52
 * @Description 返回方式为void
 */
@Controller
public class testResponse {
    @RequestMapping(value = "testRes")
    public void testRes(){
        System.out.println("testResponse");
    }

}
