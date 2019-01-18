package com.qa.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

//Entity uses JPA
@Entity
@Table(name = "TRAINEE")
public class Trainee {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long traineeID;
	private String traineeName;	
	private Long classroomID;
    
	public Trainee(Long classroomID, String traineeName) {
		this.classroomID = classroomID;
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
	
	public Long getClassroomID() {
		return classroomID;
	}

	public void setClassroomID(Long classroomID) {
		this.classroomID = classroomID;
	}
}
