package com.test.Set;

import java.util.HashSet;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/25 9:21
 * Set接口
 */
public class Test {
    public static void main(String[] args) {
        //元素唯一且无序
        //创建一个和HashSet<Integer>集合
        HashSet<Integer> h = new HashSet<>();
        h.add(12);
        h.add(22);
        h.add(13);
        h.add(12);
        System.out.println("HashSet<Integer>集合的长度 : "+h.size());
        System.out.println(h);

        //创建一个和HashSet<String>集合
        HashSet<String> h2 = new HashSet<>();
        h2.add("aa");
        h2.add("bb");
        h2.add("cc");
        h2.add("aa");
        System.out.println("HashSet<String>集合的长度 : "+h2.size());
        System.out.println(h2);
    }
}
