package com.test3.thread2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/29 13:29
 */
public class ProducerThread extends Thread {
    private final Product p;

    public ProducerThread(Product p) {
        this.p = p;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            synchronized (p){
                if (i % 2 == 1) {
                    p.setBrand("小米");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    p.setName("手机");
                }else {

                    p.setBrand("华为");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    p.setName("电脑");
                }
                System.out.println("生产者生产了 : " + p.getBrand() + "-----" + p.getName());
            }
        }
    }

    public void make() {


    }
}
