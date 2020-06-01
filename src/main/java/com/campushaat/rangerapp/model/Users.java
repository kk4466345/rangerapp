package com.campushaat.rangerapp.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

//import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
//import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
//import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBIgnore;
//import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
//import com.campushaat.eShopsAPI.utils.Constants;

//@DynamoDBTable(tableName = Constants.dynamoUsersTable)
//@DynamoDBDocument


//public class Users extends Profile {

public class Users  {
	private String userId;
	private String firstName;
	private String lastName;
	private String profileId;

	private String userMobile;
	private String userEmail;
	private String userImage; 		// only one image per user
	private Address address;
	private String usercampus;
	
	// Favorites
	private String userFavouriteAds; // ex - ;1;2;3;
	private Set<String> favoriteSet = new HashSet<String>();
	
	private int userType; 			// Basic, Premium, Gold
//	private Category userProfession = new Category();
//	private Category userRole = new Category();
	
	private int userBalance; 
	private String userCampusList; // Only 1 public campus, multiple private(later), ex- ;1;2;3;...;n;

	// User Credit Information
//	private Credit creditInfo;
	
	// User Personal Info
	private int userSex;			
//	private Category gender;?S 	// Male-1101, Female-1102, Others-1103
	private String dob; 			// Date of birth
	
	// Track user if ranger
	private Boolean isTrack; // is User trackable - ex : rangers, others
    
    //List of user experiences 
//    ArrayList<Experience> education;
//    ArrayList<Experience> workExperience;
    
	
//	private ArrayList<Users> userList; // Don't remove, we can store editing history in the child nodes
	
	// Users constants
    public static String Male = "1101";
    public static String Female = "1102";
    public static String Others = "1103";
    public static String Unknown = "1104";

	
//	public ArrayList<Experience> getEducation() {
//		return education;
//	}
//
//	public void setEducation(ArrayList<Experience> education) {
//		this.education = education;
//	}
//
//	public ArrayList<Experience> getWorkExperience() {
//		return workExperience;
//	}
//
//	public void setWorkExperience(ArrayList<Experience> workExperience) {
//		this.workExperience = workExperience;
//	}

	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Users(String userId) {
		
		super();
		this.userId = userId;
	}
	
//	public Users(String userid, String profileId, String firstName, String lastName, String Mobile,String Email,int userSex) {
//		
//		super();
//		this.userId=userid;
//		this.setId(profileId);
//		this.firstName=firstName;
//		this.lastName=lastName;
//		this.userMobile=Mobile;
//		this.userEmail=Email;
//		this.userSex=userSex;	
////		this.address.setAddressId(addressId);
//	}
	
//	public Users(String id, String title, String imageUrl) {
//		
//		super();
//		this.setId(id);
//		this.setTitle(title);
//		this.setImageUrl(imageUrl);
//	}
	
//	public Users(String id, Category type, String title, Contact contact, Media media) {
//		
//		super();
//		this.setId(id);
//		this.setType(type);
//		this.setTitle(title);
//		this.setContact(contact);
//		this.setMedia(media);
//	}

//	public Users(String userId, String userProfileId, String firstName,String lastName, Media media, String userMobile, String userEmail) {
//		// TODO Auto-generated constructor stub
//		
//		this.setUserId(userId);
//		this.setId(userProfileId);
//		this.firstName=firstName;
//		this.lastName=lastName;
//		this.setMedia(media);
//		this.setUserMobile(userMobile);
//		this.setUserEmail(userEmail);
//	}
	
	

	/**
	 * @param firstName
	 * @param userMobile
	 * @param address
	 */
//	public Users(String title, String userMobile, Address address) {
//		super();
//		this.setTitle(title);
//		this.userMobile = userMobile;
//		this.address = address;
//	}

//	@DynamoDBHashKey
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserMobile() {
		return userMobile;
	}

	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserImage() {
		return userImage;
	}

	public void setUserImage(String userImage) {
		this.userImage = userImage;
	}

//	public Address getAddress() {
//		return address;
//	}
//
//	public void setAddress(Address address) {
//		this.address = address;
//	}
//
//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}

//	public String getConfirmPassword() {
//		return confirmPassword;
//	}
//
//	public void setConfirmPassword(String confirmPassword) {
//		this.confirmPassword = confirmPassword;
//	}
//
//	public int getIsActive() {
//		return isActive;
//	}
//
//	public void setIsActive(int isActive) {
//		this.isActive = isActive;
//	}

//	public int getOtp() {
//		return otp;
//	}
//
//	public void setOtp(int otp) {
//		this.otp = otp;
//	}
//
//	public Boolean getIsSocialLogin() {
//		return isSocialLogin;
//	}
//
//	public void setIsSocialLogin(Boolean isSocialLogin) {
//		this.isSocialLogin = isSocialLogin;
//	}

	public String getUserFavouriteAds() {
		return userFavouriteAds;
	}

	public void setUserFavouriteAds(String userFavouriteAds) {
		this.userFavouriteAds = userFavouriteAds;
	}

	public Set<String> getFavoriteSet() {
		return favoriteSet;
	}

	public void setFavoriteSet(Set<String> favoriteSet) {
		this.favoriteSet = favoriteSet;
	}

	public int getUserType() {
		return userType;
	}

	public void setUserType(int userType) {
		this.userType = userType;
	}

//	public Category getUserProfession() {
//		return userProfession;
//	}
//
//	public void setUserProfession(Category userProfession) {
//		this.userProfession = userProfession;
//	}

	public String getUserCampusList() {
		return userCampusList;
	}

	public void setUserCampusList(String userCampusList) {
		this.userCampusList = userCampusList;
	}

	public int getUserSex() {
		return userSex;
	}

	public void setUserSex(int userSex) {
		this.userSex = userSex;
	}

//	public Category getGender() {
//		return gender;
//	}
//
//	public void setGender(Category gender) {
//		this.gender = gender;
//	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	//@DynamoDBTyped(DynamoDBAttributeType.BOOL)
//	@DynamoDBIgnore
	public Boolean getIsTrack() {
		return isTrack;
	}

	public void setIsTrack(Boolean isTrack) {
		this.isTrack = isTrack;
	}

//	public ArrayList<Users> getUserList() {
//		return userList;
//	}
//
//	public void setUserList(ArrayList<Users> userList) {
//		this.userList = userList;
//	}

	public int getUserBalance() {
		return userBalance;
	}

	public void setUserBalance(int userBalance) {
		this.userBalance = userBalance;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getUsercampus() {
		return usercampus;
	}

	public void setUsercampus(String usercampus) {
		this.usercampus = usercampus;
	}
	

//	public Category getUserRole() {
//		return userRole;
//	}
//
//	public void setUserRole(Category userRole) {
//		this.userRole = userRole;
//	}

//	public Credit getCreditInfo() {
//		return creditInfo;
//	}
//
//	public void setCreditInfo(Credit creditInfo) {
//		this.creditInfo = creditInfo;
//	}
	
	
	
}
