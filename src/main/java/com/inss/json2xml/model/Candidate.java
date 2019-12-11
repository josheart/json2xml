package com.inss.json2xml.model;

import org.springframework.stereotype.Component;

@Component
public class Candidate {
    private String name;
    private int id;

    public String name(){
        return name;
    }

    public int id(){
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
