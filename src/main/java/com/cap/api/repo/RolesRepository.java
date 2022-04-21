package com.cap.api.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cap.api.model.Roles;

@Repository
public interface RolesRepository extends JpaRepository<Roles, Integer>{
	
	

}
