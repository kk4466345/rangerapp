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
				Address adr=new Address();
				CreatorInfo usr=new CreatorInfo();
				Task task=new Task();
				Orders taskorder=new Orders();
				
				

				String addressId = rs.getString("addressId");
				String addressType = rs.getString("addressType");
				String addressRoom = rs.getString("roomNo");
				String addressColonyId = rs.getString("colonyId");
				String addressLandmark = rs.getString("landmark");
				String addressArea = rs.getString("area");
				String addressCityId = rs.getString("cityId");
				String addressStateId = rs.getString("stateId");
				String addressCountryId = rs.getString("countryId");
				String modifyDate = rs.getString("modifiedDate");
				String createdBy = rs.getString("createdBy");
				String longitude = rs.getString("longitude");
				String latitude = rs.getString("latitude");
				String addressZipCode = rs.getString("zipCode");
				String zipLocationId = rs.getString("zipLocationId");
				String apartmentBlock = rs.getString("apartmentBlock");
				String apartment = rs.getString("apartment/House");
				String campus = rs.getString("campus");
				
				adr.setAddressId(addressId);
//				adr.setAddressType(addressType);
				adr.setRoom(addressRoom);
				adr.setColonyId(addressColonyId);
				
				// landmark
				
				adr.setLocality(addressLandmark);
				adr.setCity(addressCityId);
				adr.setState(addressStateId);
				adr.setCountry(addressCountryId);
				adr.setLatitude(latitude);
				adr.setLongitude(longitude);
				adr.setZipCode(addressZipCode);
				adr.setApartment(apartment);
				adr.setApartmentBlock(apartmentBlock);

				
				// 
				
				//				usrname
				
				String firstname=rs.getString("firstName");
				String lastname=rs.getString("lastName");
				String usermobile=rs.getString("mobileNumber");
				
				usr.setCreatorFirstName(firstname);
				usr.setCreatorLastName(lastname);
				usr.setMobile(usermobile);
				
				
				// set values in task
				usr.setAddress(adr);
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

	public static Task createTask(String query, Connection conn,Task task) {
		// TODO Auto-generated method stub
		int insertResult;
		PreparedStatement selectQuery = null;
		ResultSet rs = null;
//		Task task=new Task();
		try {
			System.out.print(query + "\n\n\n");
			
//			selectQuery = conn.prepareStatement(query);
//			rs = selectQuery.executeQuery();
			
			
			selectQuery = conn.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);			
			insertResult = selectQuery.executeUpdate();
			if (insertResult > 0) {
	
				rs = selectQuery.getGeneratedKeys();
				
				while (rs.next()) {
					task.setTaskid(rs.getString(1));
				}
			}
			
			
			
			
			
			
			
			
//			System.out.print("\ncompleted\n\n");
			return task;
			
		} catch(Exception e) {
			System.out.print(e.toString());
		}finally {
			DbUtils.closeQuietly(rs);
			DbUtils.closeQuietly(selectQuery);
		}
		
		return task;
	}

}
