package com.test.collection2;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/21 19:24
 */
public class GenericTest<E> {
//9.33  13.00
    int age;
    String name;
    E e;
    E f;
    public void a(E e){
    }
    public void b(E e){
    }
}

class Test01{
    public static void main(String[] args) {
        //不指定具体的泛型
        //如果实例化的时候不指定泛型的类型，那么就默认为泛型为Object类型
        GenericTest og = new GenericTest();
        og.a("1231231");
        og.b(123214);
        og.e="hhh";
        og.f=999;

        //指定泛型
        //如果实例化对象指定泛型的类型，则泛型的类型为指定的类型
        GenericTest<String> sg = new GenericTest<>();
        sg.a("你好");
        sg.b("世界");
        sg.e="我爱你";
        sg.f="你爱我";
    }
}

//类继承是不指定泛型的类型
//子类继承没有对泛型指定类型，那么类型就为Object
class ExtendsText<E> extends GenericTest<E>{
    public static void main(String[] args) {
        ExtendsText  et = new ExtendsText ();
        et.a("1231231");
        et.b(123214);
        et.e="hhh";
        et.f=99.9;
    }
}
//类继承是指定泛型的类型
//子类继承父类泛型指定类型，那么类型就为指定类型
class ExtendsText2 extends GenericTest<String>{
    public static void main(String[] args) {
        ExtendsText2  et2 = new ExtendsText2 ();
        et2.a("1231231");
        et2.b("你好");
        et2.e="hhh";
        et2.f="世界是你们的";
    }
}


