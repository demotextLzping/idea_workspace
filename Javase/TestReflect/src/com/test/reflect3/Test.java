package com.test.reflect3;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/31 19:04
 */
public class Test {
    public static void main(String[] args) {
        //Class类的具体实例：
        //（1）类：外部类，内部类
        Class c1=Test.class;
        //（2）接口
        Class c2=Comparable.class;
        //（3）注释
        Class c3=Override.class;
        //（4）数组
        int[] arr1={1,2,3};
        Class c4=arr1.getClass();
        int[] arr2={4,5,6};
        Class c5=arr1.getClass();
        System.out.println(c4==c5);//结果是true，同一纬度，同意元素类型，得到的字节码就是同一个
        //（5）基本数据类型
        Class c6 = int.class;
        //（6）void
        Class c7 = void.class;
    }
}
