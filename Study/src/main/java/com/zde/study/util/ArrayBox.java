package com.zde.study.util;

/**
 * ArrayBox  将数组变得灵活
 *
 * @author: zhangdeen
 * @date: 2019/8/1 20:16
 */
public class ArrayBox implements Box {

    // 设计一个静态常量 存储数组的默认长度
    private static final int DEFAULT_CAPACITY = 10;
    // 设计一个自己的属性 用来存放真实数据的
    private int[] elemenetData;
    // 设计一个自己的属性 用来记录数组内存储的有效元素个数
    private int size = 0;

    public ArrayBox() {
        elemenetData = new int[DEFAULT_CAPACITY];
    }

    public ArrayBox(int capacity) {
        elemenetData = new int[capacity];
    }

    // 用来将用户给定的element存起来 参数是需要存起来的元素 返回值是否存储成功
    public boolean add(int element) {
        // 找一个别人 做事 确保数组的内部容量够用
        this.ensureCapacityInternal(size + 1);
        elemenetData[size++] = element;
        return true;
    }

    // 用来获取给定位置的元素 参数是索引位置  返回值是取得的元素
    public int get(int index) {
        // 检测给定的index是否合法
        this.rangeCheck(index);
        return elemenetData[index];
    }

    // 用来删除给定位置的元素 参数是索引位置 返回值是删除的元素
    public int remove(int index) {
        this.rangeCheck(index);

        int oldValue = elemenetData[index];
        for (int i = index; i < size - 1; i++) {
            elemenetData[i] = elemenetData[i + 1];
        }
        elemenetData[--size] = 0;
        return oldValue;
    }

    // 用来获取长度
    public int getSize() {
        return this.size;
    }

    //=======================< 内部方法 >===========================

    // 确保数组内部的容量
    private void ensureCapacityInternal(int minCapacity) {
        // 判断如果你需要的最小容量比原数组的长度还要大
        if (minCapacity - elemenetData.length > 0) {
            // 需要进行数组的扩容  找别人计算扩容的大小
            this.grow(minCapacity);
        }
    }

    // 扩容
    private void grow(int minCapacity) {
        // 获取原数组的长度
        int oldCapacity = elemenetData.length;
        // 在原数组之上扩容1.5倍
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        // 比较计算后的长度与所需的长度
        if (newCapacity - minCapacity < 0) {
            newCapacity = minCapacity;
        }
        // 创建新数组 把原数组的数据移到到新数组
        elemenetData = this.copyOf(elemenetData, newCapacity);
    }

    // 将原数组的元素移入新数组
    private int[] copyOf(int[] oldArray, int newCapacity) {
        // 按照提供的长度创建一个新数组
        int[] newArray = new int[newCapacity];
        for (int i = 0; i < oldArray.length; i++) {
            newArray[i] = oldArray[i];
        }
        return newArray;
    }

    // 检测给定index是否合法
    private void rangeCheck(int index) {
        if (index < 0 || index >= size) {
            // 自定义一个异常
            throw new BoxIndexOutOfBoundsException("Index:" + index + ",Size:" + size);
        }
    }
}
