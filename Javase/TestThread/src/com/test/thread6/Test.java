package com.test.thread6;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/28 10:43
 */
public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        TestRandomNum tr = new TestRandomNum();
        FutureTask ft = new FutureTask(tr);
        Thread t = new Thread(ft);
        t.start();
        Object obj=ft.get();
        System.out.println(obj);
    }
}
