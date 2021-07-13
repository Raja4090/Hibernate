package com.phoenix.entity;


/*author : raja.kumar@stltech.in
 * creation date: 07/07/2021
 * version 1.0
 * @copyright: Sterlite technology ltd.
 * description: pojo class
 */
public class Product {
	
	//private data members
	private int productId;
	private String productName;
	private float price;
	
	//default constructor
	
	public Product()
	{
		
	}
	
	//parameterized constructor
	public Product(int productId,String productName,float price)
	{
		super();
		this.productId=productId;
		this.productName=productName;
		this.price=price;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
}
