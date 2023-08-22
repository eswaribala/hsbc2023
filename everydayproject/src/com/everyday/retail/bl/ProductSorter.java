package com.everyday.retail.bl;

import java.util.Comparator;

import com.everyday.retail.entities.Product;

public class ProductSorter implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		if(o1.getQty()>o2.getQty()) 
			return -1; 
		else if(o1.getQty()<o2.getQty()) 
			return 1; 
		else
			return 0;
			
	}

}
