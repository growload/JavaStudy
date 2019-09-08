package com.zde.study.testreflect;

import java.lang.reflect.Field;

/**
 * @version v1.0
 * @author: zdefys
 * @date: 2019/9/2 20:11
 */
public class TestReflect {

    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("com.zde.study.testreflect.Person");
            Person p = (Person) clazz.newInstance();

            Field name = clazz.getDeclaredField("name");
            //表示私有属性可以直接被操作
            name.setAccessible(true);
            name.set(p,"张德恩");
            System.out.println(p);
           /* Field name = clazz.getField("name");

            name.set(p,"张德恩");
            System.out.println(p);
            Object o = name.get(p);
            System.out.println(o);*/
            /*Class type = name.getType();
            System.out.println(type.getName());*/


            //相当于调用当前的无参构造方法
            //Person p = (Person) clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
           /* int modifiers = clazz.getModifiers();
            System.out.println(modifiers);

            String name = clazz.getName();
            String simpleName = clazz.getSimpleName();
            System.out.println(name);
            System.out.println(simpleName);

            Package aPackage = clazz.getPackage();
            System.out.println(aPackage.getName());

            Class superclass = clazz.getSuperclass();
            System.out.println(superclass);*/

           /* ArrayList<String> list = new ArrayList<>();

            Class clazz = ArrayList.class;*/
            /*Class sclazz = clazz.getSuperclass();
            while (sclazz!=null){
                System.out.println(sclazz.getName());
                sclazz =  sclazz.getSuperclass();
            }
*/
        /*Class[] classes = clazz.getInterfaces();
        for(Class c:classes){
            System.out.println(c.getName());
        }*/
    }
}
