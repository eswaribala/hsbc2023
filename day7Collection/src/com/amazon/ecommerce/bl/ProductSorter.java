package com.amazon.ecommerce.bl;

import java.util.Comparator;

import com.amazon.ecommerce.models.Product;

public class ProductSorter implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		return o1.getDom().compareTo(o2.getDom());
	}

}
