package com.qa.persistence.repository;

import static javax.transaction.Transactional.TxType.REQUIRED;
import static javax.transaction.Transactional.TxType.SUPPORTS;

import java.util.Collection;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import com.qa.domain.Classroom;
import com.qa.util.JSONUtil;

@Transactional(SUPPORTS)
@Default
public class ClassroomDBRepository implements ClassroomRepository {

	@PersistenceContext(unitName = "primary")
	private EntityManager manager;

	@Inject
	private JSONUtil util;

	public String getAllClassrooms() {
		// TODO Auto-generated method stub
		Query query = manager.createQuery("Select a FROM Classroom a");
		Collection<Classroom> classrooms = (Collection<Classroom>) query.getResultList();
		return util.getJSONForObject(classrooms);
	}

	@Transactional(REQUIRED)
	public String addTrainee(String classroom) {
		// TODO Auto-generated method stub
		Classroom aClassroom = util.getObjectForJSON(classroom, Classroom.class);
		manager.persist(aClassroom);
		return "{\"message\": \"account has been sucessfully added\"}";
	}

	public String updateClassroom(Long id, String traineeToUpdate) {

		return "{\"message\": \"account sucessfully updated\"}";
	}

	public String deleteTrainee(Long id) {
		// TODO Auto-generated method stub
		Classroom classroomInDB = findClassroom(id);
		if (classroomInDB != null) {
			manager.remove(classroomInDB);
		}
		return "{\"message\": \"account sucessfully deleted\"}";
	}
	
	private Classroom findClassroom(Long id) {
		return manager.find(Classroom.class, id);
	}
	
//	private Classroom findTrainee(Long id) {
//		return manager.find(Trainee.class, id);
//	}

	public void setManager(EntityManager manager) {
		this.manager = manager;
	}

	public void setUtil(JSONUtil util) {
		this.util = util;
	}

}
