package com.test3.thread5;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/29 13:34
 */
public class Test {
    public static void main(String[] args) {
        //创建商品类
        Product p=new Product();
        ProducerThread pt=new ProducerThread(p);
        CustomerThread ct=new CustomerThread(p);

        pt.start();
        ct.start();
    }
}
