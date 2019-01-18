package com.qa.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//Entity uses JPA
@Entity
public class Trainee {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long traineeID;
	
	private String traineeName;

	public Trainee(String traineeName) {
		this.traineeName = traineeName;
	}
	
	public Trainee() {

	}

	public String getTrainee() {
		return traineeName;
	}

	public void setTrainee(String traineeName) {
		this.traineeName = traineeName;
	}

	public Long getId() {
		return traineeID;
	}

	public void setId(Long id) {
		this.traineeID = id;
	}
}
