package com.campushaat.rangerapp.model;

import com.campushaat.rangerapp.utils.DateTimeHandler;
import com.campushaat.rangerapp.utils.StringUtils;

public class CreatorInfo {
	
	// Creator/Editor
	private String createType;			//  create-1, modify-2, delete-3
	private String id; 					//	profileId, eshopId
    private String creatorId; 			//	userId
    private String creatorName; 			
    private String creatorImageUrl;
    private String creatorType;			// USER - 7000, BUSINESS - 3000/5000/6000
    private String businessProfileId;
    
    private String applicationId;

    private String creatorFirstName;
    private String creatorLastName;
    
    // API Key
	private String APIKey;

    // creator contact info 
    private String email;
    private String mobile;
    private Address address; 			// Change this to a class(create address class)
    private String createDate;
    
    public CreatorInfo() {
		
    		super();
		// TODO Auto-generated constructor stub
    }

	public CreatorInfo(String creatorId) {
		super();
		this.creatorId = creatorId;
	}
	
	public CreatorInfo(String creatorId, String createDate) {
		super();
		this.creatorId = creatorId;
		this.createDate = createDate;
	}
	
	public CreatorInfo(String creatorId, String imageUrl, String createDate) {
		super();
		this.creatorId = creatorId;
		this.createDate = createDate;
		this.creatorImageUrl = imageUrl;
	}
	
	public CreatorInfo(String createType, String id, String creatorId, String creatorName, String creatorImageUrl,
			String applicationId, String aPIKey, String email, String mobile, Address address, String createDate) {
		super();
		this.createType = createType;
		this.id = id;
		this.creatorId = creatorId;
		this.creatorName = creatorName;
		this.creatorImageUrl = creatorImageUrl;
		this.applicationId = applicationId;
		APIKey = aPIKey;
		this.email = email;
		this.mobile = mobile;
		this.address = address;
		this.createDate = createDate;
	}
	
	public CreatorInfo(String creatorProfileId, String creatorId, String creatorName, String creatorImageUrl, String createDate) {
		
		super();
		this.id = creatorProfileId;
		this.creatorId = creatorId;
		this.creatorName = creatorName;
		this.creatorImageUrl = creatorImageUrl;
		this.createDate = createDate;
	}

	public CreatorInfo(String createType, String creatorId, String creatorName, String creatorImageUrl, String email, String mobile, Address address) {
		
		super();
		this.createType = createType;
		this.creatorId = creatorId;
		this.creatorName = creatorName;
		this.creatorImageUrl = creatorImageUrl;
		this.setEmail(email);
		this.setMobile(mobile);
		this.setAddress(address);
	}
    
	public CreatorInfo(String createType, String creatorId, String creatorName, String creatorImageUrl, String createDate, String email, String mobile, Address address) {
		
		super();
		this.createType = createType;
		this.creatorId = creatorId;
		this.creatorName = creatorName;
		this.creatorImageUrl = creatorImageUrl;
		this.createDate = createDate;
		this.setEmail(email);
		this.setMobile(mobile);
		this.setAddress(address);
	}
	
	public CreatorInfo(String createType, String id, String creatorId, String creatorName, String creatorImageUrl, String createDate, String email, String mobile, Address address) {
		
		super();
		this.createType = createType;
		this.id = id;
		this.creatorId = creatorId;
		this.creatorName = creatorName;
		this.creatorImageUrl = creatorImageUrl;
		this.createDate = createDate;
		this.setEmail(email);
		this.setMobile(mobile);
		this.setAddress(address);
	}
	
	/*
	 * @param creator
	 * @return
	 * guddu
	 * 2018 Aug 25, 2018 3:49:59 PM
	 * 
	 * TODO 
	 */
	public static String getDateFromCreator(CreatorInfo creator) {
		
		return creator!=null && !StringUtils.isNullOrEmpty(creator.getCreateDate()) 
				? creator.getCreateDate() 
				: DateTimeHandler.CurrentTimeStampF1();
	}
	
	/*
	 * @param creator
	 * @return
	 * guddu
	 * 2018 Aug 25, 2018 3:50:08 PM
	 * 
	 * TODO 
	 */
	public static String getUserIdFromCreator(CreatorInfo creator) {
		
		return creator!=null && !StringUtils.isNullOrEmpty(creator.getCreatorId()) 
				? creator.getCreatorId() 
				: null;
	}
	
	/*
	 * @param creator
	 * @return
	 * guddu
	 * 2018 Aug 26, 2018 3:09:37 AM
	 * 
	 * TODO 
	 */
	public static String getProfileIdFromCreator(CreatorInfo creator) {
		
		return creator!=null && !StringUtils.isNullOrEmpty(creator.getId()) 
				? creator.getId()
				: null;
	}
	
	/*
	 * @param creator
	 * @return
	 * guddu
	 * 2019 Jul 15, 2019 11:33:05 PM
	 * 
	 * TODO 
	 */
	public static String getBusinessProfileIdFromCreator(CreatorInfo creator) {
		
		return creator!=null && !StringUtils.isNullOrEmpty(creator.getBusinessProfileId()) 
				? creator.getBusinessProfileId()
				: null;
	}
	
	/*
	 * @param creator
	 * @return
	 * guddu
	 * 2018 Aug 31, 2018 4:04:41 PM
	 * 
	 * TODO 
	 */
	public static String getApiKeyFromCreator(CreatorInfo creator) {
		
		return creator!=null && !StringUtils.isNullOrEmpty(creator.getAPIKey()) 
				? creator.getAPIKey()
				: null;
	}
	
	public static String getApplicationIdFromCreator(CreatorInfo creator) {
		
		return creator!=null && !StringUtils.isNullOrEmpty(creator.getApplicationId()) 
				? creator.getApplicationId()
				: null;
		
	}
	
	public String getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}
	
	public String getCreateType() {
		return createType;
	}
	public void setCreateType(String createType) {
		this.createType = createType;
	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCreatorId() {
		return creatorId;
	}
	public void setCreatorId(String creatorId) {
		this.creatorId = creatorId;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getCreatorName() {
		return creatorName;
	}
	public void setCreatorName(String creatorName) {
		this.creatorName = creatorName;
	}
	public String getCreatorImageUrl() {
		return creatorImageUrl;
	}
	public void setCreatorImageUrl(String creatorImageUrl) {
		this.creatorImageUrl = creatorImageUrl;
	}
	
	
	public String getAPIKey() {
		return APIKey;
	}

	public void setAPIKey(String aPIKey) {
		APIKey = aPIKey;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

	public String getCreatorFirstName() {
		return creatorFirstName;
	}

	public void setCreatorFirstName(String creatorFirstName) {
		this.creatorFirstName = creatorFirstName;
	}

	public String getCreatorLastName() {
		return creatorLastName;
	}

	public void setCreatorLastName(String creatorLastName) {
		this.creatorLastName = creatorLastName;
	}
	
	public String getBusinessProfileId() {
		return businessProfileId;
	}

	public void setBusinessProfileId(String businessProfileId) {
		this.businessProfileId = businessProfileId;
	}

	public synchronized String getCreatorType() {
		return creatorType;
	}

	public synchronized void setCreatorType(String creatorType) {
		this.creatorType = creatorType;
	}
}
