package com.triveous.service;

import java.util.List;

import com.triveous.exception.ProductException;
import com.triveous.model.Product;

public interface  ProductService {

	
	public Product addProduct(Product product) throws ProductException;
	public List<Product> viewAllproduct() throws ProductException;
	
	public Product updateProduct(Product product) throws ProductException;
	
	public Product viewProduct(Integer id) throws ProductException;
	
	public List<Product> viewProudctbyCategory(String cname) throws ProductException;
	
	
	public Product removeProduct(Integer pid) throws ProductException;
	
	
	
}
