package com.test.Map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/26 9:08
 * HashTable和LinkedHashMap
 */
public class Test2 {
    public static void main(String[] args) {
        //HashMap
        HashMap<String, Integer> map = new HashMap<>();
        map.put(null,1010);
//        map.put(null,1110);
        //只能存入一个null，null做key时也遵循唯一原则
        System.out.println(map);

        //HashTable
        //HashTable是jak1.0的类，HashMap是jdk1.2的类
        //HashTable的key值不能是null，HashMap的key值可以是空的
//        Hashtable<String, Integer> map1 = new Hashtable<>();
//        map1.put(null,1010);

        //LinkedHashMap
        //使用LinkedHashMap输出是有序的，按照输入的顺序进行输出
        LinkedHashMap<String, Integer> map2 = new LinkedHashMap<>();
        map2.put("lili",1010);
        map2.put("nana",1011);
        map2.put("xixi",1012);
        map2.put("jiji",1013);
        System.out.println(map2);



    }
}
