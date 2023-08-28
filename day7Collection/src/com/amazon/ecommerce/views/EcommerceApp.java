package com.amazon.ecommerce.views;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import com.amazon.ecommerce.bl.ProductBL;
import com.amazon.ecommerce.bl.ProductBLImpl;
import com.amazon.ecommerce.exceptions.DiskAccessException;
import com.amazon.ecommerce.exceptions.ProductException;
import com.amazon.ecommerce.models.Product;

public class EcommerceApp {

	public static void main(String[] args) {
		Iterator<Product> itr=null;
		Product product=null;
		try {
			ProductBL productBL=new ProductBLImpl();
			//productBL.addProducts(generateProducts());
			itr=productBL.getSortedProducts().iterator();
			while(itr.hasNext())
			{
				product=(Product) itr.next();
				System.out.println(product.getName()
						+","+product.getDom().toString());
			}
			
		} catch (DiskAccessException | ProductException e) {
			
			// TODO Auto-generated catch block
			StackTraceElement[] stack=e.getStackTrace();
			for(StackTraceElement element: stack) {
				System.out.println(element.getClassName());
				System.out.println(element.getFileName());
				System.out.println(element.getLineNumber());
			}
		}
		
	}
	
	private static List<Product> generateProducts(){
		List<Product> products=new ArrayList<Product>();
		Product product;
		for(int i=0;i<100;i++) {
			product=new Product(new Random().nextInt(10000),
					"Product"+i, 
					LocalDate.of(2020+new Random().nextInt(3),
							1+new Random().nextInt(10),
							1+new Random().nextInt(25)),
					new Random().nextInt(100000)
					);
			products.add(product);
		}
		return products;
	}
}
