package com.math.hola;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HolaApplication {

	public static void main(String[] args) {
		SpringApplication.run(HolaApplication.class, args);
                System.out.println("hola mundo");
	}

}
