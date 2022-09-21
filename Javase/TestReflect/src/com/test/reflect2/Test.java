package com.test.reflect2;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/31 18:38
 */
public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        //获取字节码信息的四种方式

        //方式 1 通过getClass方法
        Person person = new Person();
        Class c1 = person.getClass();
        System.out.println(c1);

        //方式 2 通过内置的Class属性
        Class c2=Person.class;
        System.out.println(c2);

        //方式 3  通过Class类提供的静态方法forName
        Class c3 = Class.forName("com.test.reflect2.Person");
        System.out.println(c3);

        //方式 4 利用类的加载器
        ClassLoader loader = Test.class.getClassLoader();  //获取的是系统的类加载器
        Class c4 = loader.loadClass("com.test.reflect2.Person");
        System.out.println(c4);

        System.out.println(c1==c2&&c3==c4);

    }
}
