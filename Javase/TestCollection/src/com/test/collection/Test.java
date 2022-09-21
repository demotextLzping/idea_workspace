package com.test.collection;

import java.util.*;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/21 12:58
 * Collection 的常用方法
 */
public class Test {
    public static void main(String[] args) {
        //接口不能创建对象 ，但是可以利用实现类创建对象
        Collection col=new ArrayList();
        /*
         * 集合只能存放引用数据类，不能存放基本跟数据类型
         * 在存放基本数据类型的时候，会自动装箱成对应的包装类
         */
        //增加
        //1.add（E e）  添加元素
        col.add(12);
        col.add(13);
        col.add(14);
        col.add(15);
        System.out.println(col);

        //2.addAll(Collection<? extend E> c)  将另一个集合添加到的集合中
        List list= Arrays.asList(new Integer[]{11, 13, 14, 15});
        col.addAll(list);
        System.out.println(col);

        //删除
        //1.clear()  清空集合全部元素
        //ol.clear();
        //System.out.println(col);

        //2.remove(Object o)  删除集合某个元素(第一次出现的位置删除)
        col.remove(15);
        System.out.println("移除某个元素后的集合"+col);

        //查看
        //1.iterator() 迭代器
        System.out.print("迭代器输出集合的元素: ");
        Iterator iterator = col.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println();

        //2.增强for循环(数据类型统一)
        System.out.print("增强for循环输出集合");
        for (Object o:col) {
            System.out.print(o+" ");

        }
        System.out.println();
        //3.size()  集合的大小
        System.out.println("集合的大小:  "+col.size());

        //修改
        //1.contains(Object o)  集合是否包含某个元素
        System.out.println("集合是否包含元素11: "+col.contains(11));

        //2.equals(Object o)  比较集合是否相等（对应索引的袁术值）
        Collection col2=Arrays.asList(new Integer[]{12, 13, 14, 11, 13, 14, 15});
        System.out.println("集合是否相等(元素)"+col.equals(col2));
        System.out.println("集合是否相等(地址)" +(col==col2));

        //3.isEmpty()  集合是否为空
        System.out.println("集合是否为空: "+col.isEmpty());
    }
}
