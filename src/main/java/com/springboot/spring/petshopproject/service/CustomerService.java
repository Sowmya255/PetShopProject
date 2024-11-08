package com.springboot.spring.petshopproject.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.spring.petshopproject.dao.CustomerDao;
import com.springboot.spring.petshopproject.entity.Customer;
@Service
public class CustomerService {

		    @Autowired
		    private CustomerDao customerDao;

		    public Customer updateCustomer(int customerId, Customer customerDetails) throws ResourceNotFoundException {
		        Customer customer = customerDao.findById(customerId)
		                .orElseThrow(() -> new ResourceNotFoundException("Customer not found with ID: " + customerId));

		        customer.setFirstName(customerDetails.getFirstName());
		        customer.setLastName(customerDetails.getLastName());
		        customer.setEmail(customerDetails.getEmail());
		        customer.setPhoneNumber(customerDetails.getPhoneNumber());
		        customer.setAddress(customerDetails.getAddress());

		        return customerDao.save(customer);
		    }
		}

