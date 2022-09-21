package com.test.reflect2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/31 19:38
 */
public class Test2 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //获取字节码信息
        Class cls=Student.class;

        //通过字节码信息获取构造器
        // getConstructors只能获取修饰符为public的构造器
        Constructor[] c1 = cls.getConstructors();
        for (Constructor c:c1) {
            System.out.println(c);
        }
        System.out.println("==========================");
        // getConstructors获取全部的构造器
        Constructor[] c2 = cls.getDeclaredConstructors();
        for (Constructor c:c2) {
            System.out.println(c);
        }
        System.out.println("==========================");

        //获取指定的构造器,只能获取修饰符为public的构造器
        //空构造器
        Constructor con1 = cls.getConstructor();
        System.out.println(con1);

        //有参构造器
        Constructor con2 = cls.getConstructor(double.class,double.class);
        System.out.println(con2);

        //获取指定的构造器，获取全部修饰符的构造器
        Constructor con3 = cls.getDeclaredConstructor(double.class,int.class);
        System.out.println(con3);

        System.out.println("==========================");
        //创建对象 con1
        Object o1 =  con1.newInstance();
        System.out.println(o1);

        //con2
        Object o2 = con2.newInstance(180.0,228);
        System.out.println(o2);
    }
}
