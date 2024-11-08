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
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "suppliers")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Supplier {

		 	@Id
		    @GeneratedValue(strategy = GenerationType.IDENTITY)
		    @Column(name = "supplier_id")
		    private int supplierId;

		    private String name;

		    @Column(name = "contact_person")
		    private String contactPerson;

		    @Column(name = "phone_number")
		    private String phoneNumber;

		    private String email;

		    @ManyToOne
		    @JoinColumn(name = "address_id")
		    @JsonIgnore
		    private Address address;

		    @OneToMany(mappedBy = "supplier", fetch = FetchType.EAGER)
		    @JsonIgnore
		    private List<Pet> pets;
		}

