package com.test.reflect2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/31 20:49
 */
public class Test4 {
    public static void main(String[] args) throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        //获取字节码信息
        Class cls=Student.class;

        //获取权限修饰符为public的方法全部方法，包括父类的方法，
        Method[] m1 = cls.getMethods();
        for (Method m:m1) {
            System.out.println(m);
        }

        System.out.println("========================================");
        //获取全部权限修饰符的方法,父类无法获取
        Method[] m2 = cls.getDeclaredMethods();
        for (Method m:m2) {
            System.out.println(m);
        }

        System.out.println("========================================");
        //获取指定的的方法,public修饰的方法
        //空参
        Method m3 = cls.getMethod("showInfo");
        System.out.println(m3);
        //有参要指定数据类型
        Method m4 = cls.getMethod("showInfo",int.class,int.class);
        System.out.println(m4);

        System.out.println("========================================");
        //获取指定的的方法,全部的权限修饰的方法
        Method work = cls.getDeclaredMethod("work", int.class, double.class);
        System.out.println(work);

        //获取方法的具体结构
        /*
        @注解
        修饰符 返回值类型 方法名（参数列表） throws 异常{}
         */
        System.out.println("========================================");
        //获取方法名
        System.out.println(work.getName());

        System.out.println("========================================");
        //获取修饰符
        int modifiers = work.getModifiers();
        System.out.println(Modifier.toString(modifiers));

        System.out.println("========================================");
        //返回值
        Class returnType = work.getReturnType();
        System.out.println(returnType);

        System.out.println("========================================");
        //参数列表
        Class[] parameterTypes = work.getParameterTypes();
        for (Class c:parameterTypes) {
            System.out.println(c);
        }

        System.out.println("========================================");
        //获取异常
        Class[] exceptionTypes = work.getExceptionTypes();
        for (Class c:exceptionTypes) {
            System.out.println(c);
        }

        System.out.println("========================================");
        //获取注解
        Annotation[] annotation = work.getDeclaredAnnotations();
        for (Annotation a:annotation) {
            System.out.println(a);
        }

        System.out.println("========================================");
        //调用方法
        //public修饰的空参
        Object o=cls.newInstance();
        Method method = cls.getMethod("showInfo");
        method.invoke(o);

        System.out.println("========================================");
        //public修饰的有参
        Method method2 = cls.getMethod("add",double.class,double.class);
        method2.invoke(o,22.2,33.3);

        System.out.println("========================================");
        //private修饰的
        Method method3 = cls.getDeclaredMethod("work", int.class, double.class);
        method3.setAccessible(true);//private而无法修改，暴力访问
        method3.invoke(o,10,2.2);

    }
}
