package com.zde.study.producer;

/**
 * @version v1.0
 * @author: zdefys
 * @date: 2019/8/31 21:15
 */
public class Producer extends Thread {

    private Warehouse house;
    public Producer(Warehouse house){
        this.house = house;
    }

    //生产者的run方法   一直向仓库添加元素
    @Override
    public void run() {
        while(true){
            house.add();
            System.out.println("生产者存入了一件货物");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
