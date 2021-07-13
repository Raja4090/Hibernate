package com.phoenix.data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//author: raja.kumar@stltech.in
/*
 * version: 2.0
 * pojo class for product
 */
@Entity
@Table(name="product1")
public class Product {
  
  @Id

  private int id;
 
  String name;

  float price;
   
  
   public Product()
   {
	  id=3001;
	  name="Laptop";
	  price=2700.00f;
   }
  
   public Product(int id,String name,float price)
   {
	  this.id=id;
	  this.name=name;
	  this.price=price;
   }

   public int getId() 
   {
	  return id;
   }

	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}
	   
   
  
}
