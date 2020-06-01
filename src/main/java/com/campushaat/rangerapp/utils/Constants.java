package com.campushaat.rangerapp.utils;

public class Constants {
	
	public static String amazonBaseUrl = "https://s3.ap-south-1.amazonaws.com/";
	public static String accessKeyS3 = "AKIAI664HIN3KV55EAWA";
	public static String secretkey = "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";
		
	// Google Maps Matrix API
	public static String googleMatrixApiUrl = "https://maps.googleapis.com/maps/api/distancematrix/json?";
	public static String googleMatrixAPIKey = "AIzaSyDxxC9U0KQF1aYLepH0icifs49bM6OkKMU";
	
	// Change following 3 variable when changing server : test and production 
	/* ---------------- Amazon S3 --------------------------------------*/	
	/* ---------------- Database ---------------------------------------*/
	/* ---------------- DynamoDB ---------------------------------------*/
	
//	public static String bucketS3Malik = "maalik";
//	public static String mysqlDBName="campushaat_prod";
//	public static final String dynamoDB = "Prod";
	
	public static final String dynamoDB = "Test";
	public static String mysqlDBName="campushaat_db";
	public static String bucketS3Malik = "maalik/Test";
		
	/* ---------------- Tables name (MySql + DynamoDB)-------------------*/
	// DynamoDB
	public static final String dynamoNotificationTable = dynamoDB +"Notifications";	
	public static final String dynamoeShopTable = dynamoDB + "Shops";
	public static final String dynamoAdsTable = dynamoDB + "Ads";
	public static final String dynamoUsersTable = dynamoDB + "Users";
	public static final String dynamoProductTable = dynamoDB + "Product";
	public static final String dynamoProfileTable = dynamoDB + "Profile";
	public static final String dynamoPricingTable = dynamoDB + "Price";
	public static final String dynamoOrdersTable = dynamoDB + "Orders";
	public static final String dynamoFamilyTable = "sahyogFamily";
	
	// MySql tables
	public static String tableUserRoles = "userRoles";
	public static String tableCategoryUnitMap = "categoryUnitMap";
	public static String tableCampus = "campus";	
	
	// APPLICATION ID
	// Token
	public static final String tokenCH = "CH";
	public static final String tokenMaalik = "Maalik";
	public static final String tokenMoon = "MOON";
	public static final String tokenWeb = "Web";
	
	public static final String appCH = "1";
	public static final String appMaalik = "2";
	public static final String appMoon = "16000";
	public static final String appWeb = "Web";
	
	/*---------------- Profile Entity Mapping Relation ---------------------------------*/
	public static String sellerHub = "17120";
	public static String rangerHub = "17121";
	
	/*----------------- MultivaluedMapping Status ---------------------------------------*/
	public static String using = "16991";
	public static String notUsing = "16992";

	public static String usingATVP = "74";
	public static String notUsingATVP = "75";
	
	/* ---------------- Product / Pricing constants------------------------*/
	public static String Unit = "501";
	public static String RentUnit = "507";
	public static String NewCondition = "2010";
	
	/* ---------------- Order mode-----------------------------------------*/
	public static String orderDeliver = "621";
	public static String orderPickUp = "622";
	public static String orderReturn = "623";
	
	/* ---------------- Order Roles----------------------------------------*/
	public static String RoleOrdersBuyer = "601";
	public static String RoleOrdersSeller = "602";
	public static String RoleOrdersRanger = "603";	
	
	/* ---------------- Ride Roles-----------------------------------------*/
	public static String RoleRideAdmin = "604";
	public static String RoleRidePassenger = "605";
	
	/* ---------------- Order Actions--------------------------------------*/
	public static final String actionOrderConfirm = "1001";
	public static final String actionOrderReady = "1002";
	public static final String actionOrderPartialConfirm = "1003";
	public static final String actionOrderDispatched = "1012";
	public static final String actionOrderDelivered = "1013";
	public static final String actionOrderCancel = "1014";
	
	/* ---------------- Delivery Actions-----------------------------------*/
	public static final String actionDeliveryAccept = "1011";
	public static final String actionDeliveryStart = "1012";
	public static final String actionDeliveryEnd = "1013";
	
	/* ---------------- Payment Actions-----------------------------------*/
	public static final String actionPaymentConfirmed = "1015";
	
	/* ---------------- Order Status types---------------------------------*/
	public static String orderStatus = "671";
	public static String paymentStatus = "672";
	public static String productStatus = "673";
	public static String DeliveryStatus = "674";
	
	public static String jobStatus = "16400";
	public static String sectionStatus = "19001";
	public static String resumeStatus = "16406";
	public static String experienceStatus = "16410";
	public static String multiValuedMappingStatus = "16990";
	
	/* ---------------- Common Statuses ------------------------------------*/
	public static String Cancelled = "680";
	public static String InProgress = "681";
	public static String Confirmed = "682";
	
	/* ---------------- Order Status ---------------------------------------*/
	public static String ReadyToDeliver = "683";
	public static String Dispatched = "684";
	public static String Delivered = "685";
	
	//******************** Jobs *********************************************//
	
	/*--------------------Job MVP-------------------------------------------*/
	public static String mvaJobCategory = "16001";
	public static String mvaJobType = "16500";
	public static String mvaJobSkills = "16600";
	
	/*--------------------Job Status-----------------------------------------*/
	public static String live = "16401";
	public static String block = "16402";
	public static String delete = "16403";
	public static String publish = "16404";
	public static String unpublish = "16405";
	
	/*--------------------Job Status ATVP-------------------------------------*/
	public static String liveatvp = "67";
	public static String blockatvp = "68";
	public static String deleteatvp = "69";
	public static String publishatvp = "70";
	public static String unpublishatvp = "71";

	/*-------------------Job Application Status ATVP---------------------------*/
	public static String applicationPending = "101";
	public static String applicationShortlisted = "102";
	public static String applicationHired = "104";
	public static String applicationRejected = "103";
	
	/* ---------------- Job Application Actions--------------------------------*/
	public static final String actionJobApplicationShortlist = "16721";
	public static final String actionJobApplicationReject = "16722";
	public static final String actionJobApplicationHire = "16723";

	/*------------------------Resume Status--------------------------------------*/
	public static String uploaded = "16407";
	
	/*------------------------Experience Status--------------------------------------*/
	public static String experienceLive = "16411";
	
	/*--------------------------Resume Status ATVP----------------------------------*/
	public static String uploadedatvp = "72";
	
	/*--------------------------Experience Status ATVP----------------------------------*/
	public static String experienceLiveatvp = "73";
	
	/* ---------------- Delivery Status -------------------------------------*/
	public static String DeliveryAccept = "686";
		
	/* -----------------------Timing Status ---------------------------------*/
	public static String open = "4051";
	public static String closed = "4052";
	public static String flexible = "4053";
	
	/* -----------------------Update/Create ---------------------------------*/
	public static String created="4101";
	public static String modified="4102";
	
	
	/* ----------------------Days Category ----------------------------------*/
	public static String Mon = "4002";
	public static String Tue = "4003";
	public static String Wed = "4004";
	public static String Thu = "4005";
	public static String Fri = "4006";
	public static String Sat = "4007";
	public static String Sun = "4008";
	
	/*------------------------Location Type ---------------------------------*/
	public static String zipcode = "17011";
	public static String locality = "17010";
	public static String campus="17009";
	public static String colony = "17008";
	public static String apartment = "17007";
	public static String apartmentBlock = "17006";
	public static String room="17005";
	
	/*--------------------Status [Profile / Contact / Media / Order / Delivery / Order-Products / Share-Ride] ATVP---------------------------*/
	
	// Contact ATVP
	public static String verified = "1";
	public static String notVerified = "2";

	// Media/Pricing ATVP
	public static String enabled = "3";
	public static String disabled = "4";
	
    // Order
    public static String orderPending = "8";
    public static String orderAccepted = "12";
    public static String orderReadyToDeliver = "13";
    public static String orderDispatched = "14";
    public static String orderDelivered = "15";
    public static String orderCancelled = "29";

    // Delivery
    public static String deliveryInProgress = "9";
    public static String deliveryAccepted = "16";
    public static String deliveryDispatched = "21";
    public static String deliveryDelivered = "22";

    // Order - Products
    public static String productInProgress = "10";
    public static String productConfirmed = "17";
    public static String productCancelled = "76";
    public static String productReadyToDeliver = "18";
    public static String productDispatched = "19";
    public static String productDelivered = "20";
    
    // Order - Payment
    public static String paymentInProgress = "11";
    public static String paymentConfirmed = "126";
	
	// Ad-Post ATVP
	public static String atvpPostNotVerified = "30";
	public static String atvpPostVisible = "31";
	public static String atvpPostBlocked = "32";
	public static String atvpPostDisabled = "35";
	public static String atvpPostExpired = "36";
	public static String atvpPostVerified = "37";
	
	// Profile ATVP
	public static String profileNotVerified = "38";
	public static String profileVisible = "39";
	public static String profileBlocked = "40";
	public static String profileVerified = "41";
	public static String profileDisabled = "42";
	public static String profileAvailable = "79";
	public static String profileClose="77";
	public static String profileOccupied ="78";
	
	// Ranger ATVP
	public static String rangerClosed = "77";
	public static String rangerOccupied = "78";
	public static String rangerAvailable = "79";
	
	//Group Member ATVP
	public static String groupMemberPending = "110";
	public static String groupMemberConfirmed = "111";

	//Group ATVP
	public static String groupPending = "108";
	public static String groupConfirmed = "109";
    
    // Ride Share ATVP
 	public final static String rideOpen = "50";
 	public final static String rideClosed = "51";
 	public final static String rideDisabled = "52";
 	public final static String rideBlocked = "53";
 	public final static String rideFull = "54";
 	
 	// Ride Share Passengers ATVP
 	public final static String atvpRideWaiting = "55";
 	public final static String atvpRideConfirmed = "56";
 	public final static String atvpRideRejected = "57";
 	public final static String atvpRideCanceled = "58";
 	
 	// Campus Posts ATVP
 	public final static String atvpCampusPostLive = "59";
 	public final static String atvpCampusPostPending = "60";
 	
	/* ---------------- Campus Post Actions--------------------------------*/
	public static final String actionCampusPostLive = "14301";
	public static final String actionCampusPostPending = "14302";

	// Campus Project ATVP
	public final static String atvpProjectPublished = "105";
	public final static String atvpProjectDeleted = "106";
	public final static String atvpProjectUnpublished = "107";

	// Credit Account Status ATVP
 	public final static String creditAccountActive = "84";
 	public final static String creditAccountBlocked = "85";
 	public final static String creditAccountExpired = "86";
 	public final static String creditAccountDeleted = "87";
 
 	// Coupon Status ATVP
 	public final static String couponActive = "93";
 	public final static String couponInactive = "94";
 	public final static String couponBlocked = "95";
 	public final static String couponExpired = "96";
 	public final static String couponValid = "97";
 	public final static String couponInvalid = "98";
 	public final static String couponRedeemed = "99";
 	public final static String couponNotRedeemed = "100";
 	
 	// Profile Visibility Setting ATVP
  	public final static String atvpProfileVisibilityPending = "112";
  	public final static String atvpProfileVisibilityLive = "113";
  	
  	// Profile Visibility Status Actions
   	public final static String actionPending = "11301";
   	public final static String actionLive = "11302";
  	
  	// Profile Payment Setting ATVP
   	public final static String atvpProfilePaymentPending = "114";
   	public final static String atvpProfilePaymentLive = "115";
   	public final static String atvpProfilePaymentNotInUse = "116";
   	
  	// Profile Payment Status Actions
   	public final static String actionPaymentPending = "11311";
   	public final static String actionPaymentLive = "11312";
   	public final static String actionPaymentNotInUse = "11313";
   	
  	// Profile Roles Setting ATVP
   	public final static String atvpProfileRolePending = "117";
   	public final static String atvpProfileRoleWorking = "118";
   	
  	// Profile Role Status Actions
   	public final static String actionRolePending = "11321";
   	public final static String actionRoleWorking = "11322";
   	
   	// Profile Delivery Setting ATVP
   	public final static String atvpProfileDeliveryPending = "119";
   	public final static String atvpProfileDeliveryVerified = "120";
   	
  	// Profile Delivery Status Actions
   	public final static String actionDeliveryPending = "17301";
   	public final static String actionDeliveryVerified = "17302";
    
    /* ---------------- Product Actions---------------------------------------*/
	public static final String actionProductDelete = "8250";
	public static final String actionNotVerified = "8256";

	public static final String actionNotForSale = "1007";
	public static final String actionForSale = "1006";
	public static final String actionOutOfStock = "1009";
	public static final String actionSold = "1008";
	public static final String actionSellOnCHStore = "1024";
	public static final String actionSellOnCHStoreVerify = "1025";
	public static final String actionSellOnCHStoreCancel = "1026";
		
	/* ---------------- Requirement Actions-----------------------------------*/
	public static final String actionCloseRequirement = "1039";
	public static final String actionOpenRequirement = "1040";
	public static final String actionBlockRequirement = "1041";
	public static final String actionDisableRequirement = "1042";
	
	/* ---------------- Room Actions---------------------------------------*/
	public static final String actionRoomAvailable = "8251";
	public static final String actionRoomNotAvailable = "8252";
	public static final String actionRoommateFound = "8253";
	
	/* ---------------- Room Requirement/Reccommendation Actions---------------------------------------*/
	public static final String actionRoomFound = "8254";
	public static final String actionRoomRequirementLive = "8255";

    /* ---------------- Profile Actions---------------------------------------*/
	public static final String actionProfileVerify = "1031";
	public static final String actionProfileNotVerified = "1032";
	public static final String actionProfileBlock = "1033";
	public static final String actionProfileDisable = "1034";
	public static final String actionProfileVisible = "1035";
	
	/* ---------------- Post Actions------------------------------------------*/
	public static final String actionPostDisable = "1027";
	public static final String actionPostVisible = "1028";
	public static final String actionPostVerify = "1021";
	public static final String actionPostBlock = "1022";
	public static final String actionPostNotVerify = "1023";
	public static final String actionPostExpired = "1029";

	/*------------------ GroupsActions ------------------------------------*/
	public static final String actionGroupConfirm = "20201";
	public static final String actionGroupPending = "20202";
	public static final String actionGroupMemberConfirm = "20251";
	public static final String actionGroupMemberPending = "20252";



	/* ---------------- Ride Share Actions------------------------------------------*/
	public static final String actionShareRideClose = "1043";
	public static final String actionShareRideDisable = "1044";
	public static final String actionShareRideFull = "1045";
	public static final String actionShareRideBlock= "1046";
	public static final String actionShareRideOpen = "1047";
	
	/* ---------------- Ride Share Passengers Actions--------------------------------*/
	public static final String actionShareRidePassConfirm = "1048";
	public static final String actionShareRidePassReject = "1049";
	public static final String actionShareRidePassCancel = "13500";

	/* ---------------- Project Actions--------------------------------*/
	public static final String actionProjectDelete = "16311";
	public static final String actionProjectPublish = "16312";
	public static final String actionProjectUnPublish = "16313";

	/* ---------------- Dummy Node for Contact, Media, Pricing & others -----------------------------------------*/
	public static String DummyNode = "100";
	public static String Root = "Root";	
		
	/* ---------------- User Roles------------------------------------------*/
	public static final String campusRangers = "131";
	public static final String campusManagers = "121";
	public static final String campusAdmin = "111";
	public static final String superAdmin = "151";
	public static final String Creator = "101";
	public static final String CampusAdmin = "141";
	
	/* ---------------- Profile Type ---------------------------------------*/
	public static String explore = "3000";
	public static String makaan = "5000";
	public static String meter = "6000";
	public static String people = "7000";
	public static String product = "8000";
	public static String contact = "9000";
	public static String media = "10000";
	public static String profile = "11000";
	public static String ads = "12000";
	public static String ride = "13000";
	public static String post = "14000";
	public static String job = "16000";
	public static String coupon = "18000";
	public static String section = "19000";
	public static String donationProject = "16150";
	public static String groups = "20000";
	
	//******************** Sections *********************************************//
	
	/*-------------------- Section MVP-----------------------------------------*/
	public static String mvaSectionCategory = "19050";
	public static String mvaSectionSuperCategory = "19200";
	
	/* ---------------- Profile Category ---------------------------------------*/
	public static String exploreFood = "3001";
	public static String exploreShops = "3005";
	public static String exploreServices = "3008";
	
	public static String discountCoupon = "18001";
	public static String referralCoupon = "18002";

	/* ---------------- Post Category ---------------------------------------*/
	public static final String postDiscussion = "14001";
	public static final String postEvent = "14002";
	public static final String postQuestion = "14003";
	public static final String postNews = "14004";
	public static final String postPost = "14005";
	
	public static String postCategoryGeneral = "14101";
	
	/* ---------------- Response Code and messages---------------------------*/
	public static String CH200 = "200";	// Success
	public static String CH400 = "400";	// Item does not exist, ex- email not registered
	public static String CH401 = "401"; 	// Email - not active
	public static String CH402 = "402"; 	// Password do not match
	public static String CH403 = "403"; 	// Insufficient Data
	public static String CH405 = "405"; 	// Not Allowed
	public static String CH410 = "410";	// Item already exist,  ex- email, ad already registered
	public static String CH422 = "422";  // Unprocessable Entity may be due to limit Exceed
	public static String CH500 = "500";	// Server error/exceptions
	
	public static String CH403_MSG = "Incomplete request data"; 		// Password do not match
	
	// Campus
	public static String CAMPUS_SUCCESS = "Campus created successfully!";
	public static String CAMPUS_MEMBERS_RETRIEVE ="Campus members retrieved successfully!";	
	public static String CAMPUS_RETRIEVE ="Campus retrieved successfully!";
	public static String CAMPUS_NOT_AVAILABLE = "Campus information not available!";
	
	// messages
    public static String SUCCESS = "Success!";
	public static String SERVER_ERROR = "Server Error!";
	public static String UNAVAILABLE = "Unavailable!";
	public static String INVALID_REQUEST = "Invalid Request!";
	public static String USER_NOT_LOGGED_IN = "User not logged in! Please login to place order.";
	
	// users
	public static String USER_CREATE_SUCCESS = "User created successfully!";
	public static String USER_RETREIVE_SUCCESS = "Users retrieved successfully!";
	public static String USER_NOT_REGISTERED = "User not registered!";
	public static String TOKEN_REGISTRATION = "User Token Registered successfully!";
	public static String USER_EMAIL_EXISTS = "Email already registered with an account!";
	public static String USER_MOBILE_EXISTS = "Mobile already registered with an account!";
	public static String USER_PASSWORD_NOT_MATCH = "password and confirm password does not match!";
	public static String USER_PASSWORD_MATCH = "New password same as current password!";
	public static String USERNAME_PASSWORD_NOT_MATCH = "user name and password does not match!";
	public static String USERNAME_OTP_NOT_MATCH = "user name and otp does not match!";
	public static String EMPTY_OTP = "otp cannot be empty!";
		
	// shops
	public static String SHOP_CREATE_SUCCESS = "Shop created successfully!";
	public static String SHOP_RETREIVE_SUCCESS = "Shops retrieved successfully!";
	
	// products
	public static String PRODUCT_CREATE_SUCCESS = "Product created successfully!";
	public static String PRODUCT_UPDATE_SUCCESS = "Product updated successfully!";
	public static String PRODUCT_RETREIVE_SUCCESS = "Product retrieved successfully!";
	public static String PRODUCT_DELETE_SUCCESS = "Product deleted successfully!";
	
	// pricing
	public static String PRICING_UPDATE_SUCCESS = "Pricing updated successfully!";
	public static String PRICING_STATUS_UPDATE_SUCCESS = "Pricing status updated successfully!";
	
	// Rooms
	public static String ROOM_CREATE_SUCCESS = "Room created successfully!";
	public static String ROOM_RETREIVE_SUCCESS = "Rooms retrieved successfully!";
	public static String ROOM_DELETE_SUCCESS = "Room deleted successfully!";
	
	// profile
	public static String PROFILE_CREATE_SUCCESS = "Profile created successfully!";
	public static String PROFILE_UPDATE_SUCCESS = "Profile updated successfully!";
	public static String PROFILE_RETREIVE_SUCCESS = "Profile retrieved successfully!";
	public static String PROFILE_FILTER_RETREIVE_SUCCESS = "Profile filters retrieved successfully!";
	public static String PROFILE_DELETE_SUCCESS = "Profile deleted successfully!";
	
	// profile payment setting
	public static String PROFILE_PAYMENT_CREATE_SUCCESS = "Profile payment created successfully!";
	public static String PROFILE_PAYMENT_CREATE_DUPLICATE = "Profile payment mode already exists!";
	public static String PROFILE_PAYMENT_UPDATE_SUCCESS = "Profile payment updated successfully!";
	
	public static String PROFILE_PAYMENT_GET_SUCCESS = "Profile payment received successfully!";
	public static String PROFILE_PAYMENT_GET_FAIL = "Profile payment received failed!";
		
	// profile visibility
	public static String PROFILE_VISIBILITY_CREATE_SUCCESS = "Profile visibility created successfully!";
	public static String PROFILE_VISIBILITY_CREATE_FAIL = "Profile visibility create failed!";
	public static String PROFILE_VISIBILITY_CREATE_DUPLICATE = "Profile visibility already exists!";
	public static String PROFILE_VISIBILITY_UPDATE_SUCCESS = "Profile visibility updated successfully!";
	public static String PROFILE_VISIBILITY_UPDATE_FAIL = "Profile visibility update failed!";
	
	public static String PROFILE_VISIBILITY_GET_SUCCESS = "Profile visibility received successfully!";
	public static String PROFILE_VISIBILITY_GET_FAIL = "Profile visibility received failed!";
	
	// profile roles
	public static String PROFILE_ROLE_CREATE_SUCCESS = "Profile role created successfully!";
	public static String PROFILE_ROLE_CREATE_FAIL = "Profile role create failed!";
	public static String PROFILE_ROLE_CREATE_DUPLICATE = "Profile role already exists!";
	public static String PROFILE_ROLE_UPDATE_SUCCESS = "Profile role updated successfully!";
	public static String PROFILE_ROLE_UPDATE_FAIL = "Profile role update failed!";
	
	public static String PROFILE_ROLE_GET_SUCCESS = "Profile role received successfully!";
	public static String PROFILE_ROLE_GET_FAIL = "Profile role received failed!";
	
	// Delivery Settings
	public static String DELIVERY_SETTINGS_CREATE_SUCCESS = "Delivery settings created successfully!";
	public static String DELIVERY_SETTINGS_UPDATE_SUCCESS = "Delivery settings updated successfully!";
	
	public static String DELIVERY_SETTINGS_GET_SUCCESS = "Delivery setting received successfully!";
	public static String DELIVERY_SETTINGS_GET_FAIL = "Delivery setting received failed!";
	
	// Logistics Settings
	public static String LOGISTICS_SETTINGS_CREATE_SUCCESS = "Logistics settings created successfully!";
		
	// ads
	public static String AD_CREATE_SUCCESS = "Ad created successfully!";
	public static String AD_RETREIVE_SUCCESS = "Ad retrieved successfully!";
	public static String AD_DELETE_SUCCESS = "Ad deleted successfully!";
	public static String AD_UPDATE_SUCCESS = "Ad updated successfully!";
	
	// task
	
	public static String TASK_RECIVED_SUCCESS="task recived successfully";
	public static String TASK_CREATE_SUCCESS="task created successfully";
	
	// orders
	public static String ORDER_CREATE_SUCCESS = "Order created successfully!";
	public static String ORDER_RETREIVE_SUCCESS = "Order retrieved successfully!";
	public static String ORDER_UPDATE_SUCCESS = "Order updated successfully!";
	public static String ORDER_DELETE_SUCCESS = "Order deleted successfully!";
	public static String ORDER_ACTION_SUCCESS = "Order actions retrieved successfully!";
	
	public static String ORDER_DELIVERY_RETREIVE_SUCCESS = "Delivery List retrieved successfully!";
	public static String ORDER_DELIVERY_UPDATE_SUCCESS = "Delivery info updated successfully!";
	
	// Jobs
	public static String JOB_CREATE_SUCCESS = "Job created successfully!";
	public static String JOB_RETREIVE_SUCCESS = "Job retrieved successfully!";
	public static String JOB_APPLICATION_RETREIVE_SUCCESS = "Job applications retrieved successfully!";
	public static String APPLICANT_CREATE_SUCCESS = "Job application created successfully!";
	public static String APPLICANT_CREATE_DUPLICATE = "Job application already exists!";
	public static String APPLICANT_RETREIVE_SUCCESS = "Applicant retrieve successfully!";
	public static String APPLICANT_RETREIVE_FAILED = "Applicant retrieve failed";
	public static String APPLICATION_STATUS_UPDATE_SUCCESS = "Application status updated successfully!";
	public static String APPLICATION_STATUS_UPDATE_FAIL = "Application status updated failed!";

	public static String ACTION_RETREIVE_SUCCESS = "Action retrieved successfully!";
	public static String ACTION_RETREIVE_FAILED = "Action retrieve failed";
	public static String JOB_UPDATE_SUCCESS = "Job updated successfully!";
	public static String JOB_DELETE_SUCCESS = "Job deleted successfully!";
	
	//Resume
	public static String RESUME_CREATE_SUCCESS = "Resume created successfully!";
	public static String RESUME_RETREIVE_SUCCESS = "Resume retrieved successfully!";
	public static String RESUME_UPDATE_SUCCESS = "Resume updated successfully!";
	public static String RESUME_DELETE_SUCCESS = "Resume deleted successfully!";
	
	// categories
	public static String CATEGORY_CREATE_SUCCESS = "Category created successfully!";
	public static String CATEGORY_RETREIVE_SUCCESS = "Category retrieved successfully!";
	
	// Notifications
	public static String NOTIFICATIONS_RETRIEVE ="Notifications retrieved successfully!";
	
	// Shared Rides
	public static String RIDE_SUCCESS = "Your ride has been successfully created!";
	public static String RIDE_JOIN_SUCCESS = "Your ride is sent to the admin for approval!";
	public static String RIDE_UNAVAILABLE_TO_JOIN ="Ride is not open to join right now! It is either closed or full.";
	public static String RIDE_USER_ALREADY_EXISTS ="User record already added in this ride.";
	public static String RIDE_NO_SEAT_LEFT ="Ride is full. Please contact admin or create a new ride.";
	public static String RIDE_USER_DOESNT_EXISTS ="User record doesn't exists in this ride.";
	public static String RIDE_USER_NOT_LOGGED_IN ="User not logged in. Please log in to view your rides.";
	
	// Rooms
	public static String ROOM_USER_NOT_LOGGED_IN ="User not logged in. Please log in to view your rooms.";
	
	// Post
	public static String POST_CREATE_SUCCESS = "Post created successfully!";
	public static String POST_UPDATE_SUCCESS = "Post updated successfully!";
	public static String POST_RETRIEVE_SUCCESS = "Post retreived successfully!";
	public static String POST_USER_NOT_LOGGED_IN ="User not logged in. Please log in to view your posts.";
	
	// Score
	public static String SCORE_RETRIEVE_SUCCESS = "Score retrieved successfully!";
	
	// Business
	public static String EMPLOYEE_RETRIEVE_SUCCESS = "Employees list retrieved successfully!";
	public static String CUSTOMER_RETRIEVE_SUCCESS = "Customers list retrieved successfully!";
	
	// Accounts
	public static String CREDIT_ACCOUNT_RETRIEVE_SUCCESS = "Credit accounts retrieved successfully!";
	public static String CREDIT_ACCOUNT_NOT_FOUND = "Credit account does not exist";
	public static String CREDIT_ACCOUNT_BLOCKED = "Credit account is blocked!";
	public static String CREDIT_ACCOUNT_DELETED = "Credit account is deleted!";
	public static String CREDIT_ACCOUNT_CREATE_SUCCESS = "Credit account created successfully!";
	public static String CREDIT_ACCOUNT_UPDATE_SUCCESS = "Credit account updated successfully!";
	public static String CREDIT_LIMIT_EXCEED = "Credit Limit exceeded!";
	
	// Coupons
	public static String COUPON_CREATE_SUCCESS = "Coupon created successfully!";
	public static String COUPON_UPDATE_SUCCESS = "Coupon updated successfully!";
	public static String COUPON_RETRIEVE_SUCCESS = "Coupon/s retrieved successfully!";
	public static String COUPON_ASSIGNEE_RETRIEVE_SUCCESS = "Coupon assignee/s retrieved successfully!";
	public static String COUPON_NOT_EXIST = "Coupon does not exist!";
	public static String COUPON_ASSIGN_DUPLICATE = "Coupon already assigned!";
	public static String COUPON_ASSIGN_SUCCESS = "Coupon assigned successfully!";
	public static String COUPON_NOT_ASSIGN = "Coupon not assigned to this profile!";
	public static String COUPON_REDEEM_SUCCESS = "Coupon redeemed successfully!";
	public static String COUPON_ALREADY_REDEEMED = "Coupon has already been redeemed!";
	public static String COUPON_ASSIGNMENT_LIMIT_REACHED = "All coupons has been redeemed. Try later!";
	public static String couponInactive_MSG = "coupon is currently inactive!";
	public static String couponBlocked_MSG = "coupon is blocked!";
	public static String couponExpired_MSG = "coupon has expired!";
	
	// Sections
	public static String SECTION_CREATE_SUCCESS = "Section created successfully!";
	public static String SECTION_UPDATE_SUCCESS = "Section updated successfully!";
	public static String SECTION_RETRIEVE_SUCCESS = "Section/s retrieved successfully!";
	
	// otp
	public static String OTP_SEND_SUCCESS = "OTP send successfully!";
	public static String OTP_SEND_UNSUCCESS = "OTP send unsuccessfully!";
	public static String OTP_VERIFY_SUCCESS = "OTP verified successfully!";
	public static String OTP_VERIFY_FAIL = "OTP verification failed!";
	public static String OTP_EXPIRED = "OTP expired!";
	
	//Groups response strings
	public static String GROUP_CREATE_SUCCESS = "Group created successfully";
	public static String GROUP_CREATE_FAIL = "Group creation failed";
	public static String GROUP_UPDATE_SUCCESS = "Group update success";
	public static String GROUP_UPDATE_FAIL = "Group update failed";


	public static String APPLY_JOIN_GROUP_SUCCESS = "Applied to join group successfully";
	public static String APPLY_JOIN_DUPLICATE = "Already a member of the group!";
	public static String APPLY_JOIN_GROUP_FAIL = "Apply to join group failed";
	
	public static String GROUP_RETRIEVE_SUCCESS = "Groups retrieved successfully";
	public static String GROUP_RETRIEVE_FAIL = "Failed to retrieve groups";
	
	public static String GROUP_MEMBER_RETRIEVE_SUCCESS = "Group members retrieved successfully";
	public static String GROUP_MEMBER_RETRIEVE_FAIL = "Failed to retrieve group members";
	
	//Sales response strings
	public static String SALES_RETRIEVE_SUCCESS = "Sales retrieved successfully";
	public static String SALES_RETRIEVE_FAIL = "Sales retrieval failed.";
	
	// ************************* Load Types ********************************************/
	
	// Poll
	public static String POLL_SUBMISSION_SUCCESS = "Poll submitted successfully!";
	public static String POLL_RESULT_RETREIVE_SUCCESS = "Poll result retrieved successfully!";
	public static String POLL_USERLIST_RETREIVE_SUCCESS = "Poll user list retrieved successfully!";

	//////////////////////////// CAMPUS /////////////////////////////////////////////////
	
	public static int campusLoad = 1;
	
	//////////////////////////// BUSINESS /////////////////////////////////////////////////
	
	public static int loadBusinessCH = 1;
	public static int loadBusinessMaalik = 2;
	public static int loadBusinessAdmin = 4;
	
	//////////////////////////// JOBS /////////////////////////////////////////////////
		
	public static int jobsLoadEmployer = 1;
	public static int jobsLoadCampus = 2;
	public static int jobsLoadApplicant = 3;
	public static int jobsLoadAdmin = 4;
	
	//////////////////////////// GROUPS /////////////////////////////////////////////////
	public static int GROUP_LOAD_TYPE_CREATOR = 1;
	public static int GROUP_LOAD_TYPE_CAMPUS = 2;
	public static int GROUP_LOAD_TYPE_MEMBER = 3;
	public static int GROUP_LOAD_TYPE_ADMIN = 4;
}
