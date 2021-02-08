package com.example.command;


import java.util.ArrayList;

public class ScoresWrapper {
    
    private ArrayList<ScoresCommand> scoresCommand;
    
    private Quiz quiz;

    public ArrayList<ScoresCommand> getScoresCommand() {
        return scoresCommand;
    }

    public void setScoresCommand(ArrayList<ScoresCommand> scoresCommand) {
        this.scoresCommand = scoresCommand;
    }

    public Quiz getQuiz() {
        return quiz;
    }

    public void setQuiz(Quiz quiz) {
        this.quiz = quiz;
    }

    @Override
    public String toString() {
        return "ScoresWrapper{" + "scoresCommand=" + scoresCommand + ", quiz=" + quiz + '}';
    }
   
}
