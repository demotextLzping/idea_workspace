package com.testenum;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/15 10:21
 * 枚举测试类，
 */
public class Test {
    public static void main(String[] args) {
        //通过静态对象通过 类名.对象名调用
        Season spring=Season.SPRING;
        System.out.println(spring);
    }
}
