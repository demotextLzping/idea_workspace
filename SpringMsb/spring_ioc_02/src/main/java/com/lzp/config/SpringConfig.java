package com.lzp.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@ComponentScan(basePackages = "com.lzp")
@PropertySource("classpath:stu.properties")
public class SpringConfig  {
}
