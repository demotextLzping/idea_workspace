package com.lzp.test4_1;

/**
 * @author�� LZPing
 * @date�� 2022-11-18 14:00
 * @Description
 */
public class User {
    public static void main(String[] args) {
        CD dataCD = new CD();
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        dataCD.setSize(arr.length);
        dataCD.setContent(arr);
        int[] content = dataCD.getContent();
        System.out.println("dataCD�ϵ�����Ϊ��");
        for (int i = 0; i < content.length; i++)//���CD����
            System.out.printf(content[i] + " ");

        Computer computerIMB = new Computer();
        computerIMB.putCD(dataCD);

        System.out.println("\n��dataCD�����ݸ��Ƶ��������computerIMB");
        computerIMB.copyToComputer();
        System.out.println("computerIMB�ϵ�����Ϊ��");
        computerIMB.showData();
        int num = 12;
        System.out.println("\ncomputerIMB�е�ÿ�����ݼ� " + num);
        computerIMB.addNum(num);
        System.out.println("computerIMB����ֵ������ݸ��Ƶ�CD��dataCD");
        computerIMB.copyToCD();
        System.out.println("dataCD�е�����Ϊ��");
        content = dataCD.getContent();
        for (int i = 0; i < content.length; i++)
            System.out.printf(content[i] + " ");
    }
}