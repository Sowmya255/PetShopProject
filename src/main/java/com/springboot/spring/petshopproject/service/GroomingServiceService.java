package com.springboot.spring.petshopproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.spring.petshopproject.dao.GroomingServiceDao;
import com.springboot.spring.petshopproject.entity.GroomingService;

@Service
public class GroomingServiceService {

		    @Autowired
		    private GroomingServiceDao groomingServiceDao;

		    public List<GroomingService> getAllGroomingServices() {
		        return groomingServiceDao.findAll();
		    }

		    public GroomingService getGroomingServiceById(int serviceId) throws ResourceNotFoundException {
		    	    GroomingService service = groomingServiceDao.findById(serviceId);
		    	    if (service == null) {
		    	        throw new ResourceNotFoundException("Grooming service not found with ID: " + serviceId);
		    	    }
		    	    return service;
		    	}

		    public List<GroomingService> getAvailableGroomingServices() {
		        return groomingServiceDao.findAvailableServices();
		    }

		    public List<GroomingService> getUnavailableGroomingServices() {
		        return groomingServiceDao.findUnavailableServices();
		    }
		}

