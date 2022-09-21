package com.test.Set2;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/25 10:34
 * 返回值结果要是int类型
 */
public class Test {
    public static void main(String[] args) {
        //int类型比较大小
        int a=11;
        int b=12;
        System.out.println(a-b);

        //String类型比较大小
        String str1="lucy";
        String str2="miko";
        System.out.println(str1.compareTo(str2));

        //Double类型标胶大小
        double d=99.9;
        double d2=9.22;
        System.out.println(((Double)d).compareTo((Double)d2));

        //自定义类型比较

    }
}
