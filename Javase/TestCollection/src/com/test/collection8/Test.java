package com.test.collection8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/26 11:40
 * Collections工具类
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<String>   list1= new ArrayList<>();
        list1.add("aa");
        list1.add("bb");
        list1.add("cc");
        System.out.println("list1  : "+list1);

        //addAll()
        Collections.addAll(list1,"dd","ee","ff");
        System.out.println("addAll : "+list1);

        Collections.addAll(list1,new String[]{"gg","hh","ii"});
        System.out.println("addAll : "+list1);

        //sort()肾升序排列
        Collections.sort(list1);
        System.out.println("sort : "+list1);

        //binarySearch 必须在有序的集合中查找
        System.out.println("binarySearch : "+Collections.binarySearch(list1,"dd"));

        //copy()替换，讲新的集合替换到旧的集合上，按照同索引替换
        ArrayList<String>   list2= new ArrayList<>();
        list2.add("tt");
        list2.add("tt");
        list2.add("tt");
        Collections.copy(list1,list2);
        System.out.println("list1.copy() : "+list1);
        System.out.println("list2.copy() : "+list2);

        //fill() 填充，将集合元素全部填充为指定元素'
        Collections.fill(list1,"gg");
        System.out.println("fill : "+list1);
    }
}
