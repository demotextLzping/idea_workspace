package com.test;

import java.io.IOException;
import java.io.OutputStream;

/**
 * @author lzp
 * @version 1.0
 * @date 2022/8/30 11:59
 */
public class MyResponse {
    private OutputStream outputStream;

    public MyResponse(OutputStream outputStream) {
        this.outputStream = outputStream;
    }

    public void write(String str) throws Exception {
        StringBuilder bulider=new StringBuilder();
        bulider.append("HTTP/1.1 200 OK\n")
                .append("Content-Type:text/html\n")
                .append("\r\n")
                .append("<html")
                .append("body")
                .append("<h1>"+str+"<h1>")
                .append("</body>")
                .append("</html>");
        this.outputStream.write(bulider.toString().getBytes());
        this.outputStream.flush();
        this.outputStream.close();
    }
}
