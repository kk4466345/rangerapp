package com.campushaat.rangerapp.response;
import com.campushaat.rangerapp.model.Category;

import java.util.ArrayList;
import java.util.List;

//import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
//import com.campushaat.rangerapp.models.Category;

import com.campushaat.rangerapp.model.Orders;

//import com.campushaat.eShopsAPI.models.payLoads.OrderSearch;

//@DynamoDBDocument

public class OrderSection {

	private Category role;
	private ArrayList<Orders> orderList;
//	private OrderSearch orderSearch;
	
	public Category getRole() {
		return role;
	}
	public void setRole(Category role) {
		this.role = role;
	}
	public List<Orders> getOrderList() {
		return orderList;
	}
	public void setOrderList(ArrayList<Orders> orderList) {
		this.orderList = orderList;
	}
//	public OrderSearch getOrderSearch() {
//		return orderSearch;
//	}
//	public void setOrderSearch(OrderSearch orderSearch) {
//		this.orderSearch = orderSearch;
//	}
}
