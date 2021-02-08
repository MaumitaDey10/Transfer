package com.example.domain;

import java.io.Serializable;


@SuppressWarnings("serial")
public class UserAnswer extends EntityImpl implements Serializable{

    private int game_id;
    private int question_id;
    private int answer_id;

    public UserAnswer() {
    }

    public int getGame_id() {
        return game_id;
    }

    public void setGame_id(int game_id) {
        this.game_id = game_id;
    }

    public int getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(int question_id) {
        this.question_id = question_id;
    }

    public int getAnswer_id() {
        return answer_id;
    }

    public void setAnswer_id(int answer_id) {
        this.answer_id = answer_id;
    }

}
