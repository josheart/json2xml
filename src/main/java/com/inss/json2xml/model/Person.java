package com.inss.json2xml.model;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }


    public Person() {
    }



    @Override
    public String toString() {
        return "Person{" +
                "first='" + this.firstName + '\'' +
                ", last='" + this.lastName + '\'' +
                ", age='" + this.age + '\'' +
                '}';
    }
}
