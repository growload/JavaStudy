package com.zde.study.testbuffer;

import java.io.*;

/**
 * @version v1.0
 * @author: zdefys
 * @date: 2019/8/25 20:06
 */
public class TestObjectStream {

    public static void main(String[] args) {
        //将对象直接记录咋文件中 永久保存 对象的序列化
//        Person p1 = new Person("张德恩",18);
        //对象输出流
        /*FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("E://学习//Java//aaa.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(p1);
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        //需要一个对象输入流
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("E://学习//Java//aaa.txt"));
            Person p = (Person) ois.readObject();
            System.out.println(p.toString());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
