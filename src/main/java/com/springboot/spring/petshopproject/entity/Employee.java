package com.springboot.spring.petshopproject.entity;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "employees")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "employee_id") // Keeps the column name as `employee_id`
	    private int employeeId;

	    @Column(name = "first_name") // Keeps the column name as `first_name`
	    private String firstName;

	    @Column(name = "last_name") // Keeps the column name as `last_name`
	    private String lastName;

	    private String position;

	    @Column(name = "hire_date") // Keeps the column name as `hire_date`
	    private LocalDate hireDate;

	    @Column(name = "phone_number") // Keeps the column name as `phone_number`
	    private String phoneNumber;

	    private String email;

	    @ManyToOne
	    @JoinColumn(name = "address_id") // Keeps foreign key column name as `address_id`
	    @JsonIgnore
	    private Address address;

	    @ManyToMany
	    @JoinTable(
	        name = "employee_pet_relationship",
	        joinColumns = @JoinColumn(name = "employee_id"), // Keeps join column name as `employee_id`
	        inverseJoinColumns = @JoinColumn(name = "pet_id") // Keeps inverse join column name as `pet_id`
	    )
	    @JsonIgnore
	    private List<Pet> pets;
	}
