package com.testenum3;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/15 10:47
 */
public class Test {
    public static void main(String[] args) {
        Season autumn = Season.AUTUMN;

        //toString方法
        System.out.println(autumn);

        //value方法  返回枚举类型的数组
        Season[] values=Season.values();
        for (Season s: values) {
            System.out.println(s);
        }

        //valueOf 通过对象的名字获取这个枚举对象
        Season spring=Season.valueOf("SPRING");
        System.out.println(spring);

    }
}
