package com.inss.json2xml;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
public class PersonController {


    @Autowired
    PersonConverter personConverter;

    @GetMapping
    public void convert() {
        personConverter.serializeXml();
    }
}
