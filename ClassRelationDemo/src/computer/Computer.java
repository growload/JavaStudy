package computer;

/**
 * @version V1.0
 * @description:
 * @author: zhangdeen
 * @date: 2019/7/28 11:14
 */
public class Computer {
    //编号
    private int number;
    //属性--自己的状态
    public boolean used = false;//true开着的  false 关着的

    //设计构造方法
    public Computer() {
    }

    public Computer(int number) {
        this.number = number;
    }

    //设计两个方法 获取电脑的编号  电脑的状态
    public int getNumber(){
        return this.number;
    }

    public boolean isUsed(){
        return this.used;
    }
    //设计方法  被打开
    public void beOpen(){
        this.used = true;
        System.out.println(this.number + "号电脑被打开");
    }

    //设计方法  被打开
    public void beUsing(){
        System.out.println(this.number + "号电脑被使用中");
    }
    //设计方法  被关闭
    public void beClose(){
        this.used = false;
        System.out.println(this.number + "号电脑被关闭");
    }
}
