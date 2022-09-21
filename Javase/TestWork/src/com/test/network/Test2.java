package com.test.network;

import java.net.InetAddress;
import java.net.InetSocketAddress;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/20 15:00
 */
public class Test2 {
    public static void main(String[] args) {
        InetSocketAddress isa = new InetSocketAddress("192.168.0.104",8080);  //封装ip和端口号
        System.out.println(isa);
        System.out.println(isa.getHostName());  //获取本机ip
        System.out.println(isa.getPort());  //获取本机端口号

        InetAddress ia =isa.getAddress();
        System.out.println(ia.getHostName());  //获取本机ip
        System.out.println(ia.getHostAddress());  //获取本机端口号
    }
}
