package com.test.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/21 13:54
 * List集合的常用方法
 */
public class Test2 {
    public static void main(String[] args) {
        //List是接口不能创建对象，通过ArrayLIstanbul实现类创建对象
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add("abc");

        //增加
        //1.add（int index,E element） 在指定位置插入元素
        list.add(2,99);
        System.out.println("插入元素后的集合:"+list);

        //删除
        //1.remove(int index) 删除指定索引位置的元素
        list.remove(2);
        System.out.println("移除索引为2元素后的集合:"+list);

        //2.remove(Object o)  删除指定元素（第一次出翔的位置）
        list.remove("abc");
        System.out.println("移除指定元素: "+list);

        //查看
        //1.get(int index) 查看指定索引位置的元素
        int num= (int) list.get(2);
        System.out.println("索引为2的元素值是: "+num);


        //2.普通for循环遍历
        System.out.print("普通for循环遍历");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");

        }
        System.out.println();

        //3.增强for循环遍历
        System.out.print("普通for循环遍历");
        for (Object i:list) {
            System.out.print(i+" ");
        }
        System.out.println();

        //4.iterator()迭代器
        System.out.print("迭代器输出集合的元素: ");
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println();


        //修改
        //1.set(int index,E element)
        list.set(2,99);
        System.out.println("修改元素值后的集合: "+list);
    }
}
