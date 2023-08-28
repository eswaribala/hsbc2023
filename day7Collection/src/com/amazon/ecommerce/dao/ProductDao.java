package com.amazon.ecommerce.dao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import com.amazon.ecommerce.models.Product;

public interface ProductDao {

	boolean addProducts(List<Product> products) throws FileNotFoundException, IOException;
    List<Product> getProducts() throws ClassNotFoundException,
    FileNotFoundException, IOException; 
}
