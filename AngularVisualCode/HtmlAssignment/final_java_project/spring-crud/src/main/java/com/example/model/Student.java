package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "STUDENT")
@Getter
@Setter
public class Student {

	@Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
 
    @Column(name = "NAME")
    private String name;
 
    @Column(name = "GRADE")
    private Integer grade;

	public Object getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getGrade() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setGrade(Object grade2) {
		// TODO Auto-generated method stub
		
	}

	public void setName(Object name2) {
		// TODO Auto-generated method stub
		
	}

	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}
}
