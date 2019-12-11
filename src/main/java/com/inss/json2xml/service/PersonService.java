package com.inss.json2xml.service;

import com.inss.json2xml.model.Candidate;
import com.inss.json2xml.model.Person;
import com.inss.json2xml.util.FileUtils;
import com.inss.json2xml.util.JsonUtils;
import com.inss.json2xml.util.XmlUtils;
import org.springframework.stereotype.Component;

@Component
public class PersonService {

    private final static String JSON_PATH = "src/main/resources/json/person.json";

    private FileUtils fileUtils = new FileUtils();
    private  JsonUtils jsonUtils = new JsonUtils();


    public Class<?> deserializePerson() {
        return jsonUtils.deserializeJson(fileUtils.fetchFile(JSON_PATH), Person.class);
    }

    public void printHello() {
        Candidate candidate = new Candidate();
        System.out.println("Hello World");
        System.out.println("Hi World");
    }


}
