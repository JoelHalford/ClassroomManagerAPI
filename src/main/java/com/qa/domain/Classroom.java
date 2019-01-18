package com.qa.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

//Entity uses JPA
@Entity
@Table(name = "CLASSROOM")
public class Classroom {	
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long classroomID;
	
	private String trainer;
	
    @OneToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER
    )
    @JoinColumn(name = "classroomID")
    private List<Trainee> trainee = new ArrayList<>();
	
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
