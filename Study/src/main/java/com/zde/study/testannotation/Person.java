package com.zde.study.testannotation;

/**
 * @version v1.0
 * @author: zdefys
 * @date: 2019/9/5 18:34
 */
public class Person extends Animal {

    @Override
    public void eat() {
        System.out.println("Person的吃饭方法");
    }
}
