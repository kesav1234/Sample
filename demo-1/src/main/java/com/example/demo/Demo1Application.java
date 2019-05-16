package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}
	/*
	 * @Bean protected CommandLineRunner init(final UserRepository userRepository) {
	 * 
	 * return args -> { User user = new User(); user.setUsername("admin");
	 * user.setPassword("admin"); user.setName("Administrator");
	 * user.setEmail("admin@javahelps.com"); userRepository.save(user);
	 * 
	 * }; }
	 */
}
