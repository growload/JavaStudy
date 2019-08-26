package com.zde.study.teststream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @version v1.0
 * @author: zdefys
 * @date: 2019/8/24 21:20
 */
public class TestFileInputStream {
    public static void main(String[] args){
        //创建一个字节型的文件输入流
        FileInputStream fis = null;
        try {
             fis   = new FileInputStream("E://学习//Java//aaa.txt");
            int available = fis.available();//流管道中有多少缓存的字节
            System.out.println(available);
            byte[] b = new byte[5];
            int count = fis.read(b);//读取的有效个数
            while (count!=-1){
                String value = new String(b,0,count);
                System.out.print(value);
                count = fis.read(b);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (fis!=null) {
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        /*try {
            File file = new File("E://学习//Java//aaa.txt");
            FileInputStream fis = new FileInputStream(file);
            int code = fis.read();
            while (code!=-1){
                System.out.print((char)code);
                code=fis.read();
            }
            System.out.println(fis);
        } catch (Exception e) {
            e.printStackTrace();
        }*/
    }
}
