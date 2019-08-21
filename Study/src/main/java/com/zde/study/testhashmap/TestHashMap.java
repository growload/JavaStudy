package com.zde.study.testhashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * @version v1.0
 * @author: zdefys
 * @date: 2019/8/16 20:12
 */
public class TestHashMap {

    public static void main(String[] args) {

        //创建一个HashMap对象
        HashMap<Integer,String> map = new HashMap<>();
        map.put(5,"bbb");
        map.put(3,"eee");
        map.put(6,"xxx");
        map.put(2,"ccc");
        map.put(6,"aaa");
        map.put(4,"ddd");
        map.put(1,"aaa");
        System.out.println(map);
        //获取map集合的全部key
        Set<Integer> keys = map.keySet();
        //通过迭代器遍历keys
        Iterator<Integer> it = keys.iterator();
        while (it.hasNext()) {
            Integer key = it.next();
            String value = map.get(key);
            System.out.println(key + "---" + value);
        }
    }
}
