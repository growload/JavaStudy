package com.zde.study.ioc;

/**
 * @version v1.0
 * @author: zdefys
 * @date: 2019/9/3 21:17
 */
public class Question {


    private String title;

    private String  answer;

    public Question(){

    }

    public Question(String title,String answer){
        this.answer = answer;
        this.title = title;
    }

    public String toString(){
        return "{" + title + "," + answer+"}";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
