package com.zde.study.testset;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @version v1.0
 * @author: zdefys
 * @date: 2019/8/15 19:20
 */
public class TestHashSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("a");
        set.add("c");
        set.add("b");
        set.add("d");
        set.add("e");
        //获取一个迭代器对象  通过set集合获取
        Iterator<String> it = set.iterator();
        //判断下一个位置是否有元素
        //取出所有的元素
        while (it.hasNext()) {
            String value = it.next();
            System.out.println(value);
        }
    }
}
