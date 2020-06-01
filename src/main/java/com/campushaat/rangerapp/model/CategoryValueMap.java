package com.campushaat.rangerapp.model;

import java.util.ArrayList;

//import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;

//@DynamoDBDocument
public class CategoryValueMap {
	
	public String categoryValueMapId;
	public Category categoryValueMapType;
	
	public ArrayList<Category> categoryValueMapValue;
	
	private ArrayList<CategoryValueMap> categoryValueMapList;

	public String getCategoryValueMapId() {
		return categoryValueMapId;
	}

	public void setCategoryValueMapId(String categoryValueMapId) {
		this.categoryValueMapId = categoryValueMapId;
	}

	public Category getCategoryValueMapType() {
		return categoryValueMapType;
	}

	public void setCategoryValueMapType(Category categoryValueMapType) {
		this.categoryValueMapType = categoryValueMapType;
	}

	public ArrayList<Category> getCategoryValueMapValue() {
		return categoryValueMapValue;
	}

	public void setCategoryValueMapValue(ArrayList<Category> categoryValueMapValue) {
		this.categoryValueMapValue = categoryValueMapValue;
	}

	public ArrayList<CategoryValueMap> getCategoryValueMapList() {
		return categoryValueMapList;
	}

	public void setCategoryValueMapList(ArrayList<CategoryValueMap> categoryValueMapList) {
		this.categoryValueMapList = categoryValueMapList;
	}
}