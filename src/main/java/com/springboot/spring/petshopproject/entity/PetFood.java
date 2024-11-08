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
@Table(name="pet_food")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PetFood {
		 	@Id
		    @GeneratedValue(strategy = GenerationType.IDENTITY)
		    @Column(name = "food_id")
		    private int foodId;

		    private String name;
		    private String brand;
		    private String type;
		    private int quantity;
		    private double price;

		    @ManyToMany(mappedBy = "petFoods", fetch = FetchType.EAGER)
		    @JsonIgnore
		    private List<Pet> pets;
	}
