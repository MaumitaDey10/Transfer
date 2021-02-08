package com.example.dao;

import com.link.quizproject.domain.Answer;
import com.link.quizproject.domain.Question;
import java.util.ArrayList;

/**
 *
 * @author Zika
 */
public interface QuestionDAO extends EntityDAO<Question>{
    
    public ArrayList<Answer> loadPossibleAnswer(Question q);  
    
    public ArrayList<Question> findQuestionByQuizId (Integer id);
    
}
