package com.phoenix.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*author : raja.kumar@stltech.in
 * creation date: 07/07/2021
 * version 2.0
 * @copyright: Sterlite technology ltd.
 * description: pojo class JPA Annotations
 */

@Entity
@Table(name="product1")

public class Product {
	
	@Id
	
	//private data members
	@GeneratedValue(generator="increment")
	@Column(name="ID")
	private int productId;
	
	@Column(name="name")
	private String productName;
	@Column(name="price")
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

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price + "]";
	}
	
}
