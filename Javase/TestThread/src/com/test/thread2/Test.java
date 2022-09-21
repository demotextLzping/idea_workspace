package com.test.thread2;

import com.test.thread2.TestThread;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/28 8:42
 */
public class Test  {
    public static void main(String[] args) {
        //main_1主线程循环输出0-9
        //设置主线程名字
        Thread.currentThread().setName("主线程");
        //Thread.currentThread() 获取当前正在执行的线程
        //创建子线程
        TestThread tt = new TestThread("子线程");
        //给子线程设置名字
        tt.setName("子线程");
        //tt.run()这个run方法不能直接调用，直接调用就会被当作一个普通的方法
        //象牙tt子线程启动线程的作用，就要用其弗雷德tt.start()方法
        tt.start();
        //main_2主线程也输出0-9
        for (int i = 0; i <10 ; i++) {
            System.out.println(Thread.currentThread().getName()+"2-->"+i);
        }
    }
}
