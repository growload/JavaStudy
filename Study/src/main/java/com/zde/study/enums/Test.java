package com.zde.study.enums;

import java.util.Scanner;

/**
 * @version v1.0
 * @author: zdefys
 * @date: 2019/8/3 22:14
 */
public class Test {
    public static void main(String[] args) {
//        MyDay myDay = MyDay.MONDAY;
//        Day day = Day.friday;
        //day---->枚举类型的对象  默认继承object
        //除了继承Object类的方法外 还有一些compareTo方法  默认继承Enum


        //输入字符串 输出对应的信息
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个星期的英文单词");
        String key = input.nextLine();
        Day day = Day.valueOf(key);
        switch (day) {
            case monday:
                System.out.println("您输入的是星期一");
                break;
            case tuesday:
                System.out.println("您输入的是星期二");
                break;
            case wednesday:
                System.out.println("您输入的是星期三");
                break;
            case thursday:
                System.out.println("您输入的是星期四");
                break;
            case friday:
                System.out.println("您输入的是星期五");
                break;
            case saturday:
                System.out.println("您输入的是星期六");
                break;
            case sunday:
                System.out.println("您输入的是星期日");
                break;
            default:
                System.out.println("你输入的参数有误");
        }

    }
}
