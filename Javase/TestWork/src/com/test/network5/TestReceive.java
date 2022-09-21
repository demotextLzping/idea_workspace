package com.test.network5;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/21 10:28
 * 接收方
 */
public class TestReceive {
    public static void main(String[] args) {
        System.out.println("老师上线了。。。");
        //1.创建套接字，指定接收方的端口
        DatagramSocket ds = null;
        DatagramPacket dp;
        DatagramPacket dp2;
        try {
            ds = new DatagramSocket(9999);
            while (true) {
                //2.准备空的数据包，用来接收发送方发送的数据包
                byte[] b = new byte[1024];
                dp = new DatagramPacket(b, b.length);
                //3.准备接收数据，将其放入准备的空数据包中
                ds.receive(dp);
                //4.取出数据
                byte[] data = dp.getData();
                String s = new String(data, 0, dp.getLength());
                System.out.println("学生对我说 : " + s);
                if(s.equals("byebye")||s.equals("再见")){
                    System.out.println("学生下线。。。");
                    break;
                }
                //5.反馈信息,封装数据
                System.out.print("老师: ");
                Scanner sc = new Scanner(System.in);
                String str = sc.next();
                byte[] bd = str.getBytes();
                //6.发送数据
                dp2 = new DatagramPacket(bd, bd.length, InetAddress.getByName("localhost"), 8888);
                ds.send(dp2);
            }
        } catch (SocketException e) {
            throw new RuntimeException(e);
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            //7.关闭资源
            assert ds != null;
            ds.close();
        }
    }
}
