package com.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exam.model.Result;

@Repository
public interface ResultRepository extends JpaRepository<Result, Integer>
{

}
