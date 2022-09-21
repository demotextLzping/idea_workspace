package com.test3.thread3;

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
    public synchronized void  setProduct(String Brand,String name){
            this.setBrand(Brand);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            this.setName(name);
        System.out.println("生产者生产了 : "+this.getBrand()+"-----"+this.getName());
    }
    public synchronized void getProduct(){
        System.out.println("消费者消费了 : "+this.getBrand()+"-----"+this.getName());
    }
}
