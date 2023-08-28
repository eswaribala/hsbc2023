package com.amazon.ecommerce.views;

import java.util.ArrayList;

import com.amazon.ecommerce.models.Product;
import com.amazon.ecommerce.models.SeasonalProduct;

public class TestGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Product is sub type of Object 
		ArrayList<?> test=new ArrayList<Product>();
		
		ArrayList<? super SeasonalProduct> test1=new 
				ArrayList<Product>();
		ArrayList<? extends Number> test2=new ArrayList<Number>();
		
		
	}

}
