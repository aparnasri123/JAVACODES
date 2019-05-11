package com.eshopping.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Product {
	
	@Id
	@GeneratedValue
	
	private int ProductId;
	private String ProductName;
	private String ProductDesc;
	
	public int getProductId() 
	{
		return ProductId;
	}
	public void setProductId(int productId) 
	{
		ProductId = productId;
	}
	public String getProductName() 
	{
		return ProductName;
	}
	public void setProductName(String productName) 
	{
		ProductName = productName;
	}
	public String getProductDesc() 
	{
		return ProductDesc;
	}
	public void setProductDesc(String productDesc) 
	{
		ProductDesc = productDesc;
	}

}
