package com.ecomm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table

public class Category 
{
	@Id								//each entity bean will have a primary key
	@GeneratedValue(strategy=GenerationType.IDENTITY) //IN H2 DB Each table will have separate identity
	int categoryId;
	String categoryName;
	String categoryDesc;
	public int getCategoryId()
	{
		return categoryId;
	}
	public void setCategoryId(int categoryId) 
	{
		this.categoryId = categoryId;
	}
	public String getCategoryName() 
	{
		return categoryName;
	}
	public void setCategoryName(String categoryName)
	{
		this.categoryName = categoryName;
	}
	public String getCategoryDesc() 
	{
		return categoryDesc;
	}
	public void setCategoryDesc(String categoryDesc) 
	{
		this.categoryDesc = categoryDesc;
	}

}
