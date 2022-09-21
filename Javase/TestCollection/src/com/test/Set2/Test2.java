package com.test.Set2;

import java.io.OutputStreamWriter;
import java.util.Comparator;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/25 10:41
 */
public class Test2 {
    public static void main(String[] args) {
        Student s = new Student("lili",12,170.0);
        Student s2 = new Student("nana",15,169.0);
        //内部比较器比较结果
//        System.out.println("比较结果 "+s.compareTo(s2));

        //外部比较器比较结果
        Comparator oc=new OutCompare();
        System.out.println("比较结果 "+oc.compare(s,s2));
    }
}
