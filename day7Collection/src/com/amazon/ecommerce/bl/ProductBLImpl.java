package com.amazon.ecommerce.bl;

import java.io.EOFException;
import java.io.IOException;
import java.util.List;

import com.amazon.ecommerce.dao.ProductDao;
import com.amazon.ecommerce.dao.ProductDaoImpl;
import com.amazon.ecommerce.exceptions.DiskAccessException;
import com.amazon.ecommerce.exceptions.ProductException;
import com.amazon.ecommerce.models.Product;

public class ProductBLImpl implements ProductBL{
	
	private ProductDao productDao;
	
	public ProductBLImpl() throws DiskAccessException {
		try {
			this.productDao=new ProductDaoImpl();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//rethrow
			throw new DiskAccessException("Need "
					+ "permission to create file");
		}
	}

	@Override
	public boolean addProducts(List<Product> products) 
			throws DiskAccessException {
		// TODO Auto-generated method stub
		//validate
		if(products.size()>0)
			try {
				return this.productDao.addProducts(products);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				
				throw new DiskAccessException("Need "
						+ "permission to access file");
			}
		else
			
		  return false;
	}

	@Override
	public List<Product> getSortedProducts() {
		// TODO Auto-generated method stub
		List<Product> products=null;
		try {
			products=this.productDao.getProducts();
			products.sort(new ProductSorter());
			
		} catch (ClassNotFoundException | IOException  e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			//wrapping exception
			throw new ProductException(e.getMessage());
		}
		return products;
	}

}
