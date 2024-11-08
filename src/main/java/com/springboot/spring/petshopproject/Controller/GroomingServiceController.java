package com.springboot.spring.petshopproject.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.spring.petshopproject.entity.GroomingService;
import com.springboot.spring.petshopproject.service.GroomingServiceService;
import com.springboot.spring.petshopproject.service.ResourceNotFoundException;

@RestController
@RequestMapping("/api/v1/grooming-services")
public class GroomingServiceController {

		    @Autowired
		    private GroomingServiceService groomingServiceService;

		    @GetMapping
		    public List<GroomingService> getAllGroomingServices() {
		        return groomingServiceService.getAllGroomingServices();
		    }

		    @GetMapping("/{serviceId}")
		    public GroomingService getGroomingServiceById(@PathVariable int serviceId) throws ResourceNotFoundException {
		        return groomingServiceService.getGroomingServiceById(serviceId);
		    }

		    @GetMapping("/available")
		    public List<GroomingService> getAvailableGroomingServices() {
		        return groomingServiceService.getAvailableGroomingServices();
		    }

		    @GetMapping("/unavailable")
		    public List<GroomingService> getUnavailableGroomingServices() {
		        return groomingServiceService.getUnavailableGroomingServices();
		    }
		}

