package com.lzp.test2;

public class demo2 {
    public static void main(String[] args) {
        System.out.println("���������ʯ���Եĺ���");
        for (int i = 0; i < 5; i++) {
            char c= (char) (i + 30740+'0');
            System.out.print(c+"("+i+30740+")");
        }
        System.out.println();
        System.out.println("���������Ů���Եĺ���");
        for (int i = 0; i < 5; i++) {
            char c= (char) (i + 22920+'0');
            System.out.print(c+"("+i+22920+")");
        }
    }
}
