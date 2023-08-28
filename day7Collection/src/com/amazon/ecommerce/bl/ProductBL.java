package com.amazon.ecommerce.bl;

import java.util.List;

import com.amazon.ecommerce.exceptions.DiskAccessException;
import com.amazon.ecommerce.models.Product;

public interface ProductBL {

	boolean addProducts(List<Product> product)throws 
	DiskAccessException;
	
	List<Product> getSortedProducts();
}
