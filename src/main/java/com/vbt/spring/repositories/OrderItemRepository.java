package com.vbt.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vbt.spring.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

	
}
