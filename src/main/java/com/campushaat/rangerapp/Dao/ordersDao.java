package com.campushaat.rangerapp.Dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.apache.commons.dbutils.DbUtils;

import com.campushaat.rangerapp.model.Address;
import com.campushaat.rangerapp.model.CreatorInfo;
import com.campushaat.rangerapp.model.Orders;
import com.campushaat.rangerapp.model.Users;
import com.campushaat.rangerapp.response.OrderSection;


public class ordersDao {
	
	public ArrayList<Orders> makeOrders(String query, Connection conn){
		
		OrderSection order = null;
		PreparedStatement selectQuery = null;
		ResultSet rs = null;
		ArrayList<Orders> ordersList = new ArrayList<Orders>();
		
		try {
			
			System.out.print(query + "\n\n\n");

			selectQuery = conn.prepareStatement(query);
			rs = selectQuery.executeQuery();
			
			while(rs.next()){
				
				Address adr=new Address();
				CreatorInfo usr=new CreatorInfo();
				Orders ord =new Orders();
				
				
				
				String orderId = rs.getString("orderId");
				String creatorId = rs.getString("orderCreatedBy");
				String ordermessage = rs.getString("orderMessage");
				
				String applicationid=rs.getString("orderApplicationId");
				
				
				ord.setOrderId(orderId);
				ord.setApplicationId(applicationid);
				ord.setOrderMessage(ordermessage);
				
				
				
				
				
				/// username
				String firstname=rs.getString("firstName");
				String lastname=rs.getString("lastName");
				String usermobile=rs.getString("mobileNumber");
				
				usr.setCreatorFirstName(firstname);
				usr.setCreatorLastName(lastname);
				usr.setMobile(usermobile);
				
				
				
				// address
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
				
				usr.setAddress(adr);
				ord.setCreator(usr);
				
	
				ordersList.add(ord);
			}
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DbUtils.closeQuietly(rs);
			DbUtils.closeQuietly(selectQuery);
		}
		
		
		return ordersList;
	}
}
