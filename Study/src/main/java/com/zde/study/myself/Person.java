package com.zde.study.myself;

/**
 * @version v1.0
 * @author: zdefys
 * @date: 2019/9/6 20:10
 */
public class Person {

    private String name;

    private Integer age;

    private String sex;

    @MyAnnotation({"张德恩","18","男"})
    public Person(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
