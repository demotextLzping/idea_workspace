package com.test.collection6;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/22 9:40
 * 通配符
 */
public class Test {
//    public void a(List<Object> list){}
//    public void a(List<String> list){}
//    public void a(List<Integer> list){}

    public  void a(List<?> list){
        //遍历的时候使用Object类型
        for (Object o:list) {
            System.out.println(o);
        }
        //2.数据的写入
        //出错，不能随意的添加数据
//        list.add(asd);
//        list.add("ads");
        //3.数据的读取
        //能够进行读取操作
        Object o=list.get(0);

    }

    public static void main(String[] args) {

        //引入通配符
        List<Object> list1=new ArrayList<>();
        List<String> list2=new ArrayList<>();
        List<Integer> list3=new ArrayList<>();

        //加入通配符之后，list是Object的类型的，是其他类型父类，能指向子类对象了
        List<?> list=null;
        list=list1;
        list=list2;
        list=list3;
    }
}
class demo {
    public static void main(String[] args) {
            Test t=new Test();
            t.a(new ArrayList<Integer>());
            t.a(new ArrayList<String>());
            t.a(new ArrayList<Object>());
    }
}