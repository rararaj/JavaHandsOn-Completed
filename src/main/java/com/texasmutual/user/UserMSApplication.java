package com.texasmutual.user;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.texasmutual.user.domain.User;
import com.texasmutual.user.repository.UserRepository;

@SpringBootApplication
public class UserMSApplication{

	public static void main(String[] args) {
		SpringApplication.run(UserMSApplication.class, args);
	}
	
	 @Bean
	CommandLineRunner init(UserRepository userRepository) {
        return args -> {
            Stream.of("John", "Robert", "Mike", "Jeff", "Danny").forEach(name -> {
                User user = new User();
                user.setName(name);
                user.setEmail(name + "@texasmutual.com");
                userRepository.save(user);
            });
            System.out.println("Following records are added to the H2 in memory database");
            userRepository.findAll().forEach(System.out::println);
        };
	 }

}
