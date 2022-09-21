package com.test.thread10;


/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/28 11:55
 */
public class TestThread extends Thread {
    @Override
    public void run() {
        setName("子线程--》");
        for (int i = 0; i < 1000; i++) {
            System.out.println(getName()+i);

        }
    }
}
class test{
    public static void main(String[] args) throws InterruptedException {
        TestThread tt = new TestThread();
        //设置线程伴随
        tt.setDaemon(true);
        tt.start();
        for (int i = 0; i <10 ; i++) {
            System.out.println("主线程---》"+i);
        }
    }
}