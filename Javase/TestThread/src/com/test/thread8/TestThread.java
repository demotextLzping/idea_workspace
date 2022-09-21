package com.test.thread8;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/28 11:29
 */
public class TestThread extends Thread{

    @Override
    public void run() {
        setName("子线程--》");
        for (int i = 1; i < 6; i++) {
            System.out.println(getName()+i);
        }
    }
}
class test{
    public static void main(String[] args) throws InterruptedException {
        for (int i = 10; i <20 ; i++) {
            if(i==14){
                //创建子线程
                TestThread tt = new TestThread();
                //使用start()和join()方法
                tt.start();
                tt.join();
            }
            System.out.println("主线程--》"+i);
        }
    }
}