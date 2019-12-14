package com.inss.json2xml.controller;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.inss.json2xml.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import com.inss.json2xml.service.CandidateService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PersonController {

    @Autowired
    PersonService personService;

    @Autowired
    CandidateService candidateService;

    public void convert() {
        personService.printHello();
        candidateService.printCandidateName();
        try {
            personService.printJackson();
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("/hello")
    public ModelAndView printHello() {
        ModelAndView modelAndView = new ModelAndView("hello world");
        modelAndView.addObject("name", "World");
        return modelAndView;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {

        model.addAttribute("message", "Spring 3 MVC Hello World");
        return "hello";

    }

    @RequestMapping(value = "/hello/{name:.+}", method = RequestMethod.GET)
    public ModelAndView hello(@PathVariable("name") String name) {

        ModelAndView model = new ModelAndView();
        model.setViewName("hello");
        model.addObject("msg", name);

        return model;

    }

}
