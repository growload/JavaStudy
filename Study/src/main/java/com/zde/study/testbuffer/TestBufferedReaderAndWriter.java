package com.zde.study.testbuffer;

import java.io.*;

/**
 * @version v1.0
 * @author: zdefys
 * @date: 2019/8/25 18:10
 */
public class TestBufferedReaderAndWriter {

    public static void main(String[] args) {
        //创建字符输入流
        try {
            File file = new File("E://学习//Java//aaa.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String value = br.readLine();//读取文件中一行的信息
            while (value!=null){
                System.out.println(value);
                value = br.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
