package com.vbt.spring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vbt.spring.entities.Category;
import com.vbt.spring.repositories.CategoryRepository;

@Service // Registro da classe no mecânismo de injeção de dependência
public class CategoryService {
	
	@Autowired // Injeção de dependência
	private CategoryRepository repository;
	
	public List<Category> findAll() {
		return repository.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
}
