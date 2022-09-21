package com.test.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/22 10:48
 */
public class Test {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("aa");
        list.add("bb");
        list.add("cc");
        list.add("dd");
        System.out.println("原数组: "+list);
        //常用方法
        //增加
        //1.addFirst(E e)
        list.addFirst("11");
        //2.addLast(E e)
        list.addLast("99");
        System.out.println("add方法: "+list);
        //3.offer(E e)
        list.offer("88");
        System.out.println("offer1方法: "+list);
        //4.offerFirst(E e)
        list.offerFirst("22");
        //5.offerLast(E e)
        list.offerLast("77");
        System.out.println("offer2方法: "+list);

        System.out.println("原数组: "+list);
        //删除
        //1.poll()
        list.poll();
        System.out.println("poll1方法: "+list);
        //2.pollFirst()
        list.pollFirst();
        //3.pollLast()
        list.pollLast();
        System.out.println("poll2方法: "+list);
        //4.removeFirst()
        list.removeFirst();
        //5.removeLast()
        list.removeLast();
        System.out.println("remove方法: "+list);

        System.out.println("原数组: "+list);
        //查看
        //1.element()
        list.element();
        System.out.println("element方法: "+list.element());
        //2.getFirst()
        System.out.println("getFirst方法: "+list.getFirst());
        //3.getLast()
        System.out.println("getLast方法: "+list.getLast());
        //4.indexOf(Object o)
        System.out.println("indexOf方法: "+list.indexOf("dd"));
        //5.LastIndexOf(Object o)
        System.out.println("LastIndexOf方法: "+list.indexOf("dd"));
        //6.peek()
        System.out.println("peek方法 :"+list.peek());
        //7.peekFirst()
        System.out.println("peekFirst方法 :"+list.peekFirst());
        //8.peekLast()
        System.out.println("peekLast方法 :"+list.peekLast());

        System.out.println("原数组: "+list);
        //遍历
        //1.普通for循环
        System.out.print("普通for循环遍历 :");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        //2.增强for循环
        System.out.print("增强for循环遍历 :");
        for (String s:list) {
            System.out.print(s+" ");
        }
        System.out.println();
        //3.迭代器（while）
        System.out.print("迭代器（while） :");
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();
        //4.迭代器（for）
        System.out.print("迭代器（for） :");
        for(Iterator<String> it2 = list.iterator();it2.hasNext();){
            System.out.print(it2.next()+" ");
        }
        System.out.println();
    }
}
