package com.zde.study.system12306;

/**
 * @version v1.0
 * @author: zdefys
 * @date: 2019/8/31 17:57
 */
public class TestMain {
    public static void main(String[] args) {
        Window w1 = new Window("北京西站");
        Window w2 = new Window("北京南站");
        Window w3 = new Window("北京东站");
        w1.start();
        w2.start();
        w3.start();
    }
}
