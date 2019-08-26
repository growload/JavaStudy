package com.zde.study.rederandwriter;

import java.io.*;

/**
 * @version v1.0
 * @author: zdefys
 * @date: 2019/8/25 14:07
 */
public class TestFileReader {
    public static void main(String[] args) {

        try {
            //字符型文件输入流
            File file = new File("E://学习//Java//aaa.txt");
            FileReader fr = new FileReader(file);
            FileWriter fw = new FileWriter(file,true);
            fw.write('a');
            fw.flush();
            char[] c = new char[1024];
            int count = fr.read(c);
            while (count!=-1){
                System.out.println(new String(c,0,count));
                count = fr.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
