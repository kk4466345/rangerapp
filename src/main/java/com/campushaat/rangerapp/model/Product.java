package com.campushaat.rangerapp.model;

import java.util.ArrayList;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import com.campushaat.rangerapp.utils.Constants;


@DynamoDBDocument
public class Product extends Profile{

	// title, info, media, analytics
	private String productId, productParentId;
	
	private Category productType, productCategory, productCondition;

	private String productCreatedBy, productFromShop; 				// don't remove this variable, used in maalik

	private CreatorInfo productSoldBy;			// Take Seller Info in this Variable  - Used in Campus Haat
//	private Pricing productPricing, pricing;		// Pricing Is Used For Order Products Pricing
	
	// Pricing Variables For Easy Access In The Client Devices
	private double mrp, sale, discount, off;
	
	private int productQuantity;
	private Category productUnit; 				// comp // default / mg / ml / meter / convert into object, unit/currency conversions
	
	//ProductOrder Fields
//	private Status orderProductStatus;			//status of availability of the product from seller
	private String orderProductMessage;			//if buyer wants to send a message regarding the product
	
	private int orderTotal;						// total orders of this product
	private int orderQuantityTotal;				// total quantity of the product sold
	private int productTotalSale;				// total sale of the product
	
	private int productPreparationTime;         // time in minutes it takes to prepare the product
	
	private Category productCampus;				// Campus Details of product: IITK, PSIT ......
	private Category productCreatedOn;			// CH-1, KakaG - 15000.....
	private String productCreateDate;			// Product Create Date
	private String productModifiedDate;			// Product Modified Date
	
	private ArrayList<Product> productList;		// Don't remove, we can store editing history in the child nodes
	
	public Product() {
		
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Product(String productId) {
		super();
		this.productId = productId;
	}
//
//	public Product(String id, String title, ArrayList<Product> productList, Media media, Pricing pricing) {
//		
//		super();
//		this.productId = id;
//		this.setTitle(title);
//		this.productList = productList;
//		this.setMedia(media);
//		this.setProductPricing(pricing);
//	}
	
//	public Product(String title, String info, Media media, Pricing pricing) {
//		
//		super();
//		this.setTitle(title);
//		this.setInfo(info);
//		this.setMedia(media);
//		this.setProductPricing(pricing);
//	}
//	
//	public Product(String productId, String productName, Category category, Media media) {
//		
//		super();
//		this.productId = productId;
//		this.setTitle(productName);
//		this.setProductCategory(category);
//		this.setMedia(media);
//		// TODO Auto-generated constructor stub
//	}
	
//	public Product(String productId, String productName, Category category, Category condition, Media media) {
//		
//		super();
//		this.productId = productId;
//		this.setTitle(productName);
//		this.setProductCategory(category);
//		this.setProductCondition(condition);
//		this.setMedia(media);
//		// TODO Auto-generated constructor stub
//	}
//	
//   public Product(String productId, String productName, String info, Category category, Category condition, Media media) {
//		
//		super();
//		this.productId = productId;
//		this.setTitle(productName);
//		this.setInfo(info);
//		this.setProductCategory(category);
//		this.setProductCondition(condition);
//		this.setMedia(media);
//		// TODO Auto-generated constructor stub
//	}

	/**
	 * @param productId
	 * @param productProfileId
	 * @param title
	 * @param info
	 * @param productType
	 * @param productCategory
	 * @param productPricing
	 * @param pricing
	 * @param productQuantity
	 * @param media
	 * @param contact
	 * @param timing
	 * @param analytics
	 * @param estType
	 */
//	public Product(String productId, String productProfileId, String title, String info, Category productType, 
//					Category productCategory, Pricing productPricing, int productQuantity, Media media,
//					Contact contact, Timings timing, Analytics analytics, Category establishmentType) {
//		
//		super();
//		this.productId = productId;
//		this.setId(productProfileId);
//		this.setTitle(title);
//		this.setInfo(info);
//		this.productType = productType;
//		this.productCategory = productCategory;
//		this.productPricing = productPricing;
//		this.productQuantity = productQuantity;
//		this.setMedia(media);
//		this.setContact(contact);
//		this.setTiming(timing);
//		this.setAnalytics(analytics);
//		this.setEstablishmentType(establishmentType);
//	}

//	public Product(String productId, String productName,Media media) {
//		
//		super();
//		this.productId = productId;
//		this.setTitle(productName);
//		this.setMedia(media);
//		// TODO Auto-generated constructor stub
//	}
//	
//	public Product(String productId, String productName,Media media, int quantity, int total) {
//		
//		super();
//		this.productId = productId;
//		this.setTitle(productName);
//		this.setMedia(media);
//		this.setProductQuantity(quantity);
//		this.setProductTotalSale(total);
//		// TODO Auto-generated constructor stub
//	}
	
	@DynamoDBHashKey
	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}
	
	public String getProductParentId() {
		return productParentId;
	}

	public void setProductParentId(String productParentId) {
		this.productParentId = productParentId;
	}

	public Category getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(Category productCategory) {
		this.productCategory = productCategory;
	}

	public Category getProductCondition() {
		return productCondition;
	}

	public void setProductCondition(Category productCondition) {
		this.productCondition = productCondition;
	}

//	public Pricing getProductPricing() {
//		return productPricing;
//	}
//
//	public void setProductPricing(Pricing productPricing) {
//		this.productPricing = productPricing;
//	}
//
//	public Pricing getPricing() {
//		return pricing;
//	}
//
//	public void setPricing(Pricing pricing) {
//		this.pricing = pricing;
//	}

	public String getProductCreatedBy() {
		return productCreatedBy;
	}

	public void setProductCreatedBy(String productCreatedBy) {
		this.productCreatedBy = productCreatedBy;
	}

	public CreatorInfo getProductSoldBy() {
		return productSoldBy;
	}

	public void setProductSoldBy(CreatorInfo productSoldBy) {
		this.productSoldBy = productSoldBy;
	}

	public String getProductFromShop() {
		return productFromShop;
	}

	public void setProductFromShop(String productFromShop) {
		this.productFromShop = productFromShop;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	public Category getProductUnit() {
		return productUnit;
	}

	public void setProductUnit(Category productUnit) {
		this.productUnit = productUnit;
	}

	public int getOrderTotal() {
		return orderTotal;
	}

	public void setOrderTotal(int orderTotal) {
		this.orderTotal = orderTotal;
	}

	public int getOrderQuantityTotal() {
		return orderQuantityTotal;
	}

	public void setOrderQuantityTotal(int orderQuantityTotal) {
		this.orderQuantityTotal = orderQuantityTotal;
	}

	public int getProductTotalSale() {
		return productTotalSale;
	}

	public void setProductTotalSale(int productTotalSale) {
		this.productTotalSale = productTotalSale;
	}

	public ArrayList<Product> getProductList() {
		return productList;
	}
	public void setProductList(ArrayList<Product> productList) {
		this.productList = productList;
	}

	public Category getProductType() {
		return productType;
	}

	public void setProductType(Category productType) {
		this.productType = productType;
	}

	public Category getProductCampus() {
		return productCampus;
	}

	public void setProductCampus(Category productCampus) {
		this.productCampus = productCampus;
	}

	public Category getProductCreatedOn() {
		return productCreatedOn;
	}

	public void setProductCreatedOn(Category productCreatedOn) {
		this.productCreatedOn = productCreatedOn;
	}

	public String getProductCreateDate() {
		return productCreateDate;
	}

	public void setProductCreateDate(String productCreateDate) {
		this.productCreateDate = productCreateDate;
	}

	public String getProductModifiedDate() {
		return productModifiedDate;
	}

	public void setProductModifiedDate(String productModifiedDate) {
		this.productModifiedDate = productModifiedDate;
	}
	
	public int getProductPreparationTime() {
		return productPreparationTime;
	}

	public void setProductPreparationTime(int productPreparationTime) {
		this.productPreparationTime = productPreparationTime;
	}

//	public Status getOrderProductStatus() {
//		return orderProductStatus;
//	}
//
//	public void setOrderProductStatus(Status orderProductStatus) {
//		this.orderProductStatus = orderProductStatus;
//	}

	public String getOrderProductMessage() {
		return orderProductMessage;
	}

	public void setOrderProductMessage(String orderProductMessage) {
		this.orderProductMessage = orderProductMessage;
	}

	public synchronized double getMrp() {
		return mrp;
	}

	public synchronized void setMrp(double mrp) {
		this.mrp = mrp;
	}

	public synchronized double getSale() {
		return sale;
	}

	public synchronized void setSale(double sale) {
		this.sale = sale;
	}

	public synchronized double getDiscount() {
		return discount;
	}

	public synchronized void setDiscount(double discount) {
		this.discount = discount;
	}

	public synchronized double getOff() {
		return off;
	}

	public synchronized void setOff(double off) {
		this.off = off;
	}
}
