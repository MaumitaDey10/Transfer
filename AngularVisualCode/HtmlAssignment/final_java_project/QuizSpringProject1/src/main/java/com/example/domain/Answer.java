package com.example.domain;

import java.io.Serializable;


@SuppressWarnings("serial")
public class Answer extends EntityImpl implements Serializable{
    
    private int question_id;
    private String text;
    private int correct;

    public Answer() {
    }

    public int getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(int question_id) {
        this.question_id = question_id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getCorrect() {
        return correct;
    }

    public void setCorrect(int correct) {
        this.correct = correct;
    }


    @Override
    public String toString() {
        return "Answer{" + "question_id=" + question_id + ", text=" + text + ", correct=" + correct + '}';
    }
    
    
    
}
