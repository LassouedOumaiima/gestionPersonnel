package com.gestionPersonnel.service;

import com.gestionPersonnel.model.User;

public interface UserService {
	
	public User add(User user);
	
	public User getUserByEmailAndPassword(String email, String password);


}
