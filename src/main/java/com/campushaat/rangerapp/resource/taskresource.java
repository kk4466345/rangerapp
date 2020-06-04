package com.campushaat.rangerapp.resource;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;

import com.campushaat.rangerapp.model.Task;
import com.campushaat.rangerapp.model.Users;
import com.campushaat.rangerapp.model.taskSarchparam;
import com.campushaat.rangerapp.payload.taskSearch;
import com.campushaat.rangerapp.response.OrdersResponse;
import com.campushaat.rangerapp.response.taskResponce;
import com.campushaat.rangerapp.service.OrderServise;
import com.campushaat.rangerapp.service.TaskService;

import javax.ws.rs.GET;
import javax.ws.rs.POST;

@Path("ranger")
public class taskresource {
	
	TaskService ts;
	OrderServise os;
	
	public taskresource() throws Exception {
		super();
		ts = new TaskService();
		os=new OrderServise();
	}
	
	

//	@GET
//    @Produces(MediaType.APPLICATION_JSON)
//    public Task getIt() {
//        return ts.gettask();
//    }
	
	
	@Path("listorder")  
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)	
	public OrdersResponse listorder(Users areamanager) {
		
		return os.getorderlist(areamanager);
		// we will return all the order for an areamanager which is not assigned
		
	}

	
	

	@Path("listTask")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public taskResponce ListTask(taskSearch taskpayload) {
		
		return ts.gettask(taskpayload);
		///
	}
	
	

	
	// 
	
	
	@Path("createtask")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public taskResponce createTask(Task t) {
//		System.out.println("starting\n\n\n\n\n");
		return ts.ctrateTask(t);
//		return null;
	}
	
	
	
}
