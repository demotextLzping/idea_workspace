package com.test.reflect2;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/31 19:57
 */
public class Test3 {
    public static void main(String[] args) throws NoSuchFieldException, InstantiationException, IllegalAccessException {
        //获取字节码信息
        Class cls=Student.class;

        //获取权限修饰符为public的属性
        Field[] f1 = cls.getFields();
        for (Field f:f1 ){
            System.out.println(f);
        }
        System.out.println("==========================");
        //获取全部权限修饰符的属性
        Field[] f2= cls.getDeclaredFields();
        for (Field f:f2) {
            System.out.println(f);
        }
        System.out.println("==========================");


        //获取修饰符为public的指定属性
        Field f3 = cls.getField("sno");
        System.out.println(f3);

        System.out.println("==========================");
        //获取任意修饰符为的指定属性
        Field f4 = cls.getDeclaredField("score");
        System.out.println(f4);

        System.out.println("==========================");
        //获取属性名
        System.out.println(" 获取属性名 :"+f3.getName());

        System.out.println("==========================");
        //获取属性数据类型
        Class type=f3.getType();
        System.out.println(" 获取属性类型 :"+type);

        System.out.println("==========================");
        //获取属性的修饰符
        int modifiers = f3.getModifiers();
        System.out.println("数据类型: "+modifiers+"---"+Modifier.toString(modifiers));

        System.out.println("==========================");
        //给属性赋值(给属性设置值，必须要有对象),只能欸public修饰的赋值
        Field sno=cls.getField("sno");
        Object obj=cls.newInstance();
        sno.set(obj,11101);
        System.out.println(obj);

        System.out.println("==========================");
        //给属性赋值(给属性设置值，必须要有对象),
        //要给其他非public修饰的属性赋值要先暴力访问setAccessible,再设置值
        Field score=cls.getDeclaredField("score");
        Object obj1=cls.newInstance();
        score.setAccessible(true);
        score.set(obj1,100);
        System.out.println(obj1);

    }
}
