package com.test.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/25 19:31
 * Map接口的常用方法
 */
public class Test {
    public static void main(String[] args) {
        //增加
        //唯一且无序
        //put(key,value) 添加数据
        HashMap<String,Integer> map = new HashMap<>();
        map.put("lili",22);
        map.put("nana",23);
        map.put("qiqi",23);
        map.put("lili",22);
        System.out.println(map.size());
        System.out.println(map);

        //删除
        //1.clear()  清空Map集合
//        map.clear();
//        System.out.println(map.size());
        //2.remove()  移除某元素(通过key值)
//        map.remove("lili");
//        System.out.println(map);


        //2.修改

        //3.查看
        //entrySet()  返回一个 Set包含在这张Map上的映射。
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> t:entries) {
            System.out.println("key == " +t.getKey()+" value == "+t.getValue());
        }
        //get(Object key)通过key值获元素值
        System.out.println("get :"+map.get("lili"));
        //keySet() 获取全部的key值
        System.out.print("keySet方法 :");
        for (String s : map.keySet()) {
            System.out.print(s+" ");
        }
        System.out.println();

        //size()获取集合的大小
        System.out.println("size :"+map.size());
        //values() 获取集合的全部value值
        System.out.print("values方法 :");
        for (Integer value : map.values()) {
            System.out.print(value+" ");
        }
        System.out.println();

        //4.判断
        //containKey(Object key) 判断是否存在某个key
        System.out.println("containsKey :"+map.containsKey("lili"));
        //containValues(Object values) 判断是否存在某个value
        System.out.println("containsValue :"+map.containsValue(22));
        //equals(Object o)  equals比较值
        HashMap<String,Integer> map2 = new HashMap<>();
        map2.put("lili",22);
        map2.put("nana",23);
        map2.put("qiqi",23);
        map2.put("lili",22);
        System.out.println("== :"+(map==map2));
        System.out.println("equals :"+map.equals(map2));

        //isEmpty() 判断集合是否为空
        System.out.println("isEmpty :"+map.isEmpty());
    }
}
