package com.zde.study.testmethod;

/**
 * @version v1.0
 * @author: zdefys
 * @date: 2019/9/3 19:56
 */
public class Person extends Animal{


    public Person(String s){
        System.out.println("我是Person的无参构造方法");
    }

    public void eat(){
        System.out.println("我是Person的吃饭方法");
    }

    public String  eat(String s){
        System.out.println("我是Person的带参数吃饭方法");
        return s;
    }

    private void testPrivate(){
        System.out.println("我是私有的方法");
    }
}
