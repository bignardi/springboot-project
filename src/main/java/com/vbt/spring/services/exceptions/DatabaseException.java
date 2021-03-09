package com.vbt.spring.services.exceptions;

/**
 * Tratamento de exceção personalizado do Springframework, erro ao deletar um usuário associado a algum pedido.
 */

public class DatabaseException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public DatabaseException(String msg) {
		super(msg);
	}
}
