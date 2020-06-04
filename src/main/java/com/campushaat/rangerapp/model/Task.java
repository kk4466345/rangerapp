package com.campushaat.rangerapp.model;

import java.util.Date;
import java.util.List;


public class Task {
	
	private String taskid;
	
	private String remark;
	private Users creator;  // area manager
	private Users ranger;	//
	private Orders taskorder;
	
	private Address buyeraddress;  // no requirement  till now cause buyer belong to order
	private String buyesmobile;


	private String sellermobile;  // seller mobile number
	private Address selleraddress;
	
	private String starttime;  // task start time
	private String endtime;		// task end time
	
	private Category tasktype;
	
	private List<Subtask> subtasklist;
	
	
	
//	private List<tasktodo> takslist
	

	
		
	
	public Task() {
		super();
	}
	
	
	public String getSellermobile() {
		return sellermobile;
	}


	public void setSellermobile(String sellermobile) {
		this.sellermobile = sellermobile;
	}


	public String getTaskid() {
		return taskid;
	}


	public void setTaskid(String taskid) {
		this.taskid = taskid;
	}


	public String getRemark() {
		return remark;
	}


	public void setRemark(String remark) {
		this.remark = remark;
	}


	public Users getCreator() {
		return creator;
	}


	public void setCreator(Users creator) {
		this.creator = creator;
	}


	public Users getRanger() {
		return ranger;
	}


	public void setRanger(Users ranger) {
		this.ranger = ranger;
	}


	public Orders getTaskorder() {
		return taskorder;
	}


	public void setTaskorder(Orders taskorder) {
		this.taskorder = taskorder;
	}


	public Address getBuyeraddress() {
		return buyeraddress;
	}


	public void setBuyeraddress(Address buyeraddress) {
		this.buyeraddress = buyeraddress;
	}


	public Address getSelleraddress() {
		return selleraddress;
	}


	public void setSelleraddress(Address selleraddress) {
		this.selleraddress = selleraddress;
	}


	public String getStarttime() {
		return starttime;
	}


	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}


	public String getEndtime() {
		return endtime;
	}


	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}


	public List<Subtask> getSubtasklist() {
		return subtasklist;
	}


	public void setSubtasklist(List<Subtask> subtasklist) {
		this.subtasklist = subtasklist;
	}


	public String getId() {
		return taskid;
	}
	public void setId(String taskid) {
		this.taskid = taskid;
	}



	public Category getTasktype() {
		return tasktype;
	}


	public void setTasktype(Category tasktype) {
		this.tasktype = tasktype;
	}

	public String getBuyesmobile() {
		return buyesmobile;
	}


	public void setBuyesmobile(String buyesmobile) {
		this.buyesmobile = buyesmobile;
	}


}
