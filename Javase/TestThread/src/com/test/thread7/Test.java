package com.test.thread7;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/28 11:10
 */

class thread1 extends Thread{
    public thread1(String name){
        super(name);
    }
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName()+i+"\t优先级别"+Thread.currentThread().getPriority());
        }
    }
}

class thread2 extends Thread{
    public thread2(String name){
        super(name);
    }
    @Override
    public void run() {
        for (int i = 11; i <= 20; i++) {
            System.out.println(Thread.currentThread().getName()+i+"\t优先级别"+Thread.currentThread().getPriority());
        }
    }
}

public class Test {
    public static void main(String[] args) {

        //创建线程对象
        thread1 t1 = new thread1("thread_1--》");
        //将优先级设置为10
        t1.setPriority(10);
        t1.start();

        thread2 t2= new thread2("thread_2--》");
        //将优先级设置为1
        t2.setPriority(1);
        t2.start();

    }
}
