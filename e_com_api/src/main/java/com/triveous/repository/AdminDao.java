package com.triveous.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.triveous.model.Admin;
import com.triveous.model.Customer;

public interface AdminDao  extends JpaRepository<Admin, Integer>{
	
	public Admin findByemail(String email);

}