package com.vbt.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vbt.spring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	
}
