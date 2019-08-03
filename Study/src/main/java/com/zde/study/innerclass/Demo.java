package com.zde.study.innerclass;

/**
 * @version v1.0
 * @author: zdefys
 * @date: 2019/8/3 12:45
 */
public class Demo {
    private String name = "这是正常类中的属性";

    public void testDemo() {
        System.out.println("这是正常类中的方法");
    }

    // 成员内部类
    public class InnerDemo {
        public void testInnerDemo() {
            System.out.println("这是内部类" + name);
        }
    }
}
