package com.campushaat.rangerapp.model;

import java.util.ArrayList;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import com.campushaat.rangerapp.utils.*;


@DynamoDBDocument
public class Profile {

	private String id;
	private String parent;
	private CreatorInfo creator; 
	private CreatorInfo postedBy;
	private String statusId;
	
	private String campusId;
	private String campusName;
	
	private String title;
	private String info;
	private String imageUrl;
	
    private Category type; 					// User / Campus / Product / Ad / Media / Contact / Shops / Explore / Makan / Meter / Post
    private Category category;				// Food , Books, Cycle, Clothes, Health, Travel, Home/Accommodation / Fitness / Hangout / ATM / Bank / Courier
    private String applicationId;			// 1-CH, 15000-KakaG
    
    // Physical shop - products & services, stores, online business, software, startup, entrepreneur, Brand etc.
    // Explore - Gym / Ground / Hospital / Clinic
    // Makan - Hostel / PG / Apartments / Flat / Guest House
    private Category establishmentType;	 	
    
//	private Media media;	
//	private Contact contact;
//	
//	// Setting
//	private Visibility visibilitySettings;
//	private DeliverySettings deliverySetting;
	
	// Coupons
	private int couponCount;

	// Social media address
//	private WebUrl urls;
//	private Contact website;
//	private Contact facebook;
//	private Contact instagram;
//	private Contact linkedIn;
//	private Contact twitter;
//	
//	private Status status, currentStatus; 
//    private Analytics analytics;
    
    // Comments / Reviews
//    private Message message = new Message();
//    
//    private Boolean canEdit, isLiked;
//    
//    private Elements estimate;
//    private Timings timing;
    private Category openStatus;
    	
	// Ex : Profession, news alerts, product alerts, others.
    private CategoryValueMap categoryValueMap;
    
    // Profile actions - Disable / Verify / Block / Sold / Sell to Campus Haat / Others ....
//    ArrayList<MultiValuedAttribute> mva;
//    private ArrayList<Category> actions;
//    private String actionId;
    
	// Attribute - Value - Pair Map
	private ArrayList <String> AVP;
    
    // Child list
	private ArrayList<Profile> profileList;
	
	// Roles
//	private ArrayList<Persons> persons;	
//	private Category role;
	
	/* ---------------- Profile Types ---------------------------------------*/
	public static final String EXPLORE = "3000";
	public static final String MAKAN = "5000";
	public static final String METER= "6000";
	public static final String USER = "7000";
	public static final String PRODUCT = "8000";
	public static final String CONTACT = "9000";
	public static final String MEDIA = "10000";
	public static final String PROFILE = "11000";
	public static final String POST = "12000";
	
	/* ---------------- Profile Categories ---------------------------------------*/
	public static final String categoryAcads = "3004";

	/* ---------------- Profile EstablishMent Type ---------------------------------------*/
	public static final String estTypeCollege = "337";
	
	/* ---------------- Profile Roles ---------------------------------------*/
	public static String CREATOR = "101";
	public static String OWNER = "102";
	
	// constructors
	public Profile() {
		
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param id
	 */
	public Profile(String id) {
		
		super();
		this.id = id;
	}

	/**
	 * @param id
	 * @param title
	 */
	public Profile(String id, String title) {
		super();
		this.id = id;
		this.title = title;
	}

	/**
	 * @param id
	 * @param title
	 * @param media
	 * @param couponCount
	 */
//	public Profile(String id, String title, Media media, int couponCount) {
//		super();
//		this.id = id;
//		this.title = title;
//		this.media = media;
//		this.couponCount = couponCount;
//	}
//
//	public Profile(String id, String title, String info, Category type, Media media, Contact contact, String statusId) {
//		
//		super();
//		this.id = id;
//		this.title = title;
//		this.info = info;
//		this.type = type;
//		this.media = media;
//		this.contact = contact;
//		this.statusId = statusId;
//	}
//	
//	public Profile(String title, String info, String applicationId, Status status,
//			Category type, Category category, CreatorInfo creator, Media media, Contact contact) {
//		super();
//		this.title = title;
//		this.info = info;
//		this.applicationId = applicationId;
//		this.status = status;
//		this.type = type;
//		this.category = category;
//		this.creator = creator;
//		this.media = media;
//		this.contact = contact;
//	}
	
	public Profile(String id, String title, String info) {
		super();
		this.id = id;
		this.title = title;
		this.info = info;
	}
	
//	public Profile(Category type, String statusId)
//	{
//		super();
//		this.type = type;
//		this.statusId = statusId;
//		this.contact = new Contact();
//		this.media = new Media();
//	}
	
//	public Profile(Category type, String statusId, String id)
//	{
//		super();
//		this.type = type;
//		this.statusId = statusId;
//		this.id = id;
//		this.contact = new Contact();
//		this.media = new Media();
//	}
	
	/*
	 * @param profile
	 * guddu
	 * 2018 Nov 22, 2018 10:53:24 AM
	 * 
	 * TODO 
	 */
	public void addProfile(Profile profile) {
		
		if(this.getProfileList()==null) {
			this.setProfileList(new ArrayList<Profile>());
		}
		this.getProfileList().add(profile);
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getParent() {
		return parent;
	}

	public void setParent(String parent) {
		this.parent = parent;
	}

	public CreatorInfo getCreator() {
		return creator;
	}

	public void setCreator(CreatorInfo creator) {
		this.creator = creator;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Category getType() {
		return type;
	}

	public void setType(Category type) {
		this.type = type;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Category getEstablishmentType() {
		return establishmentType;
	}

	public void setEstablishmentType(Category establishmentType) {
		this.establishmentType = establishmentType;
	}

//	public Media getMedia() {
//		return media;
//	}
//
//	public void setMedia(Media media) {
//		this.media = media;
//	}
//
//	public Contact getContact() {
//		return contact;
//	}

//	public void setContact(Contact contact) {
//		this.contact = contact;
//	}
//
//	public WebUrl getUrls() {
//		return urls;
//	}
//
//	public void setUrls(WebUrl urls) {
//		this.urls = urls;
//	}
//
//	public Status getStatus() {
//		return status;
//	}
//
//	public void setStatus(Status status) {
//		this.status = status;
//	}

	public CategoryValueMap getCategoryValueMap() {
		return categoryValueMap;
	}

	public void setCategoryValueMap(CategoryValueMap categoryValueMap) {
		this.categoryValueMap = categoryValueMap;
	}

//	public ArrayList<Category> getActions() {
//		return actions;
//	}
//
//	public void setActions(ArrayList<Category> actions) {
//		this.actions = actions;
//	}
//
//	public String getActionId() {
//		return actionId;
//	}
//
//	public void setActionId(String actionId) {
//		this.actionId = actionId;
//	}

	public ArrayList<String> getAVP() {
		return AVP;
	}

	public void setAVP(ArrayList<String> aVP) {
		AVP = aVP;
	}

//	public Analytics getAnalytics() {
//		return analytics;
//	}
//
//	public void setAnalytics(Analytics analytics) {
//		this.analytics = analytics;
//	}
//
//	public Message getMessage() {
//		return message;
//	}
//
//	public void setMessage(Message message) {
//		this.message = message;
//	}
//
//	public Boolean getCanEdit() {
//		return canEdit;
//	}
//
//	public void setCanEdit(Boolean canEdit) {
//		this.canEdit = canEdit;
//	}

//	public Elements getEstimate() {
//		return estimate;
//	}
//
//	public void setEstimate(Elements estimate) {
//		this.estimate = estimate;
//	}

	public Category getOpenStatus() {
		return openStatus;
	}

	public void setOpenStatus(Category openStatus) {
		this.openStatus = openStatus;
	}

	public static String getUSER() {
		return USER;
	}

	public static String getPRODUCT() {
		return PRODUCT;
	}

	public static String getCONTACT() {
		return CONTACT;
	}

	public static String getMEDIA() {
		return MEDIA;
	}

	public static String getEXPLORE() {
		return EXPLORE;
	}

//	public Timings getTiming() {
//		return timing;
//	}
//
//	public void setTiming(Timings timing) {
//		this.timing = timing;
//	}

	public ArrayList<Profile> getProfileList() {
		return profileList;
	}

	public void setProfileList(ArrayList<Profile> profileList) {
		this.profileList = profileList;
	}

	public String getStatusId() {
		return statusId;
	}

	public void setStatusId(String statusId) {
		this.statusId = statusId;
	}

	public String getCampusId() {
		return campusId;
	}

	public void setCampusId(String campusId) {
		this.campusId = campusId;
	}

	public String getCampusName() {
		return campusName;
	}

	public void setCampusName(String campusName) {
		this.campusName = campusName;
	}

//	public Contact getWebsite() {
//		return website;
//	}
//
//	public void setWebsite(Contact website) {
//		this.website = website;
//	}
//
//	public Contact getFacebook() {
//		return facebook;
//	}
//
//	public void setFacebook(Contact facebook) {
//		this.facebook = facebook;
//	}

//	public Contact getInstagram() {
//		return instagram;
//	}
//
//	public void setInstagram(Contact instagram) {
//		this.instagram = instagram;
//	}
//
//	public Contact getLinkedIn() {
//		return linkedIn;
//	}
//
//	public void setLinkedIn(Contact linkedIn) {
//		this.linkedIn = linkedIn;
//	}
//
//	public synchronized Contact getTwitter() {
//		return twitter;
//	}
//
//	public synchronized void setTwitter(Contact twitter) {
//		this.twitter = twitter;
//	}

//	public ArrayList<MultiValuedAttribute> getMva() {
//		return mva;
//	}
//
//	public void setMva(ArrayList<MultiValuedAttribute> mva) {
//		this.mva = mva;
//	}
//	
//	public Status getCurrentStatus() {
//		return currentStatus;
//	}
//
//	public void setCurrentStatus(Status currentStatus) {
//		this.currentStatus = currentStatus;
//	}
//	
//	public ArrayList<Persons> getPersons() {
//		return persons;
//	}

//	public void setPersons(ArrayList<Persons> persons) {
//		this.persons = persons;
//	}
	
	public String getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}

//	public synchronized Visibility getVisibilitySettings() {
//		return visibilitySettings;
//	}
//
//	public synchronized void setVisibilitySettings(Visibility visibilitySettings) {
//		this.visibilitySettings = visibilitySettings;
//	}
//
//	public synchronized Category getRole() {
//		return role;
//	}
//
//	public synchronized void setRole(Category role) {
//		this.role = role;
//	}
//
//	public synchronized DeliverySettings getDeliverySetting() {
//		return deliverySetting;
//	}
//
//	public synchronized void setDeliverySetting(DeliverySettings deliverySetting) {
//		this.deliverySetting = deliverySetting;
//	}

	public synchronized CreatorInfo getPostedBy() {
		return postedBy;
	}

	public synchronized void setPostedBy(CreatorInfo postedBy) {
		this.postedBy = postedBy;
	}

	public synchronized int getCouponCount() {
		return couponCount;
	}

	public synchronized void setCouponCount(int couponCount) {
		this.couponCount = couponCount;
	}

//	public synchronized Boolean getIsLiked() {
//		return isLiked;
//	}
//
//	public synchronized void setIsLiked(Boolean isLiked) {
//		this.isLiked = isLiked;
//	}
}
