package com.corefortune.coreapi;

import org.apache.catalina.filters.AddDefaultCharsetFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CoreapiApplication {

	public static void main(String[] args) {


		SpringApplication.run(CoreapiApplication.class, args);
		

		//mSpringApplication.run(Helloworld.class, args);

	}
}
