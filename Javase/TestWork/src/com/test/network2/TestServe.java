package com.test.network2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/20 15:34
 */
public class TestServe {
    public static void main(String[] args) throws IOException {
        //创建服务器套接字，指定端口号
        ServerSocket ss=new ServerSocket(8080);
        //等着客户端发送数据
        Socket s = ss.accept(); //阻塞方法：等待接受客户端的数据，什么时候接收到数据，什么时候程序继续执行
        //创建输入流对象
        InputStream is=s.getInputStream();
        //创建数据流输入对象
        DataInputStream dis =new DataInputStream(is);
        //读取客户端发来的数据
        String str = dis.readUTF();
        System.out.println("客户端发来的消息: "+str);

        //向客户端输出一句话 操作流--》输出流
        //创建OutputStream对象，向外发送数据
        OutputStream os=s.getOutputStream();
        //利用数据流可以事项发送字符串数据
        DataOutputStream dos = new DataOutputStream(os);
        dos.writeUTF("你好，我接收到了你的链接请求");

        //关闭流和网络资源
        dis.close();
        is.close();
        ss.close();

    }
}
