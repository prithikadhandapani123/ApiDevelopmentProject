package com.cap.api.service;

import java.util.List;
import java.util.Optional;

import com.cap.api.model.Car;

public interface ICarService {

	
	public List<Car> findAllCars() ;

	public Optional<Car> findCarById(int id);
	
	public Car findByCarName(String CarName) ;

}
