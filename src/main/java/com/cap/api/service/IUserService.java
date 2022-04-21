package com.cap.api.service;

import java.util.List;
import java.util.Optional;

import com.cap.api.model.User;

public interface IUserService {

	
	public List<User> findAllUsers() ;

	public Optional<User> findUserById(int id);
	
	public User findByUserName(String userName) ;

}
