package com.zde.study.testfile;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @version v1.0
 * @author: zdefys
 * @date: 2019/8/19 20:40
 */
public class TestFile {
    public static void main(String[] args) {
        File file = new File("E://学习/Java/test.txt");
        //文件本身的属性
        System.out.println(file.canExecute());//文件是否可执行
        System.out.println(file.canRead());//文件是否可读
        System.out.println(file.canWrite());//文件是否可写
        System.out.println(file.isHidden());//文件是否隐藏
        System.out.println(file.isFile());//判断当前的file是否是一个文件
        System.out.println(file.isDirectory());//判断当前文件是否是一个文件夹

        // 获取文件的长度
        long l = file.length();
        System.out.println(l);
        //获取文件的最后修改时间
        long l1 = file.lastModified();
        Date date = new Date(l1);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String time = sdf.format(date);
        System.out.println(time);

        //获取文件的绝对路径
        String absolutePath = file.getAbsolutePath();
        System.out.println(absolutePath);
        //获取文件的名字
        String name = file.getName();
        System.out.println(name);

    }
}
