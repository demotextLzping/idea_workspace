package com.test.Set2;

import java.util.Comparator;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/25 10:30
 */
public class Student implements Comparable<Student> {
    private String name;
    private int age;
    private double height;

    public Student(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    //内部比较器
    //年龄比较
//    @Override
//    public int compareTo(Student o) {
//        return this.getAge()-o.getAge();
//    }

    //名字比较
//    @Override
//    public int compareTo(Student o) {
//        return this.getName().compareTo(o.getName());
//    }

    //身高比较
    @Override
    public int compareTo(Student o) {
        return ((Double)this.getHeight()).compareTo((Double)o.getHeight());
    }
}
//外部比较器
class OutCompare implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        //年龄比较
//        return o1.getAge()-o2.getAge();

        //名字比较
        return o1.getName().compareTo(o2.getName());
        //身高比较
//        return ((Double)o1.getHeight()).compareTo((Double)o2.getHeight());
    }
}
