package com.test.collection3;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/22 8:53
 */

public class Test<A ,B ,C> {
    A name;
    B age;
    C sex;
    //1.多个泛型
    public void a(A m,B n,C x){

    }
    //2.泛型类的构造器
    //这种写法是错的
//    public Test<A ,B ,C>() {
//    }

    //3.不同泛型的引用类型不可以相互赋值
//    public void b(){
//        ArrayList<String> list1=null;
//        ArrayList<Integer> list2=null;
//        list1=list2;
//    }

    //4.泛型如果不指定，对应的类型为Object类型

    //5.泛型类中的静态方法不能使用类的泛型
    //应为静态方法在编译时最先加载到方法区，如果没有指定泛型的类型会造成错误
//    public static void a(A m){
//        return 10;
//    }

    //6.类的泛型未被指定时不能使用E[]直接创建数组
    public void c(){
//        A[] ll=new A[10];
        //通过转换为Object能实现
        A[] i=(A[])new Object[10];

    }


}
