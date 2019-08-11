package com.zde.study.bufferandbuilder;

/**
 * @version v1.0
 * @author: zdefys
 * @date: 2019/8/10 20:07
 */
public class TestStringBuilder {
    public static void main(String[] args) {
        //无参构造方法，构建一个默认长度16空间的对象 char[]
        StringBuilder builder=new StringBuilder();
        //利用给定的参数 构建一个自定义长度空间的对象 char[]
        StringBuilder builder1 = new StringBuilder(20);
        //利用带String参数的构造方法 默认数组长度字符串长度+16
        StringBuilder builder2 = new StringBuilder("abc");
    }
}
