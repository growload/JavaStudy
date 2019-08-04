package computer;

/**
 * @version V1.0
 * @description:
 * @author: zhangdeen
 * @date: 2019/7/28 11:14
 */
public class MachineRoom {
    //机房-电脑  聚合关系
    //数组--存放5台电脑
    public Computer[] computers = new Computer[5];

    //设计方法  给电脑数组进行初始化
    {
        for (int i = 0; i < computers.length; i++) {
            computers[i] = new Computer(i + 1);
        }
    }

    //机房-学生 依赖关系
    public void welcomeStudent(Student student) {
        String studentName = student.getName();
        System.out.println("欢迎" + studentName + "同学进入机房");
        for (int i = 0; i < computers.length; i++) {
            boolean computersState = computers[i].isUsed();
            if (!computersState) {
                student.useComputer(computers[i]);
                break;
            }
        }
    }
}
