package com.vbt.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vbt.spring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
