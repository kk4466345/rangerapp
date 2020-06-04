package com.campushaat.rangerapp.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import org.apache.commons.dbutils.DbUtils;

import com.campushaat.rangerapp.model.Address;
import com.campushaat.rangerapp.model.CreatorInfo;
import com.campushaat.rangerapp.model.Orders;
import com.campushaat.rangerapp.model.Product;
import com.campushaat.rangerapp.model.Subtask;
import com.campushaat.rangerapp.model.Task;

public class taskDao {

	public ArrayList<Task> listTask(String query, Connection conn) {
//		OrderSection order = null;
		PreparedStatement selectQuery = null;
		ResultSet rs = null;
		ArrayList<Task> tasklist = new ArrayList<Task>();
		
		
		try {
			
			
			selectQuery = conn.prepareStatement(query);
			rs = selectQuery.executeQuery();
			System.out.print("\nquery run suceessfully completed\n\n");
			while(rs.next()) {
				
				CreatorInfo usr=new CreatorInfo();
				Task task=new Task();
				Orders taskorder=new Orders();
				ArrayList<Product> productlist=new ArrayList<Product>();
				
				
				//	usrname
				
				String firstname=rs.getString("firstName");
				String lastname=rs.getString("lastName");
				String usermobile=rs.getString("mobileNumber");
				String ordId=rs.getString("orderId");
				taskorder.setOrderId(ordId);
				
				productlist=getproductlist(ordId,conn,productlist);
				
				usr.setCreatorFirstName(firstname);
				usr.setCreatorLastName(lastname);
				usr.setMobile(usermobile);
				
				// set values in task
				taskorder.setProductList(productlist);
				taskorder.setCreator(usr);
				task.setTaskorder(taskorder);
				
				
				tasklist.add(task);
			}
			
//			System.out.println("\n\nkuch kuch hua\n\n\n");
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DbUtils.closeQuietly(rs);
			DbUtils.closeQuietly(selectQuery);
		}
		// TODO Auto-generated method stub
		return tasklist;
	}
	
	private ArrayList<Product> getproductlist(String ordId,Connection conn,ArrayList<Product> productlist) {
		String query="select * from orders "
				+ "inner join orderProductsMapping on orders.orderId=orderProductsMapping.orderId "
				+ "inner join products on products.productId=orderProductsMapping.productId "
				+ "inner join profile on profile.profileId=products.productProfileId "
				+ "where orders.orderId="+ordId;
		
		System.out.println(query);
		PreparedStatement selectQuery = null;
		ResultSet rs = null;
		try {
			selectQuery = conn.prepareStatement(query);
			rs = selectQuery.executeQuery();
			while(rs.next()) {
				Product p=new Product();
				p.setTitle(rs.getString("profile.profileTitle"));
				p.setProductQuantity(rs.getInt("orderProductsMapping.quantity"));
				productlist.add(p);
			}
			return productlist;
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DbUtils.closeQuietly(rs);
			DbUtils.closeQuietly(selectQuery);
		}
		
		return productlist;
	}


	public static Task createTask(String query, Connection conn,Task task) {
		// TODO Auto-generated method stub
		int insertResult;
		PreparedStatement selectQuery = null;
		ResultSet rs = null;
//		Task task=new Task();
		try {
			
			
//			selectQuery = conn.prepareStatement(query);
//			rs = selectQuery.executeQuery();
			System.out.print(query + "\n");
			
			selectQuery = conn.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);			
			insertResult = selectQuery.executeUpdate();
			
			if (insertResult > 0) {
	
				rs = selectQuery.getGeneratedKeys();
				
				while (rs.next()) {
					task.setTaskid(rs.getString(1));
				}
			}
			
			System.out.println("\nInsertion in task table completed ! \n");
			
			return task;
			
		} catch(Exception e) {
			System.out.print(e.toString());
		}finally {
			DbUtils.closeQuietly(rs);
			DbUtils.closeQuietly(selectQuery);
		}
		
		return task;
	}

	public static Task createsubTask(String query, Connection conn, Task task) {
		// TODO Auto-generated method stub
		for(int i=0;i<task.getSubtasklist().size();i++) {
			Subtask subt=task.getSubtasklist().get(i);
			PreparedStatement selectQuery2 = null;
			ResultSet rs_new = null;
			int insertResult;
			try {
				String query2="insert into subtask ( taskID,taskType) VALUES ("
						+task.getId() +","
						+subt.getSubtype().getCategoryId()+")"
						;
				System.out.print(query2 + "\n");

				selectQuery2 = conn.prepareStatement(query2,Statement.RETURN_GENERATED_KEYS);			
				insertResult = selectQuery2.executeUpdate();
				
				if (insertResult > 0) {
		
					rs_new = selectQuery2.getGeneratedKeys();
					
					while (rs_new.next()) {
						subt.setSubtaskId(rs_new.getString(1));
					}
				}	
			} catch(Exception e) {
				System.out.print(e.toString());
			}finally {
				DbUtils.closeQuietly(rs_new);
				DbUtils.closeQuietly(selectQuery2);
			}
		}
		System.out.println("\n-----------    Subtasks added Complete\n");
		return task;
//		return null;
	}
	public static Task setbuyer(Connection conn, Task t) {
		// TODO Auto-generated method stub
		PreparedStatement selectQuery = null;
		ResultSet rs = null;
		try {
			String query="select * from task inner join orderRoles on task.task_orderId=orderRoles.orderid "
					+ "inner join address on address.addressId=orderRoles.addressContactId"
					+ " where roleId=601";
			System.out.println(query);
			selectQuery = conn.prepareStatement(query);
			rs = selectQuery.executeQuery();
			System.out.print("\nBUYER ADDRESS SET\n\n");
			while(rs.next()) {
				t.setBuyesmobile(rs.getString("mobileContactId"));
				t.getBuyeraddress().setAddressId(rs.getString("addressContactId"));
				t.getBuyeraddress().setApartment(rs.getString("apartment/House"));
				t.getBuyeraddress().setRoom(rs.getString("roomNo"));
				t.getBuyeraddress().setApartmentBlock(rs.getString("apartmentBlock"));
				t.getBuyeraddress().setColonyId(rs.getString("colonyId"));
				t.getBuyeraddress().setLocality(rs.getString("landmark"));
				t.getBuyeraddress().setCampus(rs.getString("campus"));
				t.getBuyeraddress().setCity(rs.getString("cityId"));
				t.getBuyeraddress().setState(rs.getString("stateId"));
				t.getBuyeraddress().setCountry(rs.getString("countryId"));
				t.getBuyeraddress().setZipCode(rs.getString("zipCode"));
				t.getBuyeraddress().setLongitude(rs.getString("longitude"));
				t.getBuyeraddress().setLatitude(rs.getString("latitude"));
				
			}
			
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DbUtils.closeQuietly(rs);
			DbUtils.closeQuietly(selectQuery);
		}
		return t;
	}

	public static Task setseller(Connection conn, Task t) {
		PreparedStatement selectQuery = null;
		ResultSet rs = null;
		try {
			String query="select * from task inner join orderRoles on task.task_orderId=orderRoles.orderid "
					+ "inner join address on address.addressId=orderRoles.addressContactId "
					+ " where roleid=602";
			System.out.println(query);
			selectQuery = conn.prepareStatement(query);
			rs = selectQuery.executeQuery();
			System.out.println("\nSELLER ADDRESS SET\n");
			
			while(rs.next()) {
				t.setSellermobile(rs.getString("mobileContactId"));
				t.getSelleraddress().setAddressId(rs.getString("addressContactId"));
				t.getSelleraddress().setApartment(rs.getString("apartment/House"));
				t.getSelleraddress().setRoom(rs.getString("roomNo"));
				t.getSelleraddress().setApartmentBlock(rs.getString("apartmentBlock"));
				t.getSelleraddress().setColonyId(rs.getString("colonyId"));
				t.getSelleraddress().setLocality(rs.getString("landmark"));
				t.getSelleraddress().setCampus(rs.getString("campus"));
				t.getSelleraddress().setCity(rs.getString("cityId"));
				t.getSelleraddress().setState(rs.getString("stateId"));
				t.getSelleraddress().setCountry(rs.getString("countryId"));
				t.getSelleraddress().setZipCode(rs.getString("zipCode"));
				t.getSelleraddress().setLongitude(rs.getString("longitude"));
				t.getSelleraddress().setLatitude(rs.getString("latitude"));
				
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DbUtils.closeQuietly(rs);
			DbUtils.closeQuietly(selectQuery);
		}
		return t;
	}

}
