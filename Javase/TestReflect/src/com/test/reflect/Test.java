package com.test.reflect;/**
*@author lzp
*@data 2022/7/31 9:56
*@version 1.0
*
*/public class Test {
    public static void main(String[] args) {
        String str = "微信";
        if ("微信".equals(str)) {
            new WeChat().payOnline();
        }
        if ("支付宝".equals(str)) {
            new AliPay().payOnline();
        }
    }
}
