package com.example.dao;


import java.util.ArrayList;

import com.example.domain.Answer;


public interface AnswerDAO extends EntityDAO<Answer>{
    
    public ArrayList<Answer> getAnswersByQuestionId(Integer id);
    
    
    
}
