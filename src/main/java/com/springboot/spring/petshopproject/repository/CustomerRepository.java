package com.springboot.spring.petshopproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.spring.petshopproject.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
