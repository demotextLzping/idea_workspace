package com.lzp.test4;

/**
 * @author�� LZPing
 * @date�� 2022-11-18 14:00
 * @Description
 */

public class Phone {
    private String brand;
    private double price;
    private String color;

    public Phone() {
    }

    public Phone(String brand, double price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void call() {
        System.out.println("����ʹ�ü۸�Ϊ" + price + "Ԫ" + color + "��" + brand + "�ֻ���绰....");
    }

    public void sendMessage() {
        System.out.println("����ʹ�ü۸�Ϊ" + price + "Ԫ" + color + "��" + brand + "������....");

    }
}
