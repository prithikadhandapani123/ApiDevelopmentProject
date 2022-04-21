package com.cap.api.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cap.api.model.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer> {

	Car findByCarName(String userName);

}
