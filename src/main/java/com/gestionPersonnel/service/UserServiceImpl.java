package com.gestionPersonnel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionPersonnel.model.User;
import com.gestionPersonnel.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User getUserByEmailAndPassword(String email, String password) {
		return userRepository.findUserByEmailAndPassword(email, password);
	}

	@Override
	public User add(User user) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
