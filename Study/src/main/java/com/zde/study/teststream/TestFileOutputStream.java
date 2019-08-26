package com.zde.study.teststream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @version v1.0
 * @author: zdefys
 * @date: 2019/8/24 23:47
 */
public class TestFileOutputStream {

    public static void main(String[] args) {
        //创建一个字节型文件输出流
        try {
            File file = new File("E://学习//Java//bbb.txt");
            //创建的是文件输入流  若文件路径有问题  则抛出异常 FileNotFound
            //创建的是文件输出流 若文件路径有问题  则直接帮我们创建一个新的文件
            FileOutputStream fos = new FileOutputStream(file,true);
            String str = "qwertyuilakv";
            fos.write(str.getBytes());
            fos.flush();//刷新  将管道中的字节推入文件中
        } catch (IOException e) {
            e.printStackTrace();
        }

        //将内容写入文件
    }
}
