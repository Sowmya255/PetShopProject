package com.springboot.spring.petshopproject;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.springboot.spring.petshopproject.Controller.GroomingServiceController;
import com.springboot.spring.petshopproject.entity.GroomingService;
import com.springboot.spring.petshopproject.service.GroomingServiceService;
public class GroomingServiceControllerTest {
	
		    @InjectMocks
		    private GroomingServiceController groomingServiceController;

		    @Mock
		    private GroomingServiceService groomingServiceService;

		    public GroomingServiceControllerTest() {
		        MockitoAnnotations.openMocks(this);
		    }

		    @Test
		    public void testGetAllGroomingServices() {
		        // Arrange
		        List<GroomingService> mockServices = Collections.emptyList();
		        when(groomingServiceService.getAllGroomingServices()).thenReturn(mockServices);

		        // Act
		        List<GroomingService> result = groomingServiceController.getAllGroomingServices();

		        // Assert
		        assertEquals(mockServices, result);
		    }

		    @Test
		    public void testGetGroomingServiceById() throws Exception {
		        // Arrange
		        int serviceId = 1;
		        GroomingService mockService = new GroomingService();
		        when(groomingServiceService.getGroomingServiceById(serviceId)).thenReturn(mockService);

		        // Act
		        GroomingService result = groomingServiceController.getGroomingServiceById(serviceId);

		        // Assert
		        assertEquals(mockService, result);
		    }

		    @Test
		    public void testGetAvailableGroomingServices() {
		        // Arrange
		        List<GroomingService> availableServices = Collections.emptyList();
		        when(groomingServiceService.getAvailableGroomingServices()).thenReturn(availableServices);

		        // Act
		        List<GroomingService> result = groomingServiceController.getAvailableGroomingServices();

		        // Assert
		        assertEquals(availableServices, result);
		    }

		    @Test
		    public void testGetUnavailableGroomingServices() {
		        // Arrange
		        List<GroomingService> unavailableServices = Collections.emptyList();
		        when(groomingServiceService.getUnavailableGroomingServices()).thenReturn(unavailableServices);

		        // Act
		        List<GroomingService> result = groomingServiceController.getUnavailableGroomingServices();

		        // Assert
		        assertEquals(unavailableServices, result);
		    }
		}

