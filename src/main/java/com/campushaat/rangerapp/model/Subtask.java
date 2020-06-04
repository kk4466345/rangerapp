package com.campushaat.rangerapp.model;

public class Subtask {
	private String subtaskId;
	private Category subtype;
	private String status;
	private Category subtasktype;
	
	public Subtask() {
		super();
	}
	
	
	public String getSubtaskId() {
		return subtaskId;
	}
	public void setSubtaskId(String subtaskId) {
		this.subtaskId = subtaskId;
	}
	public Category getSubtype() {
		return subtype;
	}
	public void setSubtype(Category subtype) {
		this.subtype = subtype;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}


	public Category getSubtasktype() {
		return subtasktype;
	}


	public void setSubtasktype(Category subtasktype) {
		this.subtasktype = subtasktype;
	}
	
	

}
