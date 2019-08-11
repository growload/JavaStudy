package com.zde.study.teststring;

/**
 * @version v1.0
 * @author: zdefys
 * @date: 2019/8/9 23:35
 */
public class TestString {

    //8.设计一个方法 获取字符串中的全部数字
    public int findNumber(String str) {

        String result = "";
        str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            int code = str.codePointAt(i);
            if (code >= 48 && code <= 57) {
                result += (char)code;
            }
        }
        return Integer.parseInt(result);
    }

    //7.设计一个方法 将给定的字符串每一个首字母大写
    public String firstLetterToUpperCase(String str) {
        String result = "";
        String[] value = str.split("");
        for (int i = 0; i < value.length; i++) {
            String word = value[i];
            String concat = word.substring(0, 1).toUpperCase().concat(word.substring(1));
            result = result.concat(concat + "");
        }
        return result.trim();
    }


    //6.设计一个方法 统计给定字母在字符串中出现的次数
    public int letterExistCount(String str, char letter) {
        /*int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==letter){
                count++;
            }
        }
        return count;*/
        return str.length() - str.replace(String.valueOf(letter), "").length();
    }

    //5.设计一个方法 寻找若干字符串中最长的那个  ab,abc,abcd--->abcd
    public String findMaxLengthString(String... strs) {
        String result = strs[0];
        int maxLength = strs[0].length();
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() > maxLength) {

                maxLength = strs[i].length();
                result = strs[i];
            }
        }
        return result;
    }

    //4.设计一个方法 将给定的字符串右位移x位置 （helloworld,2）--->ldhellowor
    public String moveToRight(String str, int count) {
        if (count > str.length()) {
            count %= str.length();
        }
        //先截取
        String begin = str.substring(0, str.length() - count);
        String end = str.substring(str.length() - count).concat(begin);
        return end;

    }

    //3.设计一个方法 判断给定字符串是否是回文
    public boolean isPalindrome(String str) {
        if (this.reverse(str).equals(str)) {
            return true;
        }
        return false;
    }

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
