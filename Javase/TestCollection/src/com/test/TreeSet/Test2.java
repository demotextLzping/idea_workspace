package com.test.TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/25 11:26
 */
public class Test2 {
    public static void main(String[] args) {

        Student s= new Student("alili",22,165.7);
        Student s1= new Student("alili",23,165.7);
        Comparator ct=new OutCompare();
        System.out.println(ct.compare(s,s1));
    }
}
