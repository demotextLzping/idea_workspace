package com.lzp.test2;

import java.util.Scanner;

public class demo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������εĿ� : ");
        double width= scanner.nextDouble();
        System.out.println("������εĸ� : ");
        double height=scanner.nextDouble();
        double area=width*height;
        System.out.println("�� : "+width+"\t�� :"+height+"\t���ε����δ :"+ area);
    }
}
