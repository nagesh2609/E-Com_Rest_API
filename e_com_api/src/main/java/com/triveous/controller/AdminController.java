package com.triveous.controller;

import java.util.List;

import javax.validation.Valid;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.triveous.exception.AddressException;
import com.triveous.exception.CustomerException;
import com.triveous.exception.ProductException;
import com.triveous.model.Address;
import com.triveous.model.Customer;
import com.triveous.model.Product;
import com.triveous.service.AddressService;
import com.triveous.service.CustomerService;
import com.triveous.service.ProductService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/admin")
public class AdminController {

	
	
	
	@Autowired
	private CustomerService ses;
	
	@Autowired
	private AddressService ads;
	
	@Autowired
	private ProductService prode;
	
	@GetMapping("/getalladd")
	public ResponseEntity<List<Address>> viewalladd() throws AddressException
	{
		List<Address> exist = ads.viewAlladdress();
		
		return new ResponseEntity<List<Address>>(exist, HttpStatus.OK);
	}
	
	
	
	@GetMapping("/custmerwithid{cusid}")
	public ResponseEntity<Customer> getCustomerwithiid(@PathVariable("cusid") Integer customerId) throws CustomerException{
		
		Customer s  = ses.viemCustomer(customerId);
		
		return new ResponseEntity<Customer>(s, HttpStatus.OK);
	}
	
	
	@GetMapping("/addresswithid{id}")
	public ResponseEntity<Address> adreswtihid(@PathVariable("id") Integer addresId) throws AddressException
	{
		Address s = ads.viewAddress(addresId);
		
		return new ResponseEntity<Address>(s,HttpStatus.OK);
	}
	
	@PostMapping("/addproduct")
	public ResponseEntity<Product> addproductHandler(@Valid @RequestBody Product prod) throws ProductException
	{
		   Product s = prode.addProduct(prod);
		   
		   return new ResponseEntity<Product>(s, HttpStatus.OK);
	}
	
	
	@GetMapping("/allproduct")
	public ResponseEntity<List<Product>> getallprod()throws ProductException
	{
		List<Product> allpr = prode.viewAllproduct();
		
		return new ResponseEntity<List<Product>>(allpr,HttpStatus.OK);
	}
	
	@DeleteMapping("/p/{pid}")
	public ResponseEntity<Product> deletProdouct(@PathVariable("pid")Integer pr) throws ProductException
	{
		Product s = prode.removeProduct(pr);
		
		return new ResponseEntity<Product>(s, HttpStatus.OK);
	}
	
	
	
}
