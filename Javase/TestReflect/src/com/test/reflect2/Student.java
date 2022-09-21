package com.test.reflect2;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/31 18:33
 */
public class Student extends Person implements Study {
    public int sno;
    protected double height;
    double weight;
    private int score;

    public void showInfo() {
        System.out.println("我是一名三好学生");
    }
    public String showInfo(int a,int b) {
        return "重载====我是一名三好学生";
    }

    @MyAnnotation(value="Method")
    private void work(int a,double b)throws Exception,RuntimeException {
        System.out.println("我为未来会是一名程序员"+"  结果:"+a+b);
    }

    public Student() {
        System.out.println("空参构造器");
    }
    public Student(double weight ,double height) {
        this.weight= weight;
        this.score = score;
    }

    public void add(double weight,double height){
        double t=weight+height;
        System.out.println("有参数测试方法"+t);
    }

    private Student(int sno) {
        this.sno = sno;
    }

    Student(double height, int score) {
        this.height = height;
        this.score = score;
    }
    void Student(double height) {
        this.height = height;
    }


    @Override
    public String toString() {
        return "Student{" +
                "sno=" + sno +
                ", height=" + height +
                ", weight=" + weight +
                ", score=" + score +
                '}';
    }

    @Override
    public void study() {
        System.out.println("学生要学习");
    }
}

