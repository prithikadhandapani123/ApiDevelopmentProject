package com.cap.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cap.api.model.Permission;
import com.cap.api.model.Roles;
import com.cap.api.model.User;
import com.cap.api.repo.RolesRepository;
import com.cap.api.repo.UserRepository;

@SpringBootApplication
public class APIApplication implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private RolesRepository rolesrepo;

	public static void main(String[] args) {
		SpringApplication.run(APIApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	     User user = new User( 7, "Sasirekha","{bcrypt}$2y$12$946HuJr2jwqLLe5wqwJBJeupc.TS/3MdUFXDnqGpbVh8VfW5T6dZW","admin","sasi","rekha","sasirekha","sasi@1");
		
	     Roles role = new Roles(4, "ADMIN","Admin is main role in organization","true");
	     Roles role2 = new Roles(5, "MANAGER","Manager is second main role in organization","true");
	     Roles role3 = new Roles(6, "Employee","Employee is important role in organization","true");
	     
	     user.getListofroles().add(role);
	     user.getListofroles().add(role2);
	     user.getListofroles().add(role3);
	     
	     this.userRepo.save(user);
	}
	
	}
	
	


