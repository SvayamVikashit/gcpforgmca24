package com.gcp.practical.datetime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class DateTimeApplication {

	public static void main(String[] args) {
		SpringApplication.run(DateTimeApplication.class, args);
	}

	 

	@GetMapping("/now")
	public String now() {
		return java.time.LocalDateTime.now();
	}

}
