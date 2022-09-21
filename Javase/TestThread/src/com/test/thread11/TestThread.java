package com.test.thread11;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/28 12:07
 */
public class TestThread {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if(i==6){
                Thread.currentThread().stop();
            }
            System.out.println(i);
        }
    }
}
