package com.exam.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.model.Result;
import com.exam.repository.ResultRepository;

@Service
public class ResultService 
{
	
	@Autowired
	ResultRepository rrepo;
	
	
	public Optional<Result> findByUserId(int id)
	{
		return rrepo.findById(id);
	}

}
