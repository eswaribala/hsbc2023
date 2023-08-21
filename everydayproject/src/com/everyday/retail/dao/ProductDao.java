package com.everyday.retail.dao;

import com.everyday.retail.entities.Product;

public interface ProductDao {

	//add the products
	
		boolean addProducts(Product[] products);
		
		//retrieve the products
		
		Product[] getAllProducts();
		
		// retrieve Product By id
		
		Product getProductById(long itemCode);
}
