package com.springboot.spring.petshopproject.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "vaccinations")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vaccination {

		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "vaccination_id")
	    private int vaccinationId;

	    private String name;
	    private String description;
	    private double price;
	    private boolean available = true;

	    @ManyToMany(mappedBy = "vaccinations", fetch = FetchType.EAGER)
	    @JsonIgnore
	    private List<Pet> pets;
	}
			
