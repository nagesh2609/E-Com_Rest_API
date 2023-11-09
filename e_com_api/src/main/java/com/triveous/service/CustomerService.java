package com.triveous.service;

import javax.security.auth.login.LoginException;

import com.triveous.exception.CustomerException;
import com.triveous.model.Customer;

public interface CustomerService {

	
	
	
	public Customer addCustomer(Customer customer) throws CustomerException;

	public Customer updateCust(Customer customer, String key) throws CustomerException, LoginException;
	
	public Customer removeCustomer(Customer customer,String key) throws CustomerException, LoginException;
	
	public Customer viemCustomer(Integer cusInteger) throws CustomerException;
	
//	public List<Customer> viewAll(String location) throws CustomerException;
	
	
}
