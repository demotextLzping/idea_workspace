package com.test.collection;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/21 18:08
 * 泛型
 */
public class Test3 {
    public static void main(String[] args) {
        //创建ArrayList对象al
        ArrayList<Integer> al = new ArrayList<>();
        //添加元素
        al.add(12);
        al.add(13);
        al.add(14);
        al.add(15);
//        al.add(12.8); 不是Integer类型的元素无法添加
        //遍历集合
        Iterator iterator = al.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println();
    }
}
