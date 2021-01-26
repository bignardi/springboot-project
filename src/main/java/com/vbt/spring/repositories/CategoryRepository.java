package com.vbt.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vbt.spring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

	
}
