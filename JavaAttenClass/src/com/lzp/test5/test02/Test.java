package com.lzp.test5.test02;

/**
 * @author�� LZPing
 * @date�� 2022-11-28 14:43
 * @Description
 */

public class Test {
    public static void main(String[] args) {
        Bear bear = new Bear();
        bear.setColor("��ɫ");
        bear.setNumOfLegs(4);
        bear.eat();
        bear.catchFish();

        Panda panda = new Panda();
        panda.setColor("��ɫ");
        panda.setNumOfLegs(4);
        panda.eat();
        panda.climbTree();
    }
}
