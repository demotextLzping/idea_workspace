package com.lzp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan("com.lzp.mapper") //扫描mapper层，等同于在mapper层加@Mappe注解
public class SpringbootMyBatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMyBatisApplication.class, args);
    }

}
