package com.vbt.spring.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vbt.spring.entities.Order;
import com.vbt.spring.services.OrderService;

@RestController // Controlador Rest
@RequestMapping(value = "/orders") // Nome do recurso relacionado a entidade Order
public class OrderResource {
	
	@Autowired // Injeção de dependência
	private OrderService service;
	
	@GetMapping
	public ResponseEntity<List<Order>> findAll() {
		List<Order> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}") // Requisição do tipo GET
	public ResponseEntity<Order> findById(@PathVariable Long id) {
		Order obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
