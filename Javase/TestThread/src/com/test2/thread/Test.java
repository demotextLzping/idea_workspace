package com.test2.thread;


/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/29 10:33
 */
public class Test {
    public static void main(String[] args) {
        //创建三个子线程对象，对象桑格窗口
        BuyTicketThread tt = new BuyTicketThread();
        //将实现类的接口和子线程名字传入线程对象
        Thread t = new Thread(tt,"窗口一");
        t.start();

        Thread t2 = new Thread(tt,"窗口二");
        t2.start();

        Thread t3 = new Thread(tt,"窗口三");
        t3.start();
    }
}
