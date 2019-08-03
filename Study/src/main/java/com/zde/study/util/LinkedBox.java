package com.zde.study.util;

/**
 * 封装链表
 *
 * @version v1.0
 * @author: zhangdeen
 * @date: 2019/8/1 21:07
 */
public class LinkedBox implements Box {

    // 创建几个属性
    private Node first;  // 记录头节点
    private Node last;   // 记录尾节点
    private int size;    // 记录有效元素个数

    public boolean add(int element) {
        // 将element存入一个新的Node对象里 添加至链表的尾端
        this.linkLast(element);
        return true;
    }

    public int get(int index) {
        // 检测index是否合法
        this.rangeCheck(index);
        // 寻找index对应位置的那个node对象 将对象中的数据取出来
        Node targetNode = this.node(index);
        return targetNode.item;
    }

    public int remove(int index) {
        // 检测范围是否合法
        this.rangeCheck(index);
        // 找到index位置的那个node
        Node targetNode = this.node(index);
        // 删除当前的目标节点
        int oldValue = unlink(targetNode);
        return oldValue;
    }

    public int getSize() {
        return this.size;
    }

    //=========================< 内部的方法 >======================

    // 设计一个方法 将元素添加在新的node里 挂在链表尾端
    private void linkLast(int element) {
        // 获取链表的尾节点
        Node l = last;
        // 创建一个新的node对象 将新数据包装起来
        Node newNode = new Node(l, element, null);
        // 将新节点对象设置为尾节点
        last = newNode;
        // 严谨的判断
        if (l == null) { // 如果原来尾节点没有对象 证明这个链表没有使用过
            first = newNode;
        } else { // 原来用过 刚才已经将新的节点连接在last之后啦
            l = newNode;
        }
        // 有效元素个数增加一个
        size++;
    }

    // 负责检测index
    private void rangeCheck(int index) {
        if (index < 0 || index >= size) {
            throw new BoxIndexOutOfBoundsException("Index:" + index + ",Size" + size);
        }
    }

    // 负责找寻给定index位置的node对象
    private Node node(int index) {
        Node targetNode;// 用来存储找到的当前那个目标
        // 判断index范围是在前半部分  还是在后半部分
        if (index < (size >> 1)) {
            // 从前往后找比较快
            targetNode = first;
            for (int i = 0; i< index;i++){
                targetNode =  targetNode.next;
            }
        } else {
            // 从后往前找
            targetNode = last;
            for (int i = size - 1; i > index; i--) {
                targetNode = targetNode.prev;
            }
        }
        return targetNode;
    }

    // 删除当前目标节点
    private int unlink(Node targetNode) {
        // 获取当前node的item信息
        int oldValue = targetNode.item;
        // 找到当前node的前一个
        Node prev = targetNode.prev;
        // 找到当前node的下一个
        Node next = targetNode.next;
        // 删除节点对象
        if (prev==null){
            // 当前节点就是第一个
            first = next;
        } else {
            prev.next = next;
            targetNode.prev = null;
        }
        if (next==null){
            // 当前节点就是第一个
            last = prev;
        } else {
            last.prev = prev;
            targetNode.next = null;
        }
        // 让有效元素减少一个
        size--;
        return oldValue;
    }
}
