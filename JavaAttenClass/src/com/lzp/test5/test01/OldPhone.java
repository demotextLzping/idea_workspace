package com.lzp.test5.test01;

/**
 * @author�� LZPing
 * @date�� 2022-11-28 14:28
 * @Description
 */

public class OldPhone {
    private String Brand;
    private String price;
    public OldPhone() {}
    public OldPhone(String brand, String price) {Brand = brand;this.price = price;}
    public String getBrand() {return Brand;}
    public void setBrand(String brand) {Brand = brand;}
    public String getPrice() {return price;}
    public void setPrice(String price) {this.price = price;}
    public void call(String name) {System.out.println("��" + name + "��绰");}
    public void sendMessage() {System.out.println("������");}
    public void show() {System.out.println("��ʾ�ֻ���");}

}
