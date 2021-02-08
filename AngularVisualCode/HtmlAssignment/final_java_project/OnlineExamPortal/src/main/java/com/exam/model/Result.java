package com.exam.model;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Result
{
	@Id
	@GeneratedValue()
	int userId;
	int testId;
	int questionId;
	Date examDate;
	int examScore;
	
	public Result()
	{
		
	}
	public Result(int userId, int testId, int questionId, Date examDate, int examScore) {
		super();
		this.userId = userId;
		this.testId = testId;
		this.questionId = questionId;
		this.examDate = examDate;
		this.examScore = examScore;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getTestId() {
		return testId;
	}
	public void setTestId(int testId) {
		this.testId = testId;
	}
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public Date getExamDate() {
		return examDate;
	}
	public void setExamDate(Date examDate) {
		this.examDate = examDate;
	}
	public int getExamScore() {
		return examScore;
	}
	public void setExamScore(int examScore) {
		this.examScore = examScore;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((examDate == null) ? 0 : examDate.hashCode());
		result = prime * result + examScore;
		result = prime * result + questionId;
		result = prime * result + testId;
		result = prime * result + userId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Result other = (Result) obj;
		if (examDate == null) {
			if (other.examDate != null)
				return false;
		} else if (!examDate.equals(other.examDate))
			return false;
		if (examScore != other.examScore)
			return false;
		if (questionId != other.questionId)
			return false;
		if (testId != other.testId)
			return false;
		if (userId != other.userId)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Results [userId=" + userId + ", testId=" + testId + ", questionId=" + questionId + ", examDate="
				+ examDate + ", examScore=" + examScore + "]";
	}
	
	
}
