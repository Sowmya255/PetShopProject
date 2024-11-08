package com.springboot.spring.petshopproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.spring.petshopproject.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {

}
