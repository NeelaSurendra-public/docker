package io.neela.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {
	
	@GetMapping("docker")
	public String getDocket() {
		return " <h1>Inside the get docker method</h1> ";
	}
	
	@GetMapping("")
	public String showWelcome() {
		return " <h1>Welcome to port 8080</h1> ";
	}
}
