package contains;

/**
 * @version V1.0
 * @description:
 * @author: zhangdeen
 * @date: 2019/7/25 19:36
 */
public class Car {

    //属性
    public String brand;//汽车品牌
    public String type;//型号
    public String color;//颜色
    public Wheel wheel;

    //方法
    public void showCar() {
        System.out.println("这是一辆" + brand + "牌的" + type + "型号" + color + "的小汽车");
        System.out.println("车上搭载着" + wheel.brand + "牌" + wheel.size + "尺寸的" + wheel.color + "的车轮子");
    }
}
