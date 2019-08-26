package com.zde.study.testbuffer;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @version v1.0
 * @author: zdefys
 * @date: 2019/8/25 17:58
 */
public class TestBufferedStream {

    public static void main(String[] args) {
        try {
            //创建一个流
            File file = new File("E://学习//Java//aaa.txt");
            FileInputStream fis = new FileInputStream(file);
            BufferedInputStream bis = new BufferedInputStream(fis);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
