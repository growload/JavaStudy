package com.zde.study.ioc;

import com.zde.study.system12306.System12306;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * @version v1.0
 * @author: zdefys
 * @date: 2019/9/3 21:10
 */
public class MySpring {

    //设计一个方法  帮我控制对象的创建
    public Object getBean(String className){
        Object obj = null;
        Scanner input = new Scanner(System.in);
        System.out.println("请给"+className+"类的对象赋值");
        try {
            //获取方法传递进来的参数对应的类
            Class clazz = Class.forName(className);
            obj = clazz.newInstance();

            //在这里做一个自动DI注入  对象中的所有属性值
            //找到每一个不同对象中的所有set方法  给属性赋值
            //通过拼接字符串的方式处理名字
            //1.通过clazz找寻类中的所有私有属性---获取每一个属性的名字set属性
            Field[] fields = clazz.getDeclaredFields();
            for (Field field:fields){
                String fieldName = field.getName();
                //2.手动拼接字符串
                String firstLetter = fieldName.substring(0,1).toUpperCase();
                String otherLetters = fieldName.substring(1);
                StringBuilder setMethodName = new StringBuilder("set");
                setMethodName.append(firstLetter);
                setMethodName.append(otherLetters);

                //3.获取field对应的类型
                Class fieldClass = field.getType();

                //4.通过处理好的set方法名找寻类中的set方法
                Method setMethod= clazz.getMethod(setMethodName.toString(),fieldClass);

                System.out.println("请给"+fieldName +"属性提供值");
                String value = input.nextLine();

                //需要执行属性对应的set方法 给属性赋值  方法就结束了
                Constructor con = fieldClass.getConstructor(String.class);
                setMethod.invoke(obj,con.newInstance(value));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return obj;
    }
}
