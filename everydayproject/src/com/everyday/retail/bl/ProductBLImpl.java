package com.everyday.retail.bl;

import com.everyday.retail.dao.ProductDao;
import com.everyday.retail.dao.ProductDaoImpl;
import com.everyday.retail.entities.Product;

public class ProductBLImpl implements ProductBL{

	private ProductDao productDao;	
	
	public ProductBLImpl(int size) {
		super();
		// TODO Auto-generated constructor stub
		
		this.productDao=new ProductDaoImpl(size);
	}

	@Override
	public boolean addProducts(Product[] products) {
		// TODO Auto-generated method stub
		//validates the array
		if(products.length>0)
			return this.productDao.addProducts(products);
		else
		   return false;
	}

	@Override
	public Product[] getAllProducts() {
		// TODO Auto-generated method stub
		if(this.productDao.getAllProducts().length>0)
			return this.productDao.getAllProducts();
		else
		   return null;
	}

	@Override
	public Product getProductById(long itemCode) {
		// TODO Auto-generated method stub
		if(this.productDao.getProductById(itemCode)!=null)
			return this.productDao.getProductById(itemCode);
		else
		   return null;
	}

}
