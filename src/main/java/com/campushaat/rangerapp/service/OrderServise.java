package com.campushaat.rangerapp.service;

import java.sql.Connection;
import java.util.ArrayList;

import org.apache.commons.dbutils.DbUtils;

import com.campushaat.rangerapp.response.BaseResponse;
import com.campushaat.rangerapp.response.OrderSection;

//import com.campushaat.rangerapp.services.ApiLogService;

import com.campushaat.rangerapp.utils.Constants;
import com.campushaat.rangerapp.utils.DBConnectionHandler;
import com.campushaat.rangerapp.Dao.ordersDao;
import com.campushaat.rangerapp.model.Orders;
import com.campushaat.rangerapp.model.Users;
import com.campushaat.rangerapp.response.OrdersResponse;
import com.google.gson.Gson;



public class OrderServise {
	private Connection connection;
	private ordersDao ordersDao;
	
	public OrderServise() throws Exception {
		super();
		this.connection = DBConnectionHandler.getConnection();
		this.ordersDao = new ordersDao();
	}
	
	public OrdersResponse getorderlist(Users areman) {
		
		try {
			
			String query="select * from campushaat_db.orders\r\n" + 
					"inner join orderRoles on orderRoles.orderId = orders.orderId\r\n" + 
					"inner join user on orders.orderCreatedBy=user.userId\r\n" + 
					"inner join address on user.address_id=address.addressId\r\n" + 
					"where (orderRoles.roleId = 601 OR orderRoles.roleId = 602) and orderRoles.roleId != 603 and areamanager_Id="+areman.getUserId()
					+"order by orderCreateDate";
			
	//		slecet * from order 
	//		join with user to find user name
	//		join with address to find address 
			
			
			ArrayList<Orders> orders = ordersDao.makeOrders(query, connection);
			
			if(orders!=null && orders.size()>0)
				return new OrdersResponse(new BaseResponse(Constants.CH200, Constants.ORDER_RETREIVE_SUCCESS), orders);
			else return new OrdersResponse(new BaseResponse(Constants.CH200, Constants.ORDER_RETREIVE_SUCCESS), new Orders());
		}catch(Exception e) {
			System.out.print(e.toString());
			return new OrdersResponse(new BaseResponse(Constants.CH500, Constants.SERVER_ERROR));
		} finally {
//			ApiLogService.insertLogInDB(new Gson().toJson(orderSearch), orderSearch.getCreator(), getOrderFromIdKey);
			DbUtils.closeQuietly(connection);
		}
	}

}
