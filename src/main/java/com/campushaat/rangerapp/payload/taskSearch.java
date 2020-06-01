package com.campushaat.rangerapp.payload;

import com.campushaat.rangerapp.model.Orders;
import com.campushaat.rangerapp.model.Users;

public class taskSearch {
	String starttime;  // start date time
	
						// end date time
	String taskendtime;
	
	String taskstatus; /// using this via order type  so this is not in use
	String campusId;   // task of campus
	Users ranger;  // using for sort via ranger and 
	Orders order; /// for order type and orderid
	
	
	//	datestrat date end   #############3
	
	//  time start time end  ##############
	
	//	search key task status
	
	
	//	campussearch  ##################
	
	// ranger id   #############################
	// order id    ##############
	
	// task type pick up or deliver   #############
	
	
	
	
	
	public taskSearch() {
		super();
	}
	
	public String getTaskendtime() {
		return taskendtime;
	}

	public void setTaskendtime(String taskendtime) {
		this.taskendtime = taskendtime;
	}
	
	public String getTaskstatus() {
		return taskstatus;
	}

	public void setTaskstatus(String taskstatus) {
		this.taskstatus = taskstatus;
	}

	public String getCampusId() {
		return campusId;
	}

	public void setCampusId(String campusId) {
		this.campusId = campusId;
	}

	public Users getRanger() {
		return ranger;
	}

	public void setRanger(Users ranger) {
		this.ranger = ranger;
	}

	public Orders getOrder() {
		return order;
	}

	public void setOrder(Orders order) {
		this.order = order;
	}

	public String getStarttime() {
		return starttime;
	}
	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}
	

}
