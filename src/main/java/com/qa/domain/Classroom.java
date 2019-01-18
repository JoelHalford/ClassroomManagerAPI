package com.qa.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//Entity uses JPA
@Entity
public class Classroom {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long classroomID;
	
	private String trainer;

	public Classroom(String trainer) {
		this.trainer = trainer;
	}
	
	public Classroom() {

	}

	public String getTrainer() {
		return trainer;
	}

	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}

	public Long getId() {
		return classroomID;
	}

	public void setId(Long id) {
		this.classroomID = id;
	}
	

}
