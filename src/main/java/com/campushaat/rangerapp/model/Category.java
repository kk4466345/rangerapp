package com.campushaat.rangerapp.model;

import java.util.ArrayList;

//import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;

//@DynamoDBDocument
public class Category implements Cloneable{

	private String categoryId;
	private String categoryTitle;
	private String categoryInfo;
	private String categoryType;
	private String categoryParentId;
	
	private ArrayList<Category> categoryList = new ArrayList<Category>();		// Don't remove, we can store editing history in the child nodes

	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
	/**
	 * 
	 */
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}

//	public Category(Category category) {
//		super();
//		this.setCategoryId(category.getCategoryId());
//		this.setTitle(category.getCategoryTitle());
//	}

	public Category(String categoryId) {
		super();
		this.categoryId = categoryId;
	}
	
	public Category(int categoryId) {
		super();
		this.categoryId = Integer.toString(categoryId);
	}

	public Category(String categoryId, String categoryTitle) {
		
		super();
		this.categoryId = categoryId;
		this.categoryTitle = categoryTitle;
	}
	
	
	
	/**
	 * @param categoryId
	 * @param categoryTitle
	 * @param categoryInfo
	 */
	public Category(String categoryId, String categoryTitle, String categoryInfo) {
		super();
		this.categoryId = categoryId;
		this.categoryTitle = categoryTitle;
		this.categoryInfo = categoryInfo;
	}

	public Category(int categoryId, int categoryTitle) {
		
		super();
		this.categoryId = Integer.toString(categoryId);
		this.categoryTitle = Integer.toString(categoryTitle);
	}
	
	public Category(int categoryId, String categoryTitle) {
		
		super();
		this.categoryId = Integer.toString(categoryId);
		this.categoryTitle = categoryTitle;
	}

//	public Category(String categoryTitle, String categoryInfo, Media media) {
//		
//		super();
//		this.categoryTitle = categoryTitle;
//		this.categoryInfo = categoryInfo;
//		this.setCategoryList(new ArrayList<Category>());
//		this.setMedia(media);
//	}
	
	public Category(String categoryId, String categoryTitle, ArrayList<Category> categoryList) {
		super();
		this.categoryId = categoryId;
		this.categoryTitle = categoryTitle;
		this.categoryList = categoryList;
	}
	
	public Category(int categoryId, String categoryTitle, ArrayList<Category> categoryList) {
		super();
		this.categoryId = Integer.toString(categoryId);
		this.categoryTitle = categoryTitle;
		this.categoryList = categoryList;
	}

	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	
	public String getCategoryTitle() {
		return categoryTitle;
	}
	public void setCategoryTitle(String categoryTitle) {
		this.categoryTitle = categoryTitle;
	}
	
	public String getCategoryInfo() {
		return categoryInfo;
	}
	public void setCategoryInfo(String categoryInfo) {
		this.categoryInfo = categoryInfo;
	}
	
	public String getCategoryType() {
		return categoryType;
	}

	public void setCategoryType(String categoryType) {
		this.categoryType = categoryType;
	}

	public String getCategoryParentId() {
		return categoryParentId;
	}

	public void setCategoryParentId(String categoryParentId) {
		this.categoryParentId = categoryParentId;
	}

	public ArrayList<Category> getCategoryList() {
		return categoryList;
	}
	public void setCategoryList(ArrayList<Category> categoryList) {
		this.categoryList = categoryList;
	}
}
