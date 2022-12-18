package com.lzp.config;

import com.lzp.pojo.Emp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author： LZPing
 * @date： 2022-11-26 15:00
 * @Description
 */
@Configuration
public class MyConfig {
    @Bean
    public Emp getEmp(){
        Emp emp = new Emp();
        emp.setEname("aaa");
        return emp;
    }
}
