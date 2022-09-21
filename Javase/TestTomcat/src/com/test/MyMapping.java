package com.test;

import java.util.HashMap;

/**
 * @author lzp
 * @version 1.0
 * @date 2022/8/30 12:04
 */
public class MyMapping {
    private static HashMap<String,String> mapping=new HashMap<>();

    static {
        mapping.put("/mytomcat","com.test.MyServlet");
    }

    public  HashMap<String,String> getMapping(){
        return mapping;
    }
}
