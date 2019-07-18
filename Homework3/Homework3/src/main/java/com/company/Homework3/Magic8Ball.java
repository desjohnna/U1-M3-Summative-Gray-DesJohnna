package com.company.Homework3;

public class Magic8Ball {

    private String question;
    private String answer;

    public Magic8Ball() {

    }

    public Magic8Ball(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
}
