package com.everyday.retail.dao;

import com.everyday.retail.entities.Product;

public class ProductDaoImpl implements ProductDao {

	private Product[] products;
	
	
	
	public ProductDaoImpl(int size) {
		super();
		// TODO Auto-generated constructor stub
		
		this.products=new Product[size];
	}

	@Override
	public boolean addProducts(Product[] products) {
		// TODO Auto-generated method stub
		boolean status=false;
		if(this.products.length==products.length) {
			this.products=products;
			status=true;
		}
		else
		{
			for(int i=0;i<products.length;i++) {
				this.products[i]=products[i];
			}
			status=true;
		}
			
		
		return status;
	}

	@Override
	public Product[] getAllProducts() {
		// TODO Auto-generated method stub
		return this.products;
	}

	@Override
	public Product getProductById(long itemCode) {
		// TODO Auto-generated method stub
		Product product=null;
		for(Product prod : this.products) {
			if(prod.getItemCode()==itemCode)
			{
				product=prod;
				break;
			}
		}
		
		return product;
	}

}
