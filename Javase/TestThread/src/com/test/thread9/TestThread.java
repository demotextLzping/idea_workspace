package com.test.thread9;

import sun.text.resources.FormatData;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Timer;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/28 11:36
 */
public class TestThread extends Thread {
    @Override
    public void run() {
        setName("子线程--》");
        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(1000);
                System.out.print("当前时间 : "+new SimpleDateFormat("HH-mm:ss").format(System.currentTimeMillis()));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(getName()+i);

        }
    }
}
class test{
    public static void main(String[] args) throws InterruptedException {
        for (int i = 11; i <16 ; i++) {
            if(i==14){
                //创建子线程
                TestThread tt = new TestThread();
                tt.start();
                tt.join();
            }
            System.out.println("主线程--》"+i);
        }
    }
}
