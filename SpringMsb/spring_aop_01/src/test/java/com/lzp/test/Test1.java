package com.lzp.test;


public class Test1 {
    public static void main(String[] args) {
        Person person = new Person("张三");
        Court court = new lawyer(person);
        court.doCourt();
    }
}

interface Court {
    void doCourt();
}

class lawyer implements Court {
    private Person person;

    public lawyer(Person person) {
        this.person = person;
    }

    @Override
    public void doCourt() {
        System.out.println("现有证据无法证明" + person.getName() + "有罪");
        person.doCourt();
    }
}

class Person implements Court {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void doCourt() {
        System.out.println(name + "说: 我没有犯罪");
    }
}
