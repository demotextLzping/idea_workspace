package com.test.network;

import com.sun.jmx.snmp.InetAddressAcl;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/20 14:33
 */
public class Test {
    public static void main(String[] args) throws UnknownHostException {
//        192.168.0.104
        //InetAddress不能直接创建对象，因为其被default修饰
        InetAddress ia1=InetAddress.getByName("192.168.0.104");//封装本机的ip地址
        System.out.println(ia1);
        InetAddress ia2=InetAddress.getByName("localhost");//封装本机的ip地址
        System.out.println(ia2);

        InetAddress ia3=InetAddress.getByName("Lzping");//封装计算机名
        System.out.println(ia3);


        InetAddress ia4=InetAddress.getByName("www.baidu.com");//封装域名
        System.out.println(ia4.getHostName());  //获取域名
        System.out.println(ia4.getHostAddress());  //获取ip地址
    }
}
