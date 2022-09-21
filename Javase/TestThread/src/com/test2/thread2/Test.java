package com.test2.thread2;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/28 9:38
 */
public class Test {
    public static void main(String[] args) {
        //创建三个线程对象对应三个窗口
        BuyTicketThread bt1 = new BuyTicketThread("窗口一");
        bt1.start();
        BuyTicketThread bt2 = new BuyTicketThread("窗口二");
        bt2.start();
        BuyTicketThread bt3 = new BuyTicketThread("窗口三");
        bt3.start();

    }
}
