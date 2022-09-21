package com.test.collection5;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/22 9:30
 */
public class Test {
    public static void main(String[] args) {
        Object obj=new Object();
        String str=new String();
        obj=str;//多态的一种形式，父类对象指向子类实例化

        Object[] objArr=new Object[10];
        String[] strArr=new String[10];
        objArr=strArr;//多态的一种形式，父类对象指向子类实例化

        List<Object> list1=new ArrayList<>();
        List<String> list2=new ArrayList<>();
//        list1=list2;
        //A和B是子类继承父类的关系，但是在泛型中G<A>和G<B>不触怒在继承关系，它们是并列关系
    }
}
