package com.zde.study.testreflect;

/**
 * @version v1.0
 * @author: zdefys
 * @date: 2019/9/2 20:12
 */
public class Person {

    private String name;
    private int age;
    public void eat(){
        System.out.println("吃饭的方法");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
