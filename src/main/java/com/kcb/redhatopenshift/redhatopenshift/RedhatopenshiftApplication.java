package com.kcb.redhatopenshift.redhatopenshift;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RedhatopenshiftApplication {

	@GetMapping("/")
	public String welcome() {
		return "Welcome to Openshift World";
	}
	@GetMapping("/{input}")
	public String welcomeGreetings(@PathVariable String input) {
		return "Hello "+input+" it is intresting...no ? ";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(RedhatopenshiftApplication.class, args);
	}

}
