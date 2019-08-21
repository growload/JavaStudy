package com.zde.study.exam;

/**
 * @version v1.0
 * @author: zdefys
 * @date: 2019/8/17 22:49
 */
public class Question {
    private String title;//题目题干
    private String answer;//真实答案

    public Question(String title, String answer) {
        this.title = title;
        this.answer = answer;
    }

    // 重写方法 将默认比较题目对象的地址规则  改成比较题干
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }
        if (obj instanceof Question) {
            Question anotherQuestion = (Question) obj;
            // this.title 按照？截取 与anotherQuestion.title?截取之前的部分比较
            if (this.title.equals(anotherQuestion.title)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.title.hashCode();

    }

    public String getTitle() {
        return this.title;
    }

    public String getAnswer() {
        return this.answer;
    }
}
