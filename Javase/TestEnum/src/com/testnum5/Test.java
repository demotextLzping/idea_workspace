package com.testnum5;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/15 11:10
 */
public class Test
{
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("张三");
        person.setAge(20);
        person.setSex(Gender.male);
        System.out.println(person);
    }
}
