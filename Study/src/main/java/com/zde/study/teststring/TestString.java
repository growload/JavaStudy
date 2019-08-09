package com.zde.study.teststring;

/**
 * @version v1.0
 * @author: zdefys
 * @date: 2019/8/9 23:35
 */
public class TestString {

    //2.设计一个方法  将给定字符串的正序和反序进行连接 ok--->okko
    public String reverseAndConcat(String str) {
        /*//1.将str反转
        String value = this.reverse(str);
        //2.str之后拼接反转过来的字符串
        String result = str.concat(value);
        return result;*/

        return str.concat(this.reverse(str));
    }

    //1.设计一个方法 将字符串反转  ok-->ko
    public String reverse(String str) {
        //StringBuffer[线程安全]  StringBuilder[线程不安全]
        return new StringBuilder(str).reverse().toString();
        /*//将str变化为数组
        char[] value = str.toCharArray();
        //数组头尾互换
        for (int i = 0; i < value.length / 2; i++) {
            char temp = value[i];
            value[i] = value[value.length-1-i];
            value[value.length-1-i] = temp;
        }
        //数组组成字符串
        return new String(value);*/
    }
}
