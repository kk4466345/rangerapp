package com.campushaat.rangerapp.model;

//import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import com.campushaat.rangerapp.utils.StringUtils;

//@DynamoDBDocument
public class Address {
	
	private String addressId;
	private Category addressType;
	private String name;				// custom name given by the user
	private String room;
	private String colonyId;
	private String locality;
	
	private String zipCode;
	private String city;
	private String state;
	private String country;
	private String longitude;
	private String latitude;
	
	private String createdBy; 		//userId
	
    private String createdDate;
    private String modifiedDate;
    
    private String apartmentBlock;
    private String apartment;
    private String campus;
    private String zipLocId;


	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Address(String longitude, String latitude) {
		
		super();
		this.longitude = longitude;
		this.latitude = latitude;
	}
	
	public Address(String addressId) {
		super();
		this.addressId=addressId;
	}
	
	/*
	 * @param address1
	 * @param address2
	 * @return
	 * guddu
	 * 2018 Dec 26, 2018 11:54:58 PM
	 * 
	 * TODO 
	 */
	public static Boolean isAddressContentSame(Address address1, Address address2) {
		
		if(address1==null || address2==null) return false;
				
		if(StringUtils.isNotNullNotEqual(address1.getAddressId(), address2.getAddressId())) return false;
		
		if(StringUtils.isNotNullNotEqual(address1.getRoom(), address2.getRoom())) return false;
		
		if(StringUtils.isNotNullNotEqual(address1.getLatitude(), address2.getLatitude())) return false;
		
		if(StringUtils.isNotNullNotEqual(address1.getLongitude(), address2.getLongitude())) return false;
		
		if(StringUtils.isNotNullNotEqual(address1.getZipCode(), address2.getZipCode())) return false;
		
		if(StringUtils.isNotNullNotEqual(address1.getCity(), address2.getCity())) return false;
		
		if(StringUtils.isNotNullNotEqual(address1.getState(), address2.getState())) return false;
		
		return true;
	}
	
	/*
	 * @param address
	 * @return
	 * guddu
	 * 2019 Dec 26, 2019 4:48:29 PM
	 * 
	 * TODO 
	 */
	public static String getAddressString(Address address) {
		
		String addressText = "";
		if(address!=null) {
			
			// Room
			addressText = addressText.concat(!StringUtils.isNullOrEmpty(address.getRoom()) ? address.getRoom() + " " : "");
			
			// Locality
			addressText = addressText.concat(!StringUtils.isNullOrEmpty(address.getLocality()) ? address.getLocality() + " ": "");
			
			// Zip Code
			addressText = addressText.concat(!StringUtils.isNullOrEmpty(address.getZipCode()) ? address.getZipCode() + " ": "");
			
			// City
			addressText = addressText.concat(!StringUtils.isNullOrEmpty(address.getCity()) ? address.getCity() + " ": "");
		}
		
		return addressText;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddressId() {
		return addressId;
	}
	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}
	public String getRoom() {
		return room;
	}
	public void setRoom(String room) {
		this.room = room;
	}

	public Category getAddressType() {
		return addressType;
	}

	public void setAddressType(Category addressType) {
		this.addressType = addressType;
	}

	public String getColonyId() {
		return colonyId;
	}

	public void setColonyId(String colonyId) {
		this.colonyId = colonyId;
	}

	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	public String getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	
	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getApartmentBlock() {
		return apartmentBlock;
	}

	public void setApartmentBlock(String apartmentBlock) {
		this.apartmentBlock = apartmentBlock;
	}

	public String getApartment() {
		return apartment;
	}

	public void setApartment(String apartment) {
		this.apartment = apartment;
	}

	public String getCampus() {
		return campus;
	}

	public void setCampus(String campus) {
		this.campus = campus;
	}

	public String getZipLocId() {
		return zipLocId;
	}

	public void setZipLocId(String zipLocId) {
		this.zipLocId = zipLocId;
	}
	
}
