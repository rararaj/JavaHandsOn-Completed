package com.texasmutual.interview.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;


@RestController
public class ChuckNorrisController {
	
	final static String chuckNorriesJokesUri = "https://api.chucknorris.io/jokes/random?category=movie";
	
	
	@GetMapping("/chucknorrisfacts")
	public String getChuckNorrisFacts() {
		WebClient webClient = WebClient.create("https://api.chucknorris.io");
	    
	    Mono<String> response = (Mono<String>) webClient.get()
	    						.uri("/jokes/random?category=movie")
	    						.retrieve()
	    						.bodyToMono(String.class);
	    
	    return response.block();
	}
}
