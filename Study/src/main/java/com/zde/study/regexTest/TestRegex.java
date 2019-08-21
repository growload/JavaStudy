package com.zde.study.regexTest;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @version v1.0
 * @author: zdefys
 * @date: 2019/8/11 18:42
 */
public class TestRegex {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("请你输入一个字符串");
//        String str = input.nextLine();

        //判断输入的str字符串内容是否满足什么样的格式
        //第一个字母必须是a  第二个字母是abc其中的一个
//        boolean result = str.matches("a[abc]");
//        System.out.println(result);

        //第一个字母必须是a  第二个字母不能是abc其中的一个
//        boolean result = str.matches("a[^abc]");
//        System.out.println(result);

        //第一个字母必须是a  第二个字母任意范围之内的一个字母
//        boolean result = str.matches("a[a-zA-Z]");
//        System.out.println(result);

        //第一个字母必须是a  第二个字母a-z都可以  不能是b和c
//        boolean result = str.matches("a[a-z&&[^bc]]");
//        System.out.println(result);

        String str = "123456abc123456abc123456abc123456abc";

        //1.利用Pattern类创建一个模式 理解为是一个正则表达式对象
        Pattern pattern = Pattern.compile("\\d{6}");//邮编
        //2.需要提供一个字符串
        //3.利用Pattern模式对象创建一个匹配器
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()){
            System.out.println(matcher.group());
        }


    }
}
