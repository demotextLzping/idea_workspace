package com.test.LinkedList3;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/25 8:58
 * LinkIterator迭代器
 */
public class Test {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("aa");
        list.add("bb");
        list.add("cc");
        list.add("dd");

        //在dd后面添加ee
//        Iterator<String> it = list.iterator();
//        while(it.hasNext()){
//            if("dd".equals(it.next())){
//                list.add("ee");
//            }
//
//        }

        //使用LinkIterator迭代器 同时遍历和添加数据
        ListIterator<String> it = list.listIterator();
        while(it.hasNext()){
            if("dd".equals(it.next())){
                it.add("ee");
            }
        }
        System.out.println(list);
    }
}
