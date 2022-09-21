package com.test.thread5;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/28 9:58
 */
public class BuyTicketThread implements Runnable{
    static int ticketNumber=10;
    @Override
    public void run() {
        for (int i = 1; i <=100 ; i++) {
            if(ticketNumber>0){
                System.out.println(Thread.currentThread().getName()+"买到了第"+ticketNumber--+"张票");
            }
        }
    }
}
