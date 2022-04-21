package com.cap.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Resource")
public class Car {

	@Id
	@Column(name="car_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int carId;
	
	@Column(name="car_name")
	private String carName;
		
	@Column(name="price")
	private int price;
	
	@Column(name="brand")
	private String brand;
	
	@Column(name="owner")
	private String owner;
	
	@Column(name="description")
	private String description;
	
	@Column(name="active")
	private boolean active;
	
	
	public Car() {
		super();
	}


	public Car(int carId, String carName, int price, String brand, String owner, String description, boolean active ) {
		super();
		this.carId = carId;
		this.carName = carName;
		this.price = price;
		this.brand = brand;
		this.owner = owner;
		this.description= description;
		this.active= active;
	}



	public int getCarId() {
		return carId;
	}


	public void setCarId(int carId) {
		this.carId = carId;
	}


	public String getCarName() {
		return carName;
	}


	public void setCarName(String carName) {
		this.carName = carName;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getOwner() {
		return owner;
	}


	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public boolean isActive() {
		return active;
	}


	public void setActive(boolean active) {
		this.active = active;
	}


	

	
}
