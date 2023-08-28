package com.amazon.ecommerce.dao;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ResourceBundle;

import com.amazon.ecommerce.models.Product;

public class ProductDaoImpl implements ProductDao{

	private File file;
	private ResourceBundle resourceBundle;
	private ObjectInputStream objectInputStream;
	private ObjectOutputStream objectOutputStream;
	
	public ProductDaoImpl() throws IOException {
		this.resourceBundle=ResourceBundle
				.getBundle("com/amazon/ecommerce"
						+ "/resources/file");
		String fileName=this.resourceBundle
				.getString("fileName");
		file=new File(fileName);
		if(!file.exists())
			file.createNewFile();
	}
	
	@Override
	public boolean addProducts(List<Product> products) 
			throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		this.objectOutputStream=new ObjectOutputStream(
				new FileOutputStream(file));
		Iterator<Product> itr=products.iterator();
		while(itr.hasNext()) {
			this.objectOutputStream.writeObject(itr.next());
		}
		this.objectOutputStream.close();
		
		
		return true;
	}

	@Override
	public List<Product> getProducts() throws  FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		ObjectInputStream objectInputStream=new 
				ObjectInputStream(new FileInputStream(file));
		Object obj=null;
		List<Product> products=new ArrayList<Product>();
		try {
		while((obj=objectInputStream.readObject())!=null) {
			products.add((Product) obj);
		}
		}
		catch(EOFException e) {
			//throw e;
		}
		objectInputStream.close();
		return products;
	}

}
