package com.lzp.test2;

import java.util.Scanner;

public class demo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("��������(��Enterȷ��)");
        String name = scanner.next();


        System.out.println("��������(��Enterȷ��)");
        int year = scanner.nextInt();

        System.out.println("�������(��Enterȷ��)");
        double height = scanner.nextDouble();

        System.out.println("--������Ϣ--");
        System.out.println("����: "+name+"\t����: "+year+"\t���: "+height);


    }
}
