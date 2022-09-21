package com.test3.thread5;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/29 13:32
 */
public class CustomerThread  extends Thread{
    private Product p;

    public CustomerThread(Product p) {
        this.p = p;
    }

    @Override
    public void run() {
        for (int i = 1; i <=10 ; i++) {
            p.getProduct();
        }
    }
}
