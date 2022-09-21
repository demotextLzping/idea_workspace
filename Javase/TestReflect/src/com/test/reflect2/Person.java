package com.test.reflect2;

import java.io.Serializable;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/31 17:46
 */
public class Person implements Serializable {

    public int name;
    private String age;

    public void eat() {
        System.out.println("Person-----eat()");
    }

    public void sleep() {
        System.out.println("Person-----sleep()");
    }

}
