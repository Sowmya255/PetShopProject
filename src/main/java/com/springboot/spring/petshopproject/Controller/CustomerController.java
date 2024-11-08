package com.springboot.spring.petshopproject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.spring.petshopproject.entity.Customer;
import com.springboot.spring.petshopproject.service.CustomerService;
import com.springboot.spring.petshopproject.service.ResourceNotFoundException;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {
	
		    @Autowired
		    private CustomerService customerService;

		    @PutMapping("/update/{customer_id}")
		    public Customer updateCustomer(@PathVariable("customer_id") Integer customerId, 
		           @RequestBody Customer customerDetails) throws ResourceNotFoundException {
		        return customerService.updateCustomer(customerId, customerDetails);
		    }
		}

