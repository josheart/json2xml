package com.inss.json2xml;

import controller.PersonController;
import model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import service.PersonConverter;

@SpringBootApplication
public class Json2xmlApplication {

	public static void main(String[] args) {
		SpringApplication.run(Json2xmlApplication.class, args);
//        PersonController personController = new PersonController();
//        personController.convert();
	}

}
