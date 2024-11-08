package com.springboot.spring.petshopproject.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="grooming_services")
@Data 
@AllArgsConstructor
@NoArgsConstructor
public class GroomingService {
	
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "service_id")
	    private int serviceId;

	    private String name;
	    private String description;
	    private double price;
	    private boolean available = true;

	    @ManyToMany(mappedBy = "groomingServices", fetch = FetchType.EAGER)
	    @JsonIgnore
	    private List<Pet> pets;


	}

