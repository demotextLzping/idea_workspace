package com.test.collection7;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/22 10:17
 */
public class Test {
    public static void main(String[] args) {
        List<Object> a=new ArrayList<>();
        List<Person> b=new ArrayList<>();
        List<Student> c=new ArrayList<>();

        /*
        开始使用泛型受限 : 泛型的上限
        List<? extends Person> 是List<Person>的父类，也是List<Student>的父类
         */
        List<? extends Person> list1=null;
//        list1=a;   不可使用
        list1=b;
        list1=c;


        /*
        开始使用泛型受限 : 泛型的下限
        List<? super Person> 是List<Person>的父类，也是List<Person的父类>的父类
         */
        List<? super Person> list2=null;
        list2=a;
        list2=b;
//        list2=c;   不可使用



    }
}
