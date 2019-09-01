package com.zde.study.testjoin;

/**
 * @version v1.0
 * @author: zdefys
 * @date: 2019/9/1 17:00
 */
public class ThreadOne extends Thread {

    @Override
    public void run() {
        System.out.println("thread-one start");
        ThreadTwo two = new ThreadTwo();
        two.start();
        try {
            two.join();//线程2加入线程1里面
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("thread-one end");

    }
}
