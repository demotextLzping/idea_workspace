package com.test.collection4;



/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/22 9:15
 */
public class TestGeneric <E>{
    public void a(E e){

    }
    public <T> void b(T t){

    }
}
class demo{
    public static void main(String[] args) {
        TestGeneric<String> tg = new TestGeneric();
        tg.a("xiaomi");
        tg.a("demo");

        tg.b("xiaomi");
        tg.b(123);
        tg.b(99.9);

    }

}