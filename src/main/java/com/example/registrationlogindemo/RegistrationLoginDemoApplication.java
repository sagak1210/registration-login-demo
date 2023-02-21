package com.example.registrationlogindemo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.logger.Baselog;


@SpringBootApplication
public class RegistrationLoginDemoApplication extends Baselog {
	
	public static void main(String[] args) { //program starts here 
		System.out.println("Running from main program");
		SpringApplication.run(RegistrationLoginDemoApplication.class, args);
		
	}

}
