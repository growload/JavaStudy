package com.zde.study.producer;

/**
 * @version v1.0
 * @author: zdefys
 * @date: 2019/8/31 21:37
 */
public class TestMain {
    public static void main(String[] args) {

        Warehouse house = new Warehouse();
        Producer p = new Producer(house);
        //设置线程的优先级别1-10
        p.setPriority(10);
        Consumer c1 = new Consumer(house);
        Consumer c2 = new Consumer(house);
        p.start();
        c1.start();
        c2.start();
    }
}
