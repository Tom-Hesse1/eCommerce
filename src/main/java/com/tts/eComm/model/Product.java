package com.tts.eComm.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.PositiveOrZero;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "product_id")
	private Long id;
	
	@NotBlank(message = "Product name cannot be blank") //what is being sold?
	private String name;

	@PositiveOrZero(message = "Product wholesale price cannot be negative") //but is zero really ok?
	private Double wholesalePrice;

	@PositiveOrZero(message = "Product retail price cannot be negative") //but is zero really ok?
	private Double retailPrice;

	@NotBlank(message = "Product brand cannot be blank") //somebody made it, right?
	private String brand;

	@NotBlank(message = "Product category cannot be blank")
	private String category;

	private String description; //is it ok to create a product and add a description later? or not?
	private Integer inventory; //negative inventory doesn't really make sense, can't sell it if it isn't there 

	private String image; //is it ok to create a product and add an image file path later? or not?

	@CreationTimestamp
	private Date createdAt;

	@UpdateTimestamp
	private Date updatedAt;

}
