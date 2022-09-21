package com.test.thread4;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/28 9:58
 */
public class TestThread implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            System.out.println(Thread.currentThread().getName()+"---->"+i);

        }
    }
}
