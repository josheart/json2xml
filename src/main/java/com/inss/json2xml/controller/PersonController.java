package com.inss.json2xml.controller;


import com.inss.json2xml.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.inss.json2xml.service.CandidateService;
import org.springframework.stereotype.Controller;

@Controller
public class PersonController {


    @Autowired
    PersonService personService;

    @Autowired
    CandidateService candidateService;

    public void convert() {
        personService.printHello();
        candidateService.printCandidateName();
    }
}
