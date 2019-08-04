package computer;

/**
 * @description:
 * @version V1.0
 * @author: zhangdeen
 * @date: 2019/7/28 11:14
 */
public class Test {
    public static void main(String[] args) {
        MachineRoom machineRoom = new MachineRoom();
        Student student = new Student("zde");
        machineRoom.welcomeStudent(student);
    }
}
