package com.springboot.spring.petshopproject.entity;

import java.time.LocalDate;


import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "transactions")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transaction {

		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "transaction_id")
	    private int transactionId;

	    @ManyToOne
	    @JoinColumn(name = "customer_id")
	    @JsonIgnore
	    private Customer customer;

	    @ManyToOne
	    @JoinColumn(name = "pet_id")
	    @JsonIgnore
	    private Pet pet;

	    @Column(name = "transaction_date")
	    private LocalDate transactionDate;

	    private double amount;

	    @Column(name = "transaction_status")
	    private TransactionStatus transactionStatus;
	}
