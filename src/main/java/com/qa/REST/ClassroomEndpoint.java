package com.qa.REST;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.qa.service.ClassroomService;


@Path("/classroom")
public class ClassroomEndpoint {

	@Inject
	private ClassroomService service;

	@Path("/getAllClassrooms")
	@GET
	@Produces({ "application/json" })
	public String getAllClassrooms() {
		return service.getAllClassrooms();
	}

	@Path("/addTrainee")
	@POST
	@Produces({ "application/json" })
	public String addTrainee(String trainee) {
		return service.addTrainee(trainee);
	}

	@Path("/updateClassroom/{id}")
	@PUT
	@Produces({ "application/json" })
	public String updateClassroom(@PathParam("id") Long id, String account) {
		return service.updateClassroom(id, account);
	}

	@Path("/deleteTrainee/{id}")
	@DELETE
	@Produces({ "application/json" })
	public String deleteTrainee(@PathParam("id") Long id) {
		return service.deleteTrainee(id);

	}

	public void setService(ClassroomService service) {
		this.service = service;
	}

}
