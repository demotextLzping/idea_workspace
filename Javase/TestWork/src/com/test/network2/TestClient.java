package com.test.network2;

import java.io.*;
import java.net.Socket;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/20 15:23
 */
public class TestClient {
    public static void main(String[] args) throws IOException {
        //创建套接字，指定服务器和端口号
        Socket s=new Socket("127.0.0.1",8080);

        //创建OutputStream对象，向外发送数据
        OutputStream os=s.getOutputStream();
        //利用数据流可以事项发送字符串数据
        DataOutputStream dos = new DataOutputStream(os);
        dos.writeUTF("你好，我要和你创建连接");

        //接受服务去发来的信息
        InputStream is=s.getInputStream();
        //创建数据流输入对象
        DataInputStream dis =new DataInputStream(is);
        //读取客户端发来的数据
        String str = dis.readUTF();
        System.out.println("服务器发来的消息: "+str);

        //关闭流和网络资源
        dos.close();
        os.close();
        s.close();

    }
}
