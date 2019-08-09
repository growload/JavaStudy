package com.zde.study.enums;

/**
 * 描述星期
 *
 * @version v1.0
 * @author: zdefys
 * @date: 2019/8/3 22:09
 */
public class MyDay {

    // 类似单例模式的想法

    // 构造方法私有
    private MyDay() {
    }

    // 所有对象都是属性
    public static final MyDay MONDAY = new MyDay();
    public static final MyDay TUESDAY = new MyDay();
    public static final MyDay WEDNESDAY = new MyDay();
    public static final MyDay THURSDAY = new MyDay();
    public static final MyDay FRIDAY = new MyDay();
    public static final MyDay SATURDAY = new MyDay();
    public static final MyDay SUNDAY = new MyDay();

    //一般属性 一般方法随便设计
}
