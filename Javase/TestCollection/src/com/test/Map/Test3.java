package com.test.Map;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/26 9:21
 * TreeMap实现类
 */
public class Test3 {
    public static void main(String[] args) {
        //外部构造器
        TreeMap<Student, Integer> tm = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return ((Double)(o1.getHeight())).compareTo((Double)(o2.getHeight()));
            }
        });
        tm.put(new Student("lili",18,175.0),10000);
        tm.put(new Student("blili",19,173.0),10001);
        tm.put(new Student("clili",17,172.0),10002);
        tm.put(new Student("dlili",18,176.0),10003);
        tm.put(new Student("lili",18,175.0),10000);
        System.out.println(tm.size());
        System.out.println(tm);


    }
}
