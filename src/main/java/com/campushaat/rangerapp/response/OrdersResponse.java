package com.campushaat.rangerapp.response;

import java.util.ArrayList;

import com.campushaat.rangerapp.model.Orders;
//import com.campushaat.rangeraap.models.payLoads.OrderSearch;

public class OrdersResponse extends Response{

	
	private Orders order;
	
	private ArrayList<Orders> ordersList; 
//	private ArrayList<Orders> orderl;

	public OrdersResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public OrdersResponse(BaseResponse baseResponse, Orders order) {
		super();
		this.setBaseResponse(baseResponse); 
		this.order = order;
	}
	
	
	public OrdersResponse(BaseResponse baseResponse, ArrayList<Orders> ordersList) {
		super();
		this.setBaseResponse(baseResponse); 
		this.ordersList = ordersList;
	}
	
	public OrdersResponse(BaseResponse baseResponse) {
		super();
		this.setBaseResponse(baseResponse); 
		
	}
	
	
	
	/**
	 * @param orderParams
	 */
//	public OrdersResponse(BaseResponse baseResponse, OrderSearch orderParams) {
//		super();
//		this.setBaseResponse(baseResponse); 
//		this.orderParams = orderParams;
//	}

//	public OrderSearch getOrderParams() {
//		return orderParams;
//	}

//	public void setOrderParams(OrderSearch orderParams) {
//		this.orderParams = orderParams;
//	}

	public Orders getOrder() {
		return order;
	}
	public void setOrder(Orders order) {
		this.order = order;
	}

	public ArrayList<Orders> getOrdersList() {
		return ordersList;
	}

	public void setOrdersList(ArrayList<Orders> ordersList) {
		this.ordersList = ordersList;
	}

	
}
