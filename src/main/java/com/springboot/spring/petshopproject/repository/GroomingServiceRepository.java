package com.springboot.spring.petshopproject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.spring.petshopproject.entity.GroomingService;

public interface GroomingServiceRepository extends JpaRepository<GroomingService, Integer> {
	List<GroomingService> findByAvailable(boolean available);
}
