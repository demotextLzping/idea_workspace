package com.test3.thread3;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/29 13:29
 */
public class ProducerThread extends Thread {
    private Product p;

    public ProducerThread(Product p) {
        this.p = p;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            if(i%2==0){
               p.setProduct("小米","手机");
            }else {
                p.setProduct("华为","电脑");
            }

        }
    }
}
