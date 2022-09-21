package com.test;

import jdk.internal.util.xml.impl.Input;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author lzp
 * @version 1.0
 * @date 2022/8/30 11:00
 */
public class MyRequest {
    private String requestUrl;
    private String requestMethod;

    public MyRequest(InputStream inputSteam) throws Exception {
        byte[] buffer=new byte[1024];
        int len=0;
        String str= null;
        if((len=inputSteam.read(buffer))>0){
            str=new String(buffer,0,len);
        }
        String data=str.split("\n")[0];
        String []params=data.split(" ");
        this.requestMethod=params[0];
        this.requestUrl=params[1];
    }

    public String getRequestUrl() {
        return requestUrl;
    }

    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
    }

    public String getRequestMethod() {
        return requestMethod;
    }

    public void setRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod;
    }
}
