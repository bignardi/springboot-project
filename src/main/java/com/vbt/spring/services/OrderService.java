package com.vbt.spring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vbt.spring.entities.Order;
import com.vbt.spring.repositories.OrderRepository;

@Service // Registro da classe no mecânismo de injeção de dependência
public class OrderService {
	
	@Autowired // Injeção de dependência
	private OrderRepository repository;
	
	public List<Order> findAll() {
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
}
