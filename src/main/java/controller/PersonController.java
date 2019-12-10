package controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import service.PersonConverter;

@RestController
public class PersonController {


    @Autowired
    PersonConverter personConverter;

    public void convert() {
        personConverter.serializeXml();
    }
}
