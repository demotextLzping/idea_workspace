package com.test.thread3;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/28 9:35
 */
public class BuyTicketThread extends Thread {
    //通过构造器给线程设置名字
    public BuyTicketThread(String name) {
        super(name);
    }
    static int ticketNumber = 10;
    //总共10张票，3个线程共享这10张票
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            if (ticketNumber > 0) {//总票数10张,抢完停止
                System.out.println(this.getName() + "抢到第" + ticketNumber-- + "张票");
            }
        }
    }
}
