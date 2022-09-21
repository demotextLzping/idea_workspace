package com.test.thread4;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/28 10:01
 */
public class Test {
    public static void main(String[] args) {
        Thread.currentThread().setName("主线程");
        //创建子线程对象
        TestThread tt = new TestThread();
        //将实现类的接口和子线程名字传入线程对象
        Thread t = new Thread(tt,"子线程");
        t.start();

        //创建主线程
        for (int i = 0; i <10 ; i++) {
            System.out.println(Thread.currentThread().getName()+"---->"+i);
        }

    }
}
