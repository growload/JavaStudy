package com.zde.study.exam;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @version v1.0
 * @author: zdefys
 * @date: 2019/8/17 22:41
 */
public class TestMain {
    public static void main(String[] args) {
        /*Question question = new Question("1.如下哪个选项不是Java基本数据类型？\n\tA.String\n\tB.char\n\tC.int\n\tD.double","A");
        System.out.println(question.getTitle());*/
        //题干和答案  两个字符串 需要存储在一起 变成一个完成的题目
        //面向对象的变成思想-----一道题目当做一个对象？title属性 answer 属性

        //创建考试机
        ExamMachine machine = new ExamMachine();
        //创建学生对象
        Scanner input = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = input.nextLine();
        System.out.println("请输入密码");
        String password = input.nextLine();
        Student student = new Student(username,password);

        String result = machine.login(student.getUsername(), student.getPassword());
        if (result.equals("登录成功")){
            ArrayList<Question> paper = machine.getPaper();
            System.out.println(result+"\n"+student.getUsername()+"开始考试");
            String[] answers = student.exam(paper);
            Teacher teacher = new Teacher();
            int score = teacher.checkPaper(paper, answers);
            System.out.println(student.getUsername()+"最终成绩为："+score);
        }


    }
}
