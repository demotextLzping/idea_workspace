package com.test3.thread2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/29 13:32
 */
public class CustomerThread  extends Thread{
    private final Product p;
    public CustomerThread(Product p) {
        this.p = p;
    }
    @Override
    public void run() {
        for (int i = 1; i <=10 ; i++) {
            synchronized (p){
                System.out.println("消费者消费了 : "+p.getBrand()+"-----"+p.getName());
            }
        }
    }
}
