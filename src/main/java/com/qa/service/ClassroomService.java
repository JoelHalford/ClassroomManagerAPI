package com.qa.service;

public interface ClassroomService {

	String getAllClassrooms();

	String addTrainee(String accout);

	String updateClassroom(Long id, String traineeToUpdate);

	String deleteTrainee(Long id);
}
