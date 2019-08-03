package com.zde.study.innerclass;

/**
 * @version v1.0
 * @author: zdefys
 * @date: 2019/8/3 12:45
 */
public class TestMain {
    public static void main(String[] args) {

        Demo demo = new Demo();
        Demo.InnerDemo innerDemo = demo.new InnerDemo();
        innerDemo.testInnerDemo();
    }
}
