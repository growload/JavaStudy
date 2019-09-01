package com.zde.study.testthread;

/**
 * @version v1.0
 * @author: zdefys
 * @date: 2019/8/31 13:03
 */
public class RunningMan implements Runnable {

    private String name;
    public RunningMan(){};
    public RunningMan(String name){
        this.name = name;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(name + "跑到第"+i+"米啦");
        }
    }
}
