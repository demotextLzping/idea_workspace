package com.test.LinkedList3;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/25 9:11
 * 使用LinkIterator反向遍历集合
 */
public class Test2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("aa");
        list.add("bb");
        list.add("cc");
        list.add("dd");


        //使用LinkIterator迭代器正向遍历
        System.out.print("正向遍历集合 : ");
        ListIterator<String> it = list.listIterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();

        //此时游标cursor在最后面
        //使用LinkIterator迭代器反向遍历
        System.out.print("反向遍历集合 : ");
        while(it.hasPrevious()){
            System.out.print(it.previous()+" ");
        }
    }
}
