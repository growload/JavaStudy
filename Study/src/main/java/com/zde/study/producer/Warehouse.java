package com.zde.study.producer;

import java.util.ArrayList;

/**
 * @version v1.0
 * @author: zdefys
 * @date: 2019/8/31 21:16
 */
public class Warehouse {

    //仓库里面的集合 存放元素
    private ArrayList<String> list = new ArrayList<>();

    //向集合内添加元素的方法
    public synchronized void add(){
        if (list.size()<20) {
            list.add("a");
        } else {
            try {
                this.notifyAll();
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    //从集合内获取元素
    public synchronized void get(){
        if (list.size()>0) {
            list.remove(0);
        } else {
            try {
                this.notifyAll();
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
