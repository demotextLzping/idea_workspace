package com.test2.thread5;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/29 10:33
 */
public class BuyTicketThread extends Thread {
    static int ticketNumber=10;
    Lock lock=new ReentrantLock();
    @Override
    public void run() {
        for (int i = 1; i <=100 ; i++) {
            lock.lock();
            try{
                if(ticketNumber>0){
                    System.out.println(Thread.currentThread().getName()+"买到了第"+ticketNumber--+"张票");
                }
            }catch ( Exception e){
                    e.printStackTrace();
            }finally {
                lock.unlock();  //保证所能关闭
            }
        }
    }
}
