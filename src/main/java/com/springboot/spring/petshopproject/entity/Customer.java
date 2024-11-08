package com.springboot.spring.petshopproject.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "customers")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "customer_id") // Keeps the column name as `customer_id`
	    private int customerId;

	    @Column(name = "first_name") // Keeps the column name as `first_name`
	    private String firstName;

	    @Column(name = "last_name") // Keeps the column name as `last_name`
	    private String lastName;

	    private String email;

	    @Column(name = "phone_number") // Keeps the column name as `phone_number`
	    private String phoneNumber;

	    @ManyToOne
	    @JoinColumn(name = "address_id") // Keeps foreign key column name as `address_id`
	    @JsonIgnore
	    private Address address;

	    @OneToMany(mappedBy = "customer")
	    @JsonIgnore
	    private List<Transaction> transactions;
	}
			
