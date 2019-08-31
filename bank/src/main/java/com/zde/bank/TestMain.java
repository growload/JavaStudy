package com.zde.bank;

import java.util.Scanner;

/**
 * @version v1.0
 * @author: zdefys
 * @date: 2019/8/28 19:36
 */
public class TestMain {
    public static void main(String[] args) {
        Test t = new Test();
        Scanner input = new Scanner(System.in);
        System.out.println("欢迎您使用银行自助服务系统\n");
        String aname = input.nextLine();
        System.out.println("请输入密码：");
        String apassword = input.nextLine();
        String loginResult = t.login(aname, apassword);
        System.out.println(loginResult);
    }
}
