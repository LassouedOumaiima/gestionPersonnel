package com.gestionPersonnel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestionPersonnel.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {

}
