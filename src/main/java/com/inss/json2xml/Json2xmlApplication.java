package com.inss.json2xml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import service.PersonConverter;

//@SpringBootApplication
public class Json2xmlApplication {

	public static void main(String[] args) {
		SpringApplication.run(Json2xmlApplication.class, args);
		PersonConverter.serializeXml();
		
	}

}
