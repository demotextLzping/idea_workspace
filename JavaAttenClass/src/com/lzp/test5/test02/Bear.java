package com.lzp.test5.test02;

/**
 * @author�� LZPing
 * @date�� 2022-11-28 14:42
 * @Description
 */

public class Bear extends Animal {

    @Override
    public void eat() {
        System.out.println(getColor()+getNumOfLegs()+"���ȵı������ڳԷ���");
    }

    public  void  catchFish(){
        System.out.println(getColor()+getNumOfLegs()+"���ȵı�������ץ��");
    }

}
