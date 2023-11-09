package com.triveous.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.triveous.dto.ProductDto;

public interface ProductDtoDao extends JpaRepository<ProductDto, Integer> {

	
	
}
