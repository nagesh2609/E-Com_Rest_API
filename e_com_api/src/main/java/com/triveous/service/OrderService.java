package com.triveous.service;

import java.time.LocalDate;
import java.util.List;

import javax.security.auth.login.LoginException;

import com.triveous.exception.AddressException;
import com.triveous.exception.CartException;
import com.triveous.exception.OrderExcetion;
import com.triveous.model.Orders;
public interface OrderService {
	
	
	
	public  Orders addOrder(Orders order,String key) throws LoginException, CartException, OrderExcetion;
	
	public  Orders updateCustomer(Orders order,String key) throws LoginException, CartException, OrderExcetion;
	
	public  Orders removeOrder(Integer id,String key) throws LoginException, CartException, OrderExcetion;

	public  Orders viewOrder(Integer id) throws CartException, OrderExcetion;
	
	public List<Orders> viewallOrderByDate(LocalDate date) throws OrderExcetion;
	
	public List<Orders> orderbylocation(String city) throws OrderExcetion, AddressException;
	
	public List<Orders> viewallbyuserid(String userid) throws OrderExcetion;
}
