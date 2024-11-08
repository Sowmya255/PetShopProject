package com.springboot.spring.petshopproject.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springboot.spring.petshopproject.entity.Customer;
import com.springboot.spring.petshopproject.repository.CustomerRepository;

@Repository
public class CustomerDao {

		    @Autowired
		    private CustomerRepository customerRepository;

		    public Optional<Customer> findById(Integer customerId) {
		        return customerRepository.findById(customerId);
		    }

		    public Customer save(Customer customer) {
		        return customerRepository.save(customer);
		    }
		}
