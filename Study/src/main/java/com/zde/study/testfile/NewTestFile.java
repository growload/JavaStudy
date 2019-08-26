package com.zde.study.testfile;

import java.io.File;

/**
 * @version v1.0
 * @author: zdefys
 * @date: 2019/8/24 20:05
 */
public class NewTestFile {
    //设计一个方法 删除文件夹
    public void deleteFile(File file){
        //判断file不是空文件夹
        File[] files = file.listFiles();
        if (files!=null && files.length!=0){
            for (File f : files) {
                deleteFile(f);
            }
        }
        file.delete();
    }


    //设计一个方法 用来遍历文件夹
    public void showFile(File file){
        //判断如果file是一个文件夹 文件夹内有元素
        //获取file的字元素  files==null是个文件 files!= null是个文件夹
        //files.length!=0 是一个有元素的文件夹
        File[] files = file.listFiles();
        if (files!=null && files.length!=0){
            for (File f : files){
                showFile(f);
            }
        }

        //做自己的事
        System.out.println(file.getAbsolutePath());
    }

    public static void main(String[] args) {
        NewTestFile ntf = new NewTestFile();
        File file = new File("E://test");
        ntf.showFile(file);
        ntf.deleteFile(file);
    }
}
