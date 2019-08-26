package com.zde.study.testbuffer;

import java.io.Serializable;

/**
 * @version v1.0
 * @author: zdefys
 * @date: 2019/8/25 20:06
 */
public class Person implements Serializable {

    private String name;
    private int age;
    public Person(){}
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
