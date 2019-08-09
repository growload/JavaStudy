package com.zde.study.teststring;

/**
 * @version v1.0
 * @author: zdefys
 * @date: 2019/8/9 23:35
 */
public class TestMain {
    public static void main(String[] args) {
        TestString testString = new TestString();
        String ok = testString.reverse("ok");
        System.out.println(ok);
        String str = testString.reverseAndConcat("abc");
        System.out.println(str);
    }
}
