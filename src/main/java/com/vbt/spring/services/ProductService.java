package com.vbt.spring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vbt.spring.entities.Product;
import com.vbt.spring.repositories.ProductRepository;

@Service // Registro da classe no mecânismo de injeção de dependência
public class ProductService {

	@Autowired // Injeção de dependência
	private ProductRepository repository;

	public List<Product> findAll() {
		return repository.findAll();
	}

	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
}
