package com.zde.study.producer;

/**
 * @version v1.0
 * @author: zdefys
 * @date: 2019/8/31 21:16
 */
public class Consumer extends Thread {

    private Warehouse house;
    public Consumer(Warehouse house){
        this.house = house;
    }

    //消费者的方法 一直从仓库获取元素
    @Override
    public void run() {
       while (true){
          house.get();
           System.out.println("消费者拿走了一件货物");
           try {
               Thread.sleep(300);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
    }
}
