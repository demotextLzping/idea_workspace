package com.test.reflect2;

import java.lang.annotation.Annotation;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/8/1 9:26
 */
public class Test5 {
    public static void main(String[] args) {
        //获取字节码信息
        Class cls=Student.class;

        //获取接口
        Class[] interfaces = cls.getInterfaces();
        for (Class c:interfaces) {
            System.out.println(c);
        }

        System.out.println("=========================");
        //获取父类的接口
        //先获取父类的字节码信息
        Class superclass = cls.getSuperclass();
        Class[] interfaces1 = superclass.getInterfaces();
        for (Class c: interfaces1) {
            System.out.println(c);
        }

        System.out.println("=========================");
        //获取运行时所在的包
        Package aPackage = cls.getPackage();
        System.out.println(aPackage);
        System.out.println(aPackage.getName());

        System.out.println("=========================");
        //获取运行时的注解
        Annotation[] annotations = cls.getAnnotations();
        for (Annotation a:annotations) {
            System.out.println(a);
        }

    }
}
