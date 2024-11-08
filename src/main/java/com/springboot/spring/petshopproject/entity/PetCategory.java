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
@Table(name="pet_categories")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class PetCategory {
			
			@Id
		    @GeneratedValue(strategy = GenerationType.IDENTITY)
		    @Column(name = "category_id")
		    private int categoryId;

		    private String name;

		    @OneToMany(mappedBy = "petCategory")
		    @JsonIgnore
		    private List<Pet> pets;
	}

