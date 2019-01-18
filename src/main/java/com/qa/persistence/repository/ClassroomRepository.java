package com.qa.persistence.repository;

public interface ClassroomRepository {
	
	String getAllClassrooms();

	String addTrainee(String accout);

	String updateClassroom(Long id, String traineeToUpdate);

	String deleteTrainee(Long id);
}
