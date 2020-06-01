package com.campushaat.rangerapp.response;

import java.util.ArrayList;

import com.campushaat.rangerapp.model.Task;

public class taskResponce extends Response{
	private Task task;
	private ArrayList<Task> tasklist;
	
	public taskResponce() {
		super();
	}

	public taskResponce(BaseResponse baseResponse,Task t) {
		super();
		this.setBaseResponse(baseResponse); 
		this.task = t;
	}
	
	public taskResponce(BaseResponse baseResponse,ArrayList<Task> tasklist) {
		super();
		this.setBaseResponse(baseResponse); 
		this.tasklist = tasklist;
	}
	
	public taskResponce(BaseResponse baseResponse) {
		super();
		this.setBaseResponse(baseResponse); 
	}

	public Task getTask() {
		return task;
	}

	public void setTask(Task task) {
		this.task = task;
	}

	public ArrayList<Task> getTasklist() {
		return tasklist;
	}

	public void setTasklist(ArrayList<Task> tasklist) {
		this.tasklist = tasklist;
	}
	
	
}
