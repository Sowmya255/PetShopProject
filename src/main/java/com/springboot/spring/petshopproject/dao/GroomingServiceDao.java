package com.springboot.spring.petshopproject.dao;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springboot.spring.petshopproject.entity.GroomingService;
import com.springboot.spring.petshopproject.repository.GroomingServiceRepository;
@Repository
public class GroomingServiceDao {

		    @Autowired
		    private GroomingServiceRepository groomingServiceRepository;

		    public List<GroomingService> findAll() {
		        return groomingServiceRepository.findAll();
		    }

		    public GroomingService findById(int serviceId) {
		        return groomingServiceRepository.findById(serviceId).orElse(null);
		    }

		    public List<GroomingService> findAvailableServices() {
		        return groomingServiceRepository.findByAvailable(true);
		    }

		    public List<GroomingService> findUnavailableServices() {
		        return groomingServiceRepository.findByAvailable(false);
		    }
}
