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
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "pets")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pet {

		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "pet_id")
	    private int petId;

	    private String name;
	    private String breed;
	    private int age;
	    private double price;

	    @ManyToOne
	    @JoinColumn(name = "category_id")
	    private PetCategory petCategory;

	    private String description;

	    @Column(name = "image_url")
	    private String imageUrl;

	    @ManyToMany
	    @JoinTable(
	        name = "pet_grooming_relationship",
	        joinColumns = @JoinColumn(name = "pet_id"),
	        inverseJoinColumns = @JoinColumn(name = "service_id")
	    )
	    @JsonIgnore
	    private List<GroomingService> groomingServices;

	    @ManyToMany
	    @JoinTable(
	        name = "pet_vaccination_relationship",
	        joinColumns = @JoinColumn(name = "pet_id"),
	        inverseJoinColumns = @JoinColumn(name = "vaccination_id")
	    )
	    @JsonIgnore
	    private List<Vaccination> vaccinations;

	    @ManyToMany
	    @JoinTable(
	        name = "pet_food_relationship",
	        joinColumns = @JoinColumn(name = "pet_id"),
	        inverseJoinColumns = @JoinColumn(name = "food_id")
	    )
	    @JsonIgnore
	    private List<PetFood> petFoods;

	    @ManyToMany(mappedBy = "pets", fetch = FetchType.EAGER)
	    @JsonIgnore
	    private List<Employee> employees;

	    @ManyToOne
	    @JoinColumn(name = "supplier_id")
	    @JsonIgnore
	    private Supplier supplier;

	    @OneToMany(mappedBy = "pet")
	    @JsonIgnore
	    private List<Transaction> transactions;
	}

