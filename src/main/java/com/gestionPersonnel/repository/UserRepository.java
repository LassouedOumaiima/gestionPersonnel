package com.gestionPersonnel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestionPersonnel.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	User findUserByEmailAndPassword(String email, String password);
	
	User findUserByEmail(String email);

}
