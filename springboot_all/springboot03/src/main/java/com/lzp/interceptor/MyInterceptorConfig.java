package com.lzp.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author： LZPing
 * @date： 2022-11-26 15:14
 * @Description
 */
@Configuration
public class MyInterceptorConfig implements WebMvcConfigurer {
    @Autowired
    private MyInterceptor interceptor;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//        addPath 添加拦截路径   excludePath配出拦截路径
        registry.addInterceptor(interceptor).addPathPatterns("/**").excludePathPatterns("/login");
    }
}
