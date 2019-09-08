package com.zde.study.testmethod;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @version v1.0
 * @author: zdefys
 * @date: 2019/9/3 19:55
 */
public class TestMethod {

    public static void main(String[] args) {
        Class clazz = Person.class;

        try {
//            Person p = (Person)clazz.newInstance();
            /*Method m = clazz.getMethod("eat");
            Method m1 = clazz.getMethod("eat",String.class);

            Class mt = m.getReturnType();
            String mn = m.getName();

            Class[] mpts = m.getParameterTypes();

            Class[] mets = m.getExceptionTypes();

            Method[] ms = clazz.getMethods();
            String s = (String)m1.invoke(p, "测试参数");*/

           /* Method m = clazz.getDeclaredMethod("testPrivate");
            Method[] m1 = clazz.getDeclaredMethods();
            m.setAccessible(true);
            System.out.println(m.getName());*/


            Constructor c = clazz.getConstructor(String.class);
            clazz.getDeclaredConstructor(String.class);
            Constructor[] cons = clazz.getConstructors();
            Person p1 = (Person) c.newInstance("name");
            System.out.println(p1);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
