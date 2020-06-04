package com.campushaat.rangerapp.service;

import java.sql.Connection;

import java.util.ArrayList;


import org.apache.commons.dbutils.DbUtils;

import com.campushaat.rangerapp.Dao.taskDao;
import com.campushaat.rangerapp.utils.DBConnectionHandler;
import com.campushaat.rangerapp.utils.StringUtils;
import com.campushaat.rangerapp.model.Task;
import com.campushaat.rangerapp.model.Users;
import com.campushaat.rangerapp.model.taskSarchparam;
import com.campushaat.rangerapp.response.BaseResponse;
import com.campushaat.rangerapp.response.taskResponce;
import com.campushaat.rangerapp.utils.Constants;
import com.campushaat.rangerapp.payload.taskSearch;


public class TaskService {
	private Connection connection;
	private taskDao taskdao;
//	private Object connection;
	
	
	public TaskService() throws Exception {
		super();
		this.connection = DBConnectionHandler.getConnection();
		this.taskdao = new taskDao();
	}
	
	public taskResponce gettask(taskSearch taskpaylaod) {
		
		
		
		try {
			
			String query=createquery(taskpaylaod);
			System.out.println(query + "\n starting running");
			
			// query to enter value in table
			
			ArrayList<Task> tasklist = taskdao.listTask(query, connection);
			
			if(tasklist!=null && tasklist.size()>0)
				return new taskResponce(new BaseResponse(Constants.CH200, Constants.TASK_RECIVED_SUCCESS), tasklist);
			else return new taskResponce(new BaseResponse(Constants.CH200, Constants.TASK_RECIVED_SUCCESS), new Task());
		
		}catch(Exception e) {
			System.out.print(e.toString());
			return new taskResponce(new BaseResponse(Constants.CH500, Constants.SERVER_ERROR));
		} finally {
			DbUtils.closeQuietly(connection);
		}
		
		
		
	}

	private String createquery(taskSearch taskpaylaod) {
		// TODO Auto-generated method stub
		
		
		String query="select * from campushaat_db.task \r\n" + 
				"inner join orders on orders.orderId=task_orderid\r\n" + 
				"inner join user on user.userId=orders.orderCreatedBy\r\n";
		boolean iswhereset=false;
		
		
		// ###################   ranger id
		
		if(( taskpaylaod.getRanger() != null ) && !StringUtils.isNullOrEmpty(taskpaylaod.getRanger().getUserId()) &&  taskpaylaod.getRanger().getUserId() != null) {
			if(iswhereset) {
				query=query.concat(" and task.rangerId ="+taskpaylaod.getRanger().getUserId());
			}else {
				query=query.concat(" where task.rangerId ="+taskpaylaod.getRanger().getUserId());
				iswhereset=true;
			}
		}
		
		
//		###################3    order id
		
		if((taskpaylaod.getOrder() != null) && !StringUtils.isNullOrEmpty(taskpaylaod.getOrder().getOrderId()) && taskpaylaod.getOrder().getOrderId() != null) {
			if(iswhereset) {
				query=query.concat(" and orders.orderId ="+taskpaylaod.getOrder().getOrderId());
			}else {
				query=query.concat(" where orders.orderId ="+taskpaylaod.getOrder().getOrderId());
				iswhereset=true;
			}
		}
		
//		########################     campus Id   
		if(!StringUtils.isNullOrEmpty(taskpaylaod.getCampusId()) && taskpaylaod.getCampusId() != null) {
			if(iswhereset) {
				query=query.concat(" and orders.orderId="+taskpaylaod.getCampusId());
			}else {
				query=query.concat(" where orders.orderId ="+taskpaylaod.getCampusId());
				iswhereset=true;
			}
		}
		
//		#######################  End Time
		
		if( !StringUtils.isNullOrEmpty(taskpaylaod.getTaskendtime()) &&  taskpaylaod.getTaskendtime() != null) {
			if(iswhereset) {
				query=query.concat(" and task.taskendtime <= '"+taskpaylaod.getTaskendtime()) + "'";
			}else {
				query=query.concat(" where task.taskendtime ='"+taskpaylaod.getTaskendtime())+ "'";
				iswhereset=true;
			}
		}
		
//		######################     start time
		if( !StringUtils.isNullOrEmpty(taskpaylaod.getStarttime()) && taskpaylaod.getStarttime() != null) {
			if(iswhereset) {
				query=query.concat(" and task.taskstarttime >= '"+taskpaylaod.getStarttime())+ "'";
			}else {
				query=query.concat(" where task.taskstarttime ='"+taskpaylaod.getStarttime())+ "'";
				iswhereset=true;
			}
		}
		
		
		
		
//		######################     status
		
		
		if( !StringUtils.isNullOrEmpty(taskpaylaod.getTaskstatus()) && taskpaylaod.getTaskstatus()!= null) {
			if(iswhereset) {
				query=query.concat(" and task.taskstatus >= '"+taskpaylaod.getTaskstatus())+ "'";
			}else {
				query=query.concat(" where task.taskstatus ='"+taskpaylaod.getTaskstatus())+ "'";
				iswhereset=true;
			}
		}

		
		
//		####################### order type  
		
		if( (taskpaylaod.getOrder() != null) && (taskpaylaod.getOrder().getOrderType() != null) && !StringUtils.isNullOrEmpty(taskpaylaod.getOrder().getOrderType().getCategoryId()) && taskpaylaod.getOrder().getOrderType().getCategoryId() != null) {
			if(iswhereset) {
				query=query.concat(" and orders.orderType = "+taskpaylaod.getOrder().getOrderType().getCategoryId());
			}else {
				query=query.concat(" where orders.orderType ="+taskpaylaod.getOrder().getOrderType().getCategoryId());
				iswhereset=true;
			}
		}
		
		
		String sortby=" order by taskstarttime";
		query=query.concat(sortby);
		
		return query;
		
	}

	public taskResponce ctrateTask(Task t) {
		// TODO Auto-generated method stub
		Task task;
		try {
			// 
			String orderid=t.getTaskorder().getOrderId();
			String rangerid=t.getRanger().getUserId();
			String aremanid=t.getCreator().getUserId();
			
			
			
			
			t=taskDao.setseller(connection,t);
			
			t=taskDao.setbuyer(connection,t);
			
			String query="insert into task (task_orderId,rangerId,areamanager_Id,selleraddressId,taskstarttime,taskendtime,Remark,tasktype) "
					+ "VALUES (" 
					+ orderid + ","
					+rangerid+","
					+aremanid+","
					+t.getSelleraddress().getAddressId()+","
					
					+"'"+t.getStarttime()+"',"
					+"'"+t.getEndtime() + "',"
					
					+"\""+t.getRemark() + "\","
					
					+"\""+t.getTasktype().getCategoryId() + "\")";
			
			task= taskDao.createTask(query,connection,t);
			
			task= taskDao.createsubTask(query,connection,task);
			
		}catch(Exception e) {
			System.out.print(e.toString());
			return new taskResponce(new BaseResponse(Constants.CH500, Constants.SERVER_ERROR));
		}finally {
			DbUtils.closeQuietly(connection);
		}
		
		return new taskResponce(new BaseResponse(Constants.CH200, Constants.TASK_CREATE_SUCCESS), task);
		
	}
		
	


}
