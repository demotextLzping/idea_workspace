package com.test.LinkedList2;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/22 14:40
 */
public class Node {
    private Node pre;
    private Object obj;
    private Node next;

    public Node() {
    }

    public Node getPre() {
        return pre;
    }

    public void setPre(Node pre) {
        this.pre = pre;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "pre=" + pre +
                ", obj=" + obj +
                ", next=" + next +
                '}';
    }
}
