package com.test.TreeSet;

import java.util.TreeSet;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/25 11:08
 * TreeSet的使用
 */
public class Test {
    public static void main(String[] args) {
        //创建TreeSet<Integer>集合
        TreeSet<Integer> ti = new TreeSet<>();
        ti.add(10);
        ti.add(11);
        ti.add(1);
        ti.add(9);
        ti.add(9);
        System.out.println(ti.size());
        System.out.println(ti);

        //创建TreeSet<String>集合
        TreeSet<String> ts = new TreeSet<>();
        ts.add("lili");
        ts.add("nana");
        ts.add("tt");
        ts.add("lili");
        ts.add("nana");
        System.out.println(ts.size());
        System.out.println(ts);




    }
}
