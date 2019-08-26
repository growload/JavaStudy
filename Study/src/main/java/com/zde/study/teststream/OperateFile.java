package com.zde.study.teststream;

import java.io.*;

/**
 * @version v1.0
 * @author: zdefys
 * @date: 2019/8/25 10:46
 */
public class OperateFile {

    public static void main(String[] args) {
        OperateFile of = new OperateFile();
        of.superCopyFile(new File("D://360"), "F:");
    }


    //文件的复制
    public void copyFile(File file, String path) {

        //创建一个输入流
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream(file);
            //创建一个新的file对象
            File newFile = new File(path + "//" + file.getName());
            fos = new FileOutputStream(newFile);
            //读取文件的信息
            byte[] b = new byte[1024];
            int count = fis.read(b);
            while (count != -1) {
                fos.write(b, 0, count);
                fos.flush();
                count = fis.read();
            }
            System.out.println("复制完毕");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭
            try {
                if (fis != null) {
                    fis.close();
                }
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }


    //文件的加密
    public void jiaMiFile(File file, String path) {

        //创建一个输入流
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream(file);
            //创建一个新的file对象
            File newFile = new File(path + "//" + file.getName());
            fos = new FileOutputStream(newFile);
            //读取文件的信息
            byte[] b = new byte[1024];
            int count = fis.read(b);
            while (count != -1) {
                //加密  每次数组的前两个元素位置互换 1024
                byte temp = b[0];
                b[0] = b[1];
                b[1] = temp;


                fos.write(b, 0, count);
                fos.flush();
                count = fis.read();
            }
            System.out.println("加密完毕");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭
            try {
                if (fis != null) {
                    fis.close();
                }
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    //文件夹的赋值 file可以代表文件  也可以代表文件夹
    public void superCopyFile(File file, String newPath) {
        //判断当前传递进来的file是个文件还是文件夹 isFile idDirectory
        File[] files = file.listFiles();//获取当前传递进来的file对象所有子元素
        //file是一个文件
        //获取file的绝对文件
        String oldFilePath = file.getAbsolutePath();
        String newFilePath = newPath + oldFilePath.split(":")[1];
        //创建一个新的file对象
        File newFile = new File(newFilePath);
        if (files != null) {
            //通过新的file对象操作  创建一个文件夹
            newFile.mkdir();
            if (files.length != 0) {
                for (File file1 : files) {
                    superCopyFile(file1, newPath);
                }
            }
        } else {
            //创建两个文件流 分别读取旧的file和写入新的newFile
            FileInputStream fis = null;
            FileOutputStream fos = null;

            try {
                fis = new FileInputStream(file);
                fos = new FileOutputStream(newFile);
                byte[] b = new byte[1024];
                int count = fis.read(b);
                while (count != -1) {
                    fos.write(b, 0, count);
                    fos.flush();
                    count = fis.read(b);
                }
                System.out.println(newFile.getName() + "文件复制完毕");

            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (fis != null) {
                        fis.close();
                    }
                    if (fos != null) {
                        fos.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

    }
}
