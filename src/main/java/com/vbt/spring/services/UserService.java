package com.vbt.spring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.vbt.spring.entities.User;
import com.vbt.spring.repositories.UserRepository;
import com.vbt.spring.services.exceptions.DatabaseException;
import com.vbt.spring.services.exceptions.ResourceNotFoundException;

@Service // Registro da classe no mecânismo de injeção de dependência
public class UserService {
	
	@Autowired // Injeção de dependência
	private UserRepository repository;
	
	public List<User> findAll() {
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
	public User insert(User obj) {
		return repository.save(obj);
	}
	
	public void deleteById(Long id) {
		try {
			repository.deleteById(id);
			
		} catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(id);
			
		} catch	(DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage());
			
		}
	}
	
	public User update(Long id, User obj) {
		User entity = repository.getOne(id);
		updateData(entity, obj);
		return repository.save(entity);
	}

	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());	
	}
	
}
