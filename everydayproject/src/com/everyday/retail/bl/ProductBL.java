package com.everyday.retail.bl;

import com.everyday.retail.entities.Product;

public interface ProductBL {
	
	//add the products
	
	boolean addProducts(Product[] products);
	
	//retrieve the products
	
	Product[] getAllProducts();
	
	// retrieve Product By id
	
	Product getProductById(long itemCode);

}
