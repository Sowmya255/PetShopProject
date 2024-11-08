package com.springboot.spring.petshopproject.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "addresses")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {

		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "address_id") // Keeps the column name in the database as `address_id`
	    private int addressId;
	    private String street;
	    private String city;
	    private String state;

	    @Column(name = "zip_code") // Keeps the column name as `zip_code`
	    private String zipCode;

		@OneToMany(mappedBy = "address")
	    @JsonIgnore
	    private List<Customer> customers;
	    
	    @OneToMany(mappedBy = "address")
	    @JsonIgnore
	    private List<Supplier> suppliers;
	    
	    @OneToMany(mappedBy = "address")
	    @JsonIgnore
	    private List<Employee> employees;
	}

