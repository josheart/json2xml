package com.inss.json2xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Json2xmlApplication {

    private static PersonController personController;

    @Autowired
    public Json2xmlApplication(PersonController personController) {
        Json2xmlApplication.personController = personController;
    }
	public static void main(String[] args) {
		SpringApplication.run(Json2xmlApplication.class, args);
        personController.convert();
	}

}
