package com.vbt.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vbt.spring.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
}
