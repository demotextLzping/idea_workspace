package com.test.Map;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/26 9:44
 */
public class Student implements Comparable<Student> {
    private String name;
    private int age;
    private Double height;

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }


    public Student(String name, int age, Double height) {
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

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    //内部构造器
    //年龄
//    @Override
//    public int compareTo(Student o) {
//        return this.getAge()-o.getAge();
//    }

//    姓名
    @Override
    public int compareTo(Student o) {
        return this.getName().compareTo(o.getName());
    }



}
