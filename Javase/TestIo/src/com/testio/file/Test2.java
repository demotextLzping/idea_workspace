package com.testio.file;

import java.io.File;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/16 11:20
 * 针对目录的方法
 */
public class Test2 {
    public static void main(String[] args) {

        File f=new File("d:\\Idea_workspace");
//        System.out.println("文件是否可读:"+f.canRead());
//        System.out.println("文件是否可写:"+f.canWrite());
//        System.out.println("获取文件的名字:"+f.getName());
//        System.out.println("获取文件上级目录:"+f.getParent());
//        System.out.println("文件是否是一个目录:"+f.isDirectory());
//        System.out.println("是否是一个文件:"+f.isFile());
//        System.out.println("文件是否隐藏:"+f.isHidden());
//        System.out.println("文件的大小:"+f.length());
//        System.out.println("文件是否存在:"+f.exists());
//        System.out.println("绝对路径"+f.getAbsolutePath());
//        System.out.println("相对路径"+f.getPath());
//        System.out.println("toString"+f.toString());


        //针对目录的方法
        //创建单层目录
        File f2 = new File("d:/a");
        f2.mkdir();
        //创建多层目录
        File f3 = new File("d:/d/b/c");
        f3.mkdirs();

        //如果删除的是目录的话，指挥删除最里面的一层，如果这层不是空的，就不会被删除
        f3.delete();

        //查看
        //文件夹下各个目录/文件对应的名字，对应的类型是String
        String[] list = f.list();
        for (String s:list) {
            System.out.println(s);
        }
        //文件夹下的哥哥文件，对应的类型是File
        File[] listsFile = f.listFiles();
        for (File lf:listsFile) {
            System.out.println("文件名"+f.getName() + "  文件相对路径" + f.getPath());
        }



    }
}
