package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	// Optional<User> findByEmail(String email);

	User findByEmail(String userEmail);

	User findByUserName(String username);

}
