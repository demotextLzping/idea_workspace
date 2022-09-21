package com.test.reflect;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/31 10:13
 */
public class Test2 {
    public static void main(String[] args) {
        String str = "微信";
        if ("微信".equals(str)) {
            pay(new WeChat())
;        }
        if ("支付宝".equals(str)) {
            new AliPay().payOnline();
        }
    }
    public static void pay(WeChat w){
        w.payOnline();
    }
    public static void pay(AliPay a){
        a.payOnline();
    }
}
