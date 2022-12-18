package com.lzp.controller;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import jdk.internal.util.xml.impl.Input;
import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @author： LZPing
 * @date： 2022-11-08 15:18
 * @Description if not "%CATALINA_HOME%" == "" goto gotHome
 */
@Controller
public class FileController {
    private static final String FILESERVER = "http://127.0.0.1:8090/upload/";

    @ResponseBody
    @RequestMapping("fileUpload.do")
    public Map<String, String> fileUpload(MultipartFile headPhoto) throws IOException {
        HashMap<String, String> map = new HashMap<>();
//        控制上传的文件大小
        if ((headPhoto.getSize() > 1024 * 1024 * 5)) {
            map.put("message", "文件大小不能超过5M");
            return map;
        }
//        String realPath = request.getServletContext().getRealPath("/upload");
//        //指定文件存储目录为项目部署环境下的upload目录
//        File dir = new File(realPath);
//        //判断文件目录是否存在
//        if (!dir.exists()) {
//            dir.mkdirs();
//        }
        //获取文件名
        String originalFilename = headPhoto.getOriginalFilename();
        //获取uuid值
        String uuid = UUID.randomUUID().toString();
        //获取后缀名
        String extendName = originalFilename.substring(originalFilename.lastIndexOf("."));
        if (!(extendName.equals(".jpg"))) {
            map.put("message", "文件格式必须是.jpg");
            return map;
        }
        //拼接新的文件名
        String newFileName = uuid.concat(extendName);
        //文件注入位置
//        File file = new File(dir, newFileName);

//        创建sun公司提供的jersey中的client对象
        Client client = Client.create();
        WebResource resource = client.resource(FILESERVER + newFileName);
        resource.put(String.class, headPhoto.getBytes());

        //文件保存
//        headPhoto.transferTo(file);
        //上传成功后，将文件的名称何文件类型返回给浏览器
        map.put("message", "文件上传成功");
        map.put("newFileName", newFileName);
        map.put("fileType", headPhoto.getContentType());
        return map;
    }
//    @ResponseBody
    @RequestMapping("fileDownload.do")
    public void fileDownload(String photo, String fileType, HttpServletResponse response) throws IOException {
        //设置响应头
        //告诉浏览器要将文件保存到磁盘上，不在浏览器上直接解析
        response.setHeader("Content-Disposition","attachment;filename="+photo);
        //告诉浏览器下载的文件类型
        response.setContentType(fileType);
        //获取一个文件的输入流
        InputStream inputStream = new URL(FILESERVER + photo).openStream();
        //获取一个指向浏览器的输出流
        ServletOutputStream outputStream = response.getOutputStream();
        //向浏览器响应问价即可
        IOUtils.copy(inputStream,outputStream);
    }
}
