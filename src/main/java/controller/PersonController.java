package controller;


import org.springframework.beans.factory.annotation.Autowired;
import service.PersonConverter;

public class PersonController {

    @Autowired
    PersonConverter personConverter;

    public void convert() {
        personConverter.serializeXml();
    }
}
