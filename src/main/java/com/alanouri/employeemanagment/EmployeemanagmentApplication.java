package com.alanouri.employeemanagment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
@SpringBootApplication
public class EmployeemanagmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeemanagmentApplication.class, args);
	}

}
