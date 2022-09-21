package com.test3.thread5;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/29 13:26
 */
public class Product {
    private String brand;
    private String name;

    public Product() {
    }

    Lock lock = new ReentrantLock();
    //创建生产者等待对队列
    Condition produceCondition = lock.newCondition();
    //创建消费者等待队列
    Condition customerCondition = lock.newCondition();

    //创建一个布尔类型的属性，用于判别是否有商品
    boolean flag = false; //默认情况下没有商品

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProduct(String Brand, String name) {
        lock.lock();
        try {
            if (flag) {  //当flag为true时有商品，生产者进入等待池
                try {
//                    wait();
                    produceCondition.await();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            this.setBrand(Brand);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            this.setName(name);
            System.out.println("生产者生产了 : " + this.getBrand() + "-----" + this.getName());
            flag = true;
//            notify();
            customerCondition.signal();
            //唤醒消费者线程
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void getProduct() {
        lock.lock();
        try {
            if (!flag) {  //当flag为false时没有商品，消费者进入等待池
//                wait();
                try {
                    customerCondition.await();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
            System.out.println("消费者消费了 : " + this.getBrand() + "-----" + this.getName());
            flag = false;
//        notify();
            produceCondition.signal();
            //唤醒生产者线程
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
