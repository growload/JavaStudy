package com.zde.study.testfile;

/**
 * @version v1.0
 * @author: zdefys
 * @date: 2019/8/24 19:45
 */
public class TestMethod {
    public static void main(String[] args) {
        TestMethod testMethod = new TestMethod();
        testMethod.buildTower(5);
    }
    //递归---本质就是方法的调用
    public void buildTower(int floor){
        if (floor!=1) {
            buildTower(floor-1);
        }
        System.out.println("盖到第" + floor + "层宝塔了");
    }
}
