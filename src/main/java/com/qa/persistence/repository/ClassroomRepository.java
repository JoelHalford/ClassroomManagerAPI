package com.qa.persistence.repository;

public interface ClassroomRepository {
	
	String getAllClassrooms();

	String addTrainee(String trainee);

	String updateClassroom(Long id, String traineeToUpdate);

	String deleteTrainee(Long id);
}
