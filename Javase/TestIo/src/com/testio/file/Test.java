package com.testio.file;

import java.io.File;
import java.io.IOException;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/16 10:39
 * 文件类 将文件封装为一个file类的对象
 * 针对文件的方法
 */
public class Test {
    public static void main(String[] args) throws IOException {
        //创建文件对象的三种方法
        //利用转义字符创建对象
        File f=new File("d:\\demo.txt");
        //直接创建对象
        File f1 = new File("d:/demo.txt");
        //使用File.separator 自动识别系统的填充拼接符号
        File f2 = new File("d:"+File.separator+"demo.text");
        //文件是否可读
        System.out.println("文件是否可读:"+f.canRead());
        System.out.println("文件是否可写:"+f.canWrite());
        System.out.println("获取文件的名字:"+f.getName());
        System.out.println("获取文件上级目录:"+f.getParent());
        System.out.println("文件是否是一个目录:"+f.isDirectory());
        System.out.println("是否是一个文件:"+f.isFile());
        System.out.println("文件是否隐藏:"+f.isHidden());
        System.out.println("文件的大小:"+f.length());
        System.out.println("文件是否存在:"+f.exists());

        //文件创建
        //f.createNewFile();

        //文件删除
        // f.delete();

        //文件比较
        System.out.println(f==f1);//比较两个对象的地址
        System.out.println(f.equals(f1)); //比较两个对象对应的文件的路径


        //文件路径
        //绝对路径
        System.out.println("绝对路径"+f.getAbsolutePath());
        System.out.println("相对路径"+f.getPath());
        System.out.println("toString"+f.toString());

    }
}
