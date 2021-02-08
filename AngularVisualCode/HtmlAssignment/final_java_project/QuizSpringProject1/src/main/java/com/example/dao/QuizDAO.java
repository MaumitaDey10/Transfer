package com.example.dao;

import com.link.quizproject.domain.Game;
import com.link.quizproject.domain.Question;
import com.link.quizproject.domain.Quiz;
import java.util.ArrayList;

/**
 *
 * @author Zika
 */
public interface QuizDAO extends EntityDAO<Quiz>{
    
    public abstract ArrayList<Question> loadQuestions(Quiz q);
    
    public abstract ArrayList<Game> loadGames(Quiz q);
    
    
}
