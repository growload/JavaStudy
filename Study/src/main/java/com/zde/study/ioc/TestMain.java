package com.zde.study.ioc;

/**
 * @version v1.0
 * @author: zdefys
 * @date: 2019/9/3 21:19
 */
public class TestMain {

    public static void main(String[] args){
        //创建一个Question对象
       /* MySpring spring = new MySpring();
        Question question = (Question)spring.getBean("com.zde.study.ioc.Question");
        System.out.println(question);*/



        MySpring spring = new MySpring();
        Person person = (Person) spring.getBean("com.zde.study.ioc.Person");
        System.out.println(person);
    }
}
