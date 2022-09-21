package com.test.Set;

import java.util.HashSet;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/25 9:29
 */
public class Test2 {
    public static void main(String[] args) {
        //添加自定义对象Student
        HashSet<Student> h = new HashSet<>();
        h.add(new Student("张三",20));
        h.add(new Student("李四",19));
        h.add(new Student("王五",18));
        h.add(new Student("张三",20));
        System.out.println("集合HashSet<Student>的长度 : "+h.size());
        System.out.println(h);
    }
}
