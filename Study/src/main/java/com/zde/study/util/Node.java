package com.zde.study.util;

/**
 * 节点
 *
 * @version v1.0
 * @author: zdefys
 * @date: 2019/8/1 21:23
 */
public class Node {

    public Node prev;  // 上一个node对象
    public int item;   // 当前数据
    public Node next;  // 下一个node对象

    public Node(Node prev, int item, Node next) {
        this.prev = prev;
        this.item = item;
        this.next = next;
    }
}
