package com.inss.json2xml;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import service.CandidateService;

@Component
public class PersonController {


    @Autowired
    PersonConverter personConverter;
    @Autowired
    CandidateService candidateService;

    public void convert() {
        personConverter.serializeXml();
        candidateService.printCandidateName();
    }
}
