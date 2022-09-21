package com.test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author lzp
 * @version 1.0
 * @date 2022/8/30 13:14
 */
public class MyServer {
    public static void startServer(int port) throws Exception {
        //获取客户端和服务器端套接字
        ServerSocket serverSocket = new ServerSocket(port);
        Socket socket=null;
        while(true){
            socket=serverSocket.accept();

            //获取输入流和输出流
            InputStream inputStream=socket.getInputStream();
            OutputStream outputStream =socket.getOutputStream();

            //获取请求对象
            MyRequest request=new MyRequest(inputStream);
            //获取响应对象
            MyResponse response=new MyResponse(outputStream);

            String clazz=new MyMapping().getMapping().get(request.getRequestUrl());
            if(clazz!=null){
                Class<MyServlet> myServletClass=(Class<MyServlet>) Class.forName(clazz);
                //根据mmyServletClass创建对象
                MyServlet myServlet = myServletClass.newInstance();
                myServlet.service(request,response);
            }
        }
    }

    public static void main(String[] args) {
        try {
            startServer(10086);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
