package com.zde.study.exam;

import java.util.ArrayList;

/**
 * @version v1.0
 * @author: zdefys
 * @date: 2019/8/17 22:22
 */
public class Teacher {

    //批卷子
    public int checkPaper(ArrayList<Question> paper,String[] answers){
        int score = 0;
        for (int i = 0; i < paper.size(); i++) {
            Question question = paper.get(i);
            if (question.getAnswer().equalsIgnoreCase(answers[i])) {
                score+=(100/paper.size());
            }
        }
        return score;
    }
}
