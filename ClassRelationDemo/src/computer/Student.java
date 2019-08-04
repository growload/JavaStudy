package computer;

/**
 * @version V1.0
 * @description:
 * @author: zhangdeen
 * @date: 2019/7/28 11:14
 */
public class Student {

    //属性--学生的名字
    private String name;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    //获取学生名字的方法
    public String getName() {
        return this.name;
    }

    public void useComputer(Computer computer) {
        System.out.println(this.name + "开始使用电脑");
        computer.beOpen();
        computer.beUsing();
        computer.beClose();
    }
}
