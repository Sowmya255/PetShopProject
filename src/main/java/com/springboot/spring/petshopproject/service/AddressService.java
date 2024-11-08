package com.springboot.spring.petshopproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.spring.petshopproject.dao.AddressDao;
import com.springboot.spring.petshopproject.entity.Address;

@Service
public class AddressService {
	
			@Autowired
		    private  AddressDao addressdao;

		    public List<Address> getAllAddresses() {
		        return addressdao.findAll();
		    }

		    public Address getAddressById(int addressId) throws ResourceNotFoundException {
		        return addressdao.findById(addressId).orElseThrow(()-> new ResourceNotFoundException("Address not found with "+addressId));
		    }

		    public ResponseMessage addNewAddress(Address address) {
		       addressdao.save(address);
		       return new ResponseMessage("Address successfully added.");
		    }

		    public ResponseMessage updateAddress(int addressId, Address addressDetails) throws ResourceNotFoundException {
		        Address address = addressdao.findById(addressId)
		                .orElseThrow(() -> new ResourceNotFoundException("Address not found"));

		        address.setStreet(addressDetails.getStreet());
		        address.setCity(addressDetails.getCity());
		        address.setState(addressDetails.getState());
		        address.setZipCode(addressDetails.getZipCode());

		         addressdao.save(address);
		         return new ResponseMessage("Address successfully updated.");
		    }
		}