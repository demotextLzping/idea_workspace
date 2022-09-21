package com.test;

/**
 * @author lzp
 * @version 1.0
 * @date 2022/8/30 12:26
 */
public class MyServlet extends MyHttpServlet {
    @Override
    public void doGet(MyRequest request, MyResponse response) throws Exception {
        response.write("get_tomcat");

    }

    @Override
    public void doPost(MyRequest request, MyResponse response)throws Exception {
        response.write("post_tomcat");
    }
}
