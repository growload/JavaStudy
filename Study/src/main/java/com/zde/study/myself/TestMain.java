package com.zde.study.myself;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @version v1.0
 * @author: zdefys
 * @date: 2019/9/5 19:54
 */
public class TestMain {


    public static void main(String[] args) {


        MySpring mySpring = new MySpring();

       Person p  =  (Person) mySpring.getBean("com.zde.study.myself.Person");
        System.out.println(p);



       /* Class clazz = Person.class;

        try {
            Field name = clazz.getDeclaredField("name");
//            MyAnnotation annotation = name.getAnnotation(MyAnnotation.class);
//            System.out.println(annotation.value()[0]);


            Annotation a = name.getAnnotation(MyAnnotation.class);

            Class aclazz = a.getClass();

            Method amathod = aclazz.getMethod("value");

            String[] values = (String[])amathod.invoke(a);
        } catch (Exception e) {
            e.printStackTrace();
        }*/
    }

}
