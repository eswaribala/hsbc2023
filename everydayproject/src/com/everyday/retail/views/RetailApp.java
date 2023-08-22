package com.everyday.retail.views;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import com.everyday.retail.bl.ProductBL;
import com.everyday.retail.bl.ProductBLImpl;
import com.everyday.retail.bl.ProductSorter;
import com.everyday.retail.entities.Apparel;
import com.everyday.retail.entities.Electronics;
import com.everyday.retail.entities.FoodItems;
import com.everyday.retail.entities.MaterialType;
import com.everyday.retail.entities.Product;
import com.everyday.retail.entities.SizeType;
import com.everyday.retail.entities.VegeterianType;

public class RetailApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product[] products=new Product[9];
		FoodItems foodItem=null;
		Apparel apparel=null;
		Electronics electronics=null;
		for(int i=0;i<products.length;i++) {
			foodItem=null;
			apparel=null;
			electronics=null;			
			if(i<3)
			{
				foodItem=new FoodItems();
				foodItem.setItemCode(new Random().nextInt(100));
				foodItem.setName("F"+i);
				foodItem.setQty(new Random().nextInt(10000));
				foodItem.setUnitPrice(new Random().nextInt(10000));
				foodItem.setDateOfManufacturing(LocalDate.now());
				foodItem.setDateOfExpiry(LocalDate.now().plusMonths(6));
				if(i%2==0) 
				 foodItem.setVegeterian(VegeterianType.YES);
				else
					foodItem.setVegeterian(VegeterianType.NO);
				products[i]=foodItem;
			}
			else if((i>=3)&&(i<6))
			{
				apparel=new Apparel();
				apparel.setItemCode(new Random().nextInt(100));
				apparel.setName("A"+i);
				apparel.setQty(new Random().nextInt(10000));
				apparel.setUnitPrice(new Random().nextInt(10000));
				if(i%2==0) {
				apparel.setSize(SizeType.Medium);
				apparel.setMaterialType(MaterialType.Cotton);
				}
				else
				{
					apparel.setSize(SizeType.Large);
					apparel.setMaterialType(MaterialType.Woolen);
				}
			
				products[i]=apparel;
			}
			else
			{
				electronics=new Electronics();
				electronics.setItemCode(new Random().nextInt(100));
				electronics.setName("E"+i);
				electronics.setQty(new Random().nextInt(10000));
				electronics.setUnitPrice(new Random().nextInt(10000));
				electronics.setWarranty((byte)new Random().nextInt(20));
				products[i]=electronics;
			}
			
		}
		
		
		ProductBL productBL=new ProductBLImpl(products.length);
		System.out.println(productBL.addProducts(products));
		
		Product[] results=productBL.getAllProducts();
		
		Arrays.sort(results,new ProductSorter());
		
		//pick by category
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Category");
		String category=scanner.nextLine();		
				
			switch(category) {
			case "FoodItems":
				for(Product p : results) {
					
					if(p instanceof FoodItems) {
						foodItem=(FoodItems) p;
						System.out.println(foodItem);
					}
				}
				break;
			case "Apparel":
				for(Product p : results) {
					
					if(p instanceof Apparel) {
						apparel=(Apparel) p;
						System.out.println(apparel);
					}
				}
				break;
				
			case "Electronics":
				for(Product p : results) {
					
					if(p instanceof Electronics) {
						electronics=(Electronics) p;
						System.out.println(electronics);
					}
				}
				break;
			}
		
		
		
	}

}
