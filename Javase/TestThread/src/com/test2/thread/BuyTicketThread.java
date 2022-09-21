package com.test2.thread;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/29 10:33
 */
public class BuyTicketThread extends Thread {
    static int ticketNumber=10;
    @Override
    public void run() {
        for (int i = 1; i <=100 ; i++) {
            synchronized (this){ //将具有安全隐患的代码锁住即可，如果锁多了就会效率低--》》this就是这个锁
                if(ticketNumber>0){
                    System.out.println(Thread.currentThread().getName()+"买到了第"+ticketNumber--+"张票");
                }
            }

        }
    }
}
