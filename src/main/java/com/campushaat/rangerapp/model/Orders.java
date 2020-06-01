package com.campushaat.rangerapp.model;

import java.util.ArrayList;



public class Orders {
	
	private String orderId;
	private String orderParentId;
    private CreatorInfo creator;  
	
	// Ad packages to sell/buy
//	private ArrayList<Ads> adsList = new ArrayList<Ads>();
//	private ArrayList<Product> productList = new ArrayList<Product>();		// items to sell/buy
		
	private Category orderType;					// Product&Services, Ride		
	private Category orderMode;					// call, online, in-shop, other
	
//	private Delivery deliveryInfo;				// status, time-distance estimate
//	private Pricing orderPricing;				// remove pricing after android update
	private String orderDeliveryType;			// type of delivery S-H-B / S-H-RH-B / some similar method of delivery
	private String applicationId;
	
//    private Payment payment;
   	
	// confirmed, rejected/cancel, complete
    // ready to deliver/serve, on-the-way, delivered, return initiated, delivered back, completed
	// In-progress, waiting for payment, payment pending, added to credit, waiting for ranger, ranger alloted
    // Buyer, Seller, Rangers, CH
    // Product / Delivery / Payment / Order
//	private Status orderStatus;	
	
	// People grouped by role
//    private ArrayList<Persons> persons;			// seller, buyer, technical assistant, delivery boys, creator, promoter
	private Users buyer;							// Name, Mobile, Address
	private String sellerId;
	
	private String orderMessage;
 
    private ArrayList<Orders> ordersList;

	private int avgTime;
	private int minTime;
	private int maxTime;
	private int ExpecTimeLowerLimit;
	private int ExpecTimeUpperLimit;
    
    public Orders() {
		super();
	}
    
    /**
	 * @param creator
	 * @param productList
	 * @param orderMode
	 * @param payment
	 * @param buyer
	 */
	



	/**
	 * @param orderId
	 */
	public Orders(String orderId, CreatorInfo creator) {
		super();
		this.orderId = orderId;
		this.creator = creator;
	}

	/**
	 * @param orderId
	 */
	public Orders(String orderId) {
		super();
		this.orderId = orderId;
	}

//	public Orders(String orderId, Pricing pricing,Delivery delivery,Status status,CreatorInfo creator,ArrayList<Product> product) {
//		super();
//		this.orderId = orderId;
//		this.orderPricing = pricing;
//		this.deliveryInfo = delivery;
//		this.orderStatus = status;
//		this.creator = creator;
//		this.productList = product;
//	}
    
	//new constructor for makeOrders
//	public Orders(String orderId, Pricing pricing,Delivery delivery,Status status,CreatorInfo creator) {
//		super();
//		this.orderId = orderId;
//		this.orderPricing = pricing;
//		this.deliveryInfo = delivery;
//		this.orderStatus = status;
//		this.creator = creator;
//	}
    
	
//	public Orders(String orderId, Delivery delivery, String orderMessage, CreatorInfo creator) {
//		
//		this.orderId = orderId;
//		this.deliveryInfo = delivery;
//		this.creator = creator;
//		this.orderMessage = orderMessage;
//	}

	/**
	 * @param order
	 * @param roleId
	 */
//	public Persons getOrderPerson(String roleId){	
//	
//		 if(this!=null && this.getPersons()!=null) {
//			
//			 for(int i = 0; i<this.getPersons().size(); i++) {
//				 
//				Persons peoples = this.getPersons().get(i);
//				Category role = peoples.getRole();
//				if(role.getCategoryId().equals(roleId)) {
//					return peoples;
//				}
//			}
//		}
//		return null;
//	}


//	@DynamoDBHashKey
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	
	public CreatorInfo getCreator() {
		return creator;
	}
	public void setCreator(CreatorInfo creator) {
		this.creator = creator;
	}

	public Category getOrderType() {
		return orderType;
	}
	public void setOrderType(Category orderType) {
		this.orderType = orderType;
	}
	

	public String getOrderParentId() {
		return orderParentId;
	}
	public void setOrderParentId(String orderParentId) {
		this.orderParentId = orderParentId;
	}
	
//	public ArrayList<Persons> getPersons() {
//		return persons;
//	}
//
//
//	public void setPersons(ArrayList<Persons> persons) {
//		this.persons = persons;
//	}
//
//	public void addPersons(Persons rolePeoples) {
//		
//		if(this.getPersons()!=null) { 
//			this.getPersons().add(rolePeoples);
//		}
//		else {
//			ArrayList<Persons> peoples = new ArrayList<Persons>();
//			peoples.add(rolePeoples);
//			this.setPersons(peoples);
//		}
//	}
	
	public Category getOrderMode() {
		return orderMode;
	}
	public void setOrderMode(Category orderMode) {
		this.orderMode = orderMode;
	}
	
//	public Payment getPayment() {
//		return payment;
//	}
//	public void setPayment(Payment payment) {
//		this.payment = payment;
//	}
//
//	public Pricing getOrderPricing() {
//		return orderPricing;
//	}
//
//	public void setOrderPricing(Pricing orderPricing) {
//		this.orderPricing = orderPricing;
//	}


//	public Status getOrderStatus() {
//		return orderStatus;
//	}
//
//	public void setOrderStatus(Status orderStatus) {
//		this.orderStatus = orderStatus;
//	}
//
//	public Delivery getDeliveryInfo() {
//		return deliveryInfo;
//	}
//
//	public void setDeliveryInfo(Delivery deliveryInfo) {
//		this.deliveryInfo = deliveryInfo;
//	}
//
//	public ArrayList<Product> getProductList() {
//		return productList;
//	}
//
//	public void setProductList(ArrayList<Product> productList) {
//		this.productList = productList;
//	}

	public Users getBuyer() {
		return buyer;
	}

	public void setBuyer(Users buyer) {
		this.buyer = buyer;
	}

	public ArrayList<Orders> getOrdersList() {
		return ordersList;
	}

	public void setOrdersList(ArrayList<Orders> ordersList) {
		this.ordersList = ordersList;
	}


	public String getOrderMessage() {
		return orderMessage;
	}


	public void setOrderMessage(String orderMessage) {
		this.orderMessage = orderMessage;
	}


	public String getOrderDeliveryType() {
		return orderDeliveryType;
	}


	public void setOrderDeliveryType(String orderDeliveryType) {
		this.orderDeliveryType = orderDeliveryType;
	}


	public String getApplicationId() {
		return applicationId;
	}


	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}
	
	public int getAvgTime() {
		return avgTime;
	}


	public void setAvgTime(int avgTime) {
		this.avgTime = avgTime;
	}


	public int getMinTime() {
		return minTime;
	}


	public void setMinTime(int minTime) {
		this.minTime = minTime;
	}


	public int getMaxTime() {
		return maxTime;
	}


	public void setMaxTime(int maxTime) {
		this.maxTime = maxTime;
	}


	public int getExpecTimeLowerLimit() {
		return ExpecTimeLowerLimit;
	}


	public void setExpecTimeLowerLimit(int expecTimeLowerLimit) {
		ExpecTimeLowerLimit = expecTimeLowerLimit;
	}


	public int getExpecTimeUpperLimit() {
		return ExpecTimeUpperLimit;
	}


	public void setExpecTimeUpperLimit(int expecTimeUpperLimit) {
		ExpecTimeUpperLimit = expecTimeUpperLimit;
	}

	public synchronized String getSellerId() {
		return sellerId;
	}

	public synchronized void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}
}
