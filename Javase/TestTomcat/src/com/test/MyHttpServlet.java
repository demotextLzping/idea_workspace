package com.test;

/**
 * @author lzp
 * @version 1.0
 * @date 2022/8/30 12:19
 */
public  abstract class MyHttpServlet {
    public final static String METHOD_GET="GET";
    public final static String METHOD_POST="POST";

    public   void doGet(MyRequest request,MyResponse response) throws Exception {
    }
    public   void doPost(MyRequest request,MyResponse response) throws Exception{
    }

    /**
     * 根据请求方式判断调用哪种出路方法
     * @param request
     * @param response
     */
    public  void service(MyRequest request,MyResponse response)throws Exception{
        if(METHOD_GET.equals(request.getRequestMethod())){
            doGet(request,response);
        }else if(METHOD_POST.equals(request.getRequestMethod())){
            doPost(request,response);
        }
    }
}
