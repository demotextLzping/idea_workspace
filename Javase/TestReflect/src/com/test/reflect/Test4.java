package com.test.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/31 10:30
 */
public class Test4 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        String str="com.test.reflect.WeChat"; //传入全限定名称

        Class<?> cl = Class.forName(str);
        Object o=cl.newInstance();
        Method method=cl.getMethod("payOnline");
        method.invoke(o);

    }
}
