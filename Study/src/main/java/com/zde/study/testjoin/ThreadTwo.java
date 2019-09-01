package com.zde.study.testjoin;

/**
 * @version v1.0
 * @author: zdefys
 * @date: 2019/9/1 17:01
 */
public class ThreadTwo extends Thread {

    @Override
    public void run() {
        System.out.println("thread-two start");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("thread-two end");
    }
}
