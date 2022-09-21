package com.test.thread;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/28 8:54
 */
public class TestThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            System.out.println(this.getName()+"--->"+i);

        }
    }
}
