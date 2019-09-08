package com.zde.study.myself;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @version v1.0
 * @author: zdefys
 * @date: 2019/9/8 19:56
 */
public class MySpring {

    //设计一个方法 给一个类名字  返回一个对象 对象内的属性值存在着
    public Object getBean(String className){
        Object obj = null;//变量接受最终的对象
        try {
            //1.通过传递的className来获取对象的类Class
            Class clazz = Class.forName(className);
            //2.通过clazz创建一个空的对象
            Constructor con = clazz.getConstructor();
            obj = con.newInstance();
            //3.创建对象以后 讲对象内的所有属性自动复制DI

            //4.首先获取属性的值  类的无参构造方法上
            Annotation a = con.getAnnotation(MyAnnotation.class);
            //5.获取a注解对象内携带的信息---person对象所有的属性值
            Class aclazz = a.getClass();
            Method amethod = aclazz.getMethod("value");

            String[] values = (String[])amethod.invoke(a);

            //6.将values中的每一个值  对应的赋给属性
            //找寻属性对应的set方法赋值

            Field[] fields = clazz.getDeclaredFields();//获取全部的属性

            for (int i = 0 ;i<fields.length;i++) {
                String fieldName = fields[i].getName();
                String firstLetter = fieldName.substring(0,1).toUpperCase();
                String otherLetter = fieldName.substring(1);
                StringBuilder methodName = new StringBuilder("set");
                methodName.append(firstLetter);
                methodName.append(otherLetter);
                Class filedType = fields[i].getType();
                Method setMethod = clazz.getMethod(methodName.toString(),filedType);
                //执行找到的set方法 给对应的属性赋值
                setMethod.invoke(obj,filedType.getConstructor(String.class).newInstance(values[i]));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return obj;
    }
}
