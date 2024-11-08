package com.springboot.spring.petshopproject.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.spring.petshopproject.entity.Address;
import com.springboot.spring.petshopproject.service.AddressService;
import com.springboot.spring.petshopproject.service.ResourceNotFoundException;
import com.springboot.spring.petshopproject.service.ResponseMessage;



@RestController
@RequestMapping("/api/v1/address")
public class AddressController {

			@Autowired
		    private  AddressService addressService;


		    @GetMapping
		    public List<Address> getAllAddresses() {
		        return addressService.getAllAddresses();
		    }

		    @GetMapping("/{addressId}")
		    public Address getAddressById(@PathVariable Integer addressId) throws ResourceNotFoundException {
		        return addressService.getAddressById(addressId);
		    }

		    @PostMapping("/add")
		    public ResponseMessage addNewAddress(@RequestBody Address address) {
		        return addressService.addNewAddress(address);
		    }

		    @PutMapping("/update/{addressId}")
		    public ResponseMessage updateAddress(@PathVariable Integer addressId, @RequestBody Address address) throws ResourceNotFoundException {
		        return addressService.updateAddress(addressId, address);
		    }
		}

