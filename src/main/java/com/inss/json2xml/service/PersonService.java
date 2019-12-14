package com.inss.json2xml.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.inss.json2xml.model.Candidate;
import com.inss.json2xml.model.Person;
import com.inss.json2xml.util.FileUtils;
import com.inss.json2xml.util.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonService {

    private final static String JSON_PATH = "src/main/resources/json/person.json";

    @Autowired
    private FileUtils fileUtils;

    @Autowired
    private  JsonUtils jsonUtils;


    public void deserializePersonAndPrint() {
        Class<?> person = jsonUtils.deserializeJson(fileUtils.fetchFile(JSON_PATH), Person.class);
        System.out.println(person.toString());
    }

    public void printHello() {
        Candidate candidate = new Candidate();
        System.out.println("Hello World");
        System.out.println("Hi World");
    }

    public void printJackson() throws JsonProcessingException {
        String json = "{\n" +
                "  \"firstName\" : \"Cesur\",\n" +
                "  \"lastName\"  : \"Ercan\",\n" +
                "  \"age\"       : \"35\"\n" +
                "}";

        Person person = jsonUtils.deserWIthJackson(json, Person.class);
        System.out.println(person.toString());
    }
}
