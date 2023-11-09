package com.triveous.service;

import java.util.List;

import javax.security.auth.login.LoginException;

import com.triveous.exception.AddressException;
import com.triveous.model.Address;

public interface AddressService {

	
	
	public Address addAddress(Address add , String key) throws AddressException, LoginException;
	
	public Address updateAddress(Address add, String key) throws AddressException , LoginException;
	
	public String removeAddress(Integer addressId,String key) throws AddressException, LoginException;
	
	public List<Address> viewAlladdress();
	
	public Address viewAddress(Integer id) throws AddressException;
	
}
