package com.continental.business;

import java.util.ArrayList;
import java.util.Date;
import java.util.Hashtable;
import java.util.List;
import java.util.Random;

import com.continental.model.Product;

public class ProductInfo {
	
	private static List<Product> productList=new ArrayList();
	
	public static List<Product> getProducts()
	{
		productList.add(new Product(438756839,"Laptop",56000,new Date(115,5,15)));
		productList.add(new Product(438756833,"Dell Laptop",89000,new Date(113,11,5)));
		productList.add(new Product(438756831,"HP Laptop",76000,new Date(107,4,10)));
		productList.add(new Product(438756832,"Dell Laptop",64000,new Date(103,5,5)));
		productList.add(new Product(438756840,"Acer Laptop",45000,new Date(102,5,25)));
		productList.add(new Product(438756829,"Laptop",98000,new Date(116,9,5)));
		return productList;
		
		
	}
	
	
	public static Hashtable<Product,Integer> getHTList()
	{
		Hashtable<Product,Integer> products= new Hashtable<Product,Integer>();
		
		ProductInfo.getProducts().forEach(obj->{			
			
			products.put(obj,new Random().nextInt(1000) );
		});
		return products;
	}

}
