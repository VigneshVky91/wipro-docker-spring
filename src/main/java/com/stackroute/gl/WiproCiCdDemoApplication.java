package com.stackroute.gl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WiproCiCdDemoApplication {

	@GetMapping("/message")
	public String sayHello() {
		return "Hello world...";
	}

	public static void main(String[] args) {
		SpringApplication.run(WiproCiCdDemoApplication.class, args);
	}

}
