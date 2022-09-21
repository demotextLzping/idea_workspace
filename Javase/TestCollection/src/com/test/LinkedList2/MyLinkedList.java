package com.test.LinkedList2;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/22 14:42
 */
public class MyLinkedList {
    //一定有个头节点
    Node first;
    //一定有个尾节点
    Node last;
    int count =0;

    public MyLinkedList() {
    }

    public void add(Object o){
        //当添加的元素为第一个节点对象时
        if(first==null){
            Node n=new Node();
            n.setPre(null);
            n.setObj(o);
            n.setNext(null);
            //当前链中第一个节点变为n
            first=n;
            //当前链中最后一个节点变为n
            last=n;
        }else{
            Node n=new Node();
            n.setPre(last); //n的上一个节点是当前链中的最后一个节点last
            n.setObj(o);
            n.setNext(null);
            //当前链中的最后一个节点的下一个怨怒是要指向n
            last.setNext(n);
            //将最后一个节点弊案威n
            last=n;
        }
        count++;

    }
    public int getCount(){
        return count;
    }
    public Object getValue(int index){
        Node n=first;
        for (int i = 0; i <index ; i++) {
            n=n.getNext();
        }
        return n.getObj();
    }
}

class Test {
    public static void main(String[] args) {
        MyLinkedList ml = new MyLinkedList();
        ml.add("aa");
        ml.add("bb");
        ml.add("cc");
        System.out.println(ml.getCount());
        System.out.println(ml.getValue(2));
    }
}
