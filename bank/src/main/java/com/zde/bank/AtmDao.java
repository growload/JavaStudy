package com.zde.bank;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;

/**
 * @version v1.0
 * @author: zdefys
 * @date: 2019/8/30 19:15
 */
public class AtmDao {

    public HashMap<String, User> userBox = new HashMap<>();

    //程序块的目的在对象创建之前 给集合进行赋值操作
    {
        FileReader fileReader = null;
        BufferedReader reader = null;
        try {
            File file = new File("src\\main\\java\\com\\zde\\bank\\User.txt");
            fileReader = new FileReader(file);
            reader = new BufferedReader(fileReader);
            String value = reader.readLine();
            while (value != null) {
                String[] userValue = value.split("-");
                User user = new User(userValue[0], userValue[1], Float.parseFloat(userValue[2]));
                userBox.put(user.getAname(), user);
                value = reader.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //设计一个方法  目的是为了将某一个修改完毕的对象存入集合
    public void update(User user) {
        userBox.put(user.getAname(), user);
        this.commit();
    }

    //设计一个方法 目的是为了将集合内的所有数据写入文件
    public void commit() {
        //创建一个字符型文件输出流
        File file = new File("src\\main\\java\\com\\zde\\bank\\User.txt");
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            Iterator<String> names = userBox.keySet().iterator();
            while (names.hasNext()) {
                String name = names.next();
                User user = userBox.get(name);
                StringBuilder builder = new StringBuilder(user.getAname());
                builder.append("-");
                builder.append(user.getApassword());
                builder.append("-");
                builder.append(user.getAbalance());
                bufferedWriter.write(bufferedWriter.toString());
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileWriter != null)
                    fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (bufferedWriter != null)
                    bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
