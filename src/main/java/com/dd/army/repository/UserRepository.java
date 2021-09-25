package com.dd.army.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dd.army.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	User findByNameAndPass(String name, String pass);
	
}
