package com.vbt.spring.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.vbt.spring.entities.User;
import com.vbt.spring.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired // Injeção de Dependência automática
	private UserRepository userRepository;

	// Será executado tudo o que estiver neste método, assim que a aplicação for iniciada
	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		// Passando a list de objetos para inserção no banco de dados
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
}
