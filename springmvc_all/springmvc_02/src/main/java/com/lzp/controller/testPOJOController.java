package com.lzp.controller;

import com.lzp.pojo.Person;
import com.lzp.pojo.Pet;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServlet;
import java.nio.channels.Pipe;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @author： LZPing
 * @date： 2022-11-04 21:09
 * @Description 注入POJO类型数据  //注入Date数据类型  //注入List数据类型
 */
@RestController
public class testPOJOController {
    //    传统注入
//    @RequestMapping("/getDataByPOJO")
//    public String getDataByPOJO(String username,String password ,String gender,String [] hobby,String birthdate){
//        System.out.println(username);
//        System.out.println(password);
//        System.out.println(gender);
//        System.out.println(Arrays.toString(hobby));
//        System.out.println(birthdate);
//        return "getDataByPOJOSuccess";
//    }
//    pojo注入和Date注入
//    @RequestMapping("/getDataByPOJO")
//    public String getDataByPOJO(/*@DateTimeFormat(pattern = "yyyy-MM-dd")*/ Person p) {
//        System.out.println(p);
//        return "getDataByPOJOSuccess";
//    }

    //    List注入
    @RequestMapping(value = "/getDataByPOJO")
    public String getDataByPOJO2(Person p) {
        System.out.println(p);
        System.out.println(p.getPetMap());
        return "getDataByPOJOSuccess";
    }
}


