package com.phoenix.daos;

import java.util.List;

import com.phoenix.data.Product;

public interface ProductDao {
	List<Product>getAllProducts();
	Product getProductById(int id);
	
	void insert(Product product);
	void update(Product product);
	void delete(Product product);
}
