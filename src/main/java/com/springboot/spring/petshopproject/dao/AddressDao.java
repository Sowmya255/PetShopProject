package com.springboot.spring.petshopproject.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.springboot.spring.petshopproject.entity.Address;
import com.springboot.spring.petshopproject.repository.AddressRepository;

@Repository
public class AddressDao {

	
			@Autowired
		    private  AddressRepository addressRepository;


		    public List<Address> findAll() {
		        return addressRepository.findAll();
		    }

		    public Optional<Address> findById(Integer addressId) {
		        return addressRepository.findById(addressId);
		    }

		    public Address save(Address address) {
		        return addressRepository.save(address);
		    }

	}
