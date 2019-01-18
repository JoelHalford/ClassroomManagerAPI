package com.qa.service;

import javax.inject.Inject;

import org.apache.log4j.Logger;

import com.qa.persistence.repository.ClassroomRepository;
import com.qa.util.JSONUtil;

public class ClassroomServiceImp implements ClassroomService {

	private static final Logger LOGGER = Logger.getLogger(ClassroomService.class);

	@Inject
	private ClassroomRepository repo;
	
	@Inject
	private JSONUtil util;
	
	public String getAllClassrooms() {
		LOGGER.info("In ClassroomServiceImpl getAllClassrooms ");
		return repo.getAllClassrooms();
	}

	public String addTrainee(String trainee) {
				
			return repo.addTrainee(trainee);		
	}
	
	public String updateClassroom(Long id, String account) {
		return repo.updateClassroom(id, account);
	}

	public String deleteTrainee(Long id) {
		return repo.deleteTrainee(id);

	}

	public void setRepo(ClassroomRepository repo) {
		this.repo = repo;
	}
}
