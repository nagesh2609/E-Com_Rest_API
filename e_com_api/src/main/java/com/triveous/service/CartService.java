package com.triveous.service;

import java.util.List;

import javax.security.auth.login.LoginException;

import com.triveous.dto.ProductDto;
import com.triveous.exception.CartException;
import com.triveous.exception.ProductException;
import com.triveous.model.Cart;

public interface CartService {

	
	
	public Cart addProductToCart(Integer productId, Integer quantity, String key) throws CartException,LoginException,ProductException;
	
	
	public List<ProductDto> removeProductfromCart(Integer productId, String key) throws CartException,LoginException,ProductException;
	
	
	public List<ProductDto> updateProductQuantity(Integer productId, Integer quantity, String key)throws CartException,LoginException,ProductException;
	
	
	
	public Cart removeAllproduct(String key) throws CartException,LoginException;
	
	public List<ProductDto> viewAllProducts(String key) throws CartException,LoginException;
	
	
	
}
