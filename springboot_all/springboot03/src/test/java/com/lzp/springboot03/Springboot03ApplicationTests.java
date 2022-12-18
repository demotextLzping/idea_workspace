package com.lzp.springboot03;

import com.lzp.config.MyConfig;
import com.lzp.pojo.Emp;
import com.lzp.service.EmpService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Springboot03ApplicationTests {
    @Autowired
    private EmpService empService;
    @Autowired
    private Emp  emp;

    @Test
    void contextLoads() {
//        List<Emp> list = empService.findAll();
//        list.forEach(System.out::println);
        System.out.println(emp);
    }

}
