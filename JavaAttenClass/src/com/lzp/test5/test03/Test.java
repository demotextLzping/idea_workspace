package com.lzp.test5.test03;

/**
 * @author�� LZPing
 * @date�� 2022-11-28 14:50
 * @Description
 */

public class Test {
    public static void main(String[] args) {
        Audi audi = new SmartAudi();
        audi.run();
        SmartAudi smartAudi = (SmartAudi) audi;
        smartAudi.automaticDrive();
        smartAudi.automaticParking();
    }
}
