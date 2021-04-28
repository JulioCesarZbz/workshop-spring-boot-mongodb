package com.nascimento.workshopmongo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.nascimento.workshopmongo.domain.User;
import com.nascimento.workshopmongo.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {

	//injetando UserRepository
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		//inicialmente vamos limpar a coleção
		userRepository.deleteAll();
		
		User maria = new User(null, "Maria Brown", "maria@gmail.com");
		User alex = new User(null, "Alex Green", "alex@gmail.com");
		User bob = new User(null, "Bob Grey", "bob@gmail.com");
		
		//salvando objetos na coleçao de usuários
		userRepository.saveAll(Arrays.asList(maria, alex, bob));
		
		
		
	}

}
