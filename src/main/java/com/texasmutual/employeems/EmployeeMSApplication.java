package com.texasmutual.employeems;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.texasmutual.employeems.domain.User;
import com.texasmutual.employeems.repository.UserRepository;

@SpringBootApplication
public class EmployeeMSApplication{

	public static void main(String[] args) {
		SpringApplication.run(EmployeeMSApplication.class, args);
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
