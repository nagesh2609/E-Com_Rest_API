package com.triveous.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.triveous.exception.CustomerException;
import com.triveous.model.Customer;

public interface CustomerDao  extends JpaRepository<Customer, Integer>{

	
	public Customer findByemail(String email);
	public Optional<Customer> findBymobilenumber(String mobileNumber) throws CustomerException;
//	public List<Customer> findBycity(String location);
	
//	@Query("select from Customer where  city =?1")
//	public List<Customer> findBycity(String location);
	
	
	
}
