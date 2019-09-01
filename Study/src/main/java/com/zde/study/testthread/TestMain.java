package com.zde.study.testthread;

/**
 * @version v1.0
 * @author: zdefys
 * @date: 2019/8/31 13:07
 */
public class TestMain {

    public static void main(String[] args) {
        RunningMan runningMan1 = new RunningMan("苏炳添");
        RunningMan runningMan2 = new RunningMan("博尔特");
        RunningMan runningMan3 = new RunningMan("加特林");
        Thread t1 = new Thread(runningMan1);
        Thread t2 = new Thread(runningMan2);
        Thread t3 = new Thread(runningMan3);
        t1.start();
        t2.start();
        t3.start();
    }
}
