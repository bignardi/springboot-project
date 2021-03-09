package com.vbt.spring.services.exceptions;

/**
 * Tratamento de exceção personalizado, quando o id do usuário não for encontrado, evita o erro 500.
 */

public class ResourceNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundException(Object id) {
		super("Resource not found. Id " + id);
	}

}
