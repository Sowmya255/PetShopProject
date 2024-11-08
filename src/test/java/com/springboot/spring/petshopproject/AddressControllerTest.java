package com.springboot.spring.petshopproject;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.springboot.spring.petshopproject.Controller.AddressController;
import com.springboot.spring.petshopproject.entity.Address;
import com.springboot.spring.petshopproject.service.AddressService;
import com.springboot.spring.petshopproject.service.ResponseMessage;

public class AddressControllerTest {
			
			    @InjectMocks
			    private AddressController addressController;

			    @Mock
			    private AddressService addressService;

			    public AddressControllerTest() {
			        MockitoAnnotations.openMocks(this);
			    }

			    @Test
			    public void testGetAllAddresses() {
			        // Arrange
			        List<Address> mockAddresses = Collections.emptyList();
			        when(addressService.getAllAddresses()).thenReturn(mockAddresses);

			        // Act
			        List<Address> result = addressController.getAllAddresses();

			        // Assert
			        assertEquals(mockAddresses, result);
			    }

			    @Test
			    public void testGetAddressById() throws Exception {
			        // Arrange
			        int addressId = 1;
			        Address mockAddress = new Address();  // Empty Address instance
			        when(addressService.getAddressById(addressId)).thenReturn(mockAddress);

			        // Act
			        Address result = addressController.getAddressById(addressId);

			        // Assert
			        assertEquals(mockAddress, result);
			    }

			    @Test
			    public void testAddNewAddress() {
			        // Arrange
			        Address newAddress = new Address();
			        when(addressService.addNewAddress(newAddress)).thenReturn(new ResponseMessage("Address successfully added."));

			        // Act
			        ResponseMessage result = addressController.addNewAddress(newAddress);

			        // Assert
			        assertEquals("Address successfully added.", result.getMessage());
			    }

			    @Test
			    public void testUpdateAddress() throws Exception {
			        // Arrange
			        int addressId = 1;
			        Address updatedAddress = new Address();
			        when(addressService.updateAddress(addressId, updatedAddress)).thenReturn(new ResponseMessage("Address successfully updated."));

			        // Act
			        ResponseMessage result = addressController.updateAddress(addressId, updatedAddress);

			        // Assert
			        assertEquals("Address successfully updated.", result.getMessage());
			    }
			}

