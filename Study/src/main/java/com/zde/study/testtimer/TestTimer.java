package com.zde.study.testtimer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @version v1.0
 * @author: zdefys
 * @date: 2019/9/1 20:21
 */
public class TestTimer {

    //设计一个方法  每个一段时间 发送一段数据
    // 存储所有人的电话号--账号
    private ArrayList<String> userBox = new ArrayList<>();
    {
        userBox.add("a");
        userBox.add("d");
        userBox.add("c");
        userBox.add("b");
    }

    public void test(){
        Timer timer = new Timer();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date firstTime = null;
        try {
            firstTime = sdf.parse("2019-09-1 22:37:50");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                for (int i=0;i<userBox.size();i++){
                    System.out.println("给"+userBox.get(i)+"发送了一条信息：[我很帅]");
                }
                System.out.println("做了点事");
            }
        }, firstTime, 3000);
    }

    public static void main(String[] args) {
        TestTimer testTimer = new TestTimer();
        testTimer.test();
    }

}
