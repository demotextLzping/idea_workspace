package com.testio.io6;

import java.io.Serializable;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/20 12:05
 */
public class Person  implements Serializable {
    private static final long serialVersionUID = 6155587566734742396L;
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
