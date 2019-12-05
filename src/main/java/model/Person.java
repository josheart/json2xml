package model;

import javax.json.bind.annotation.JsonbProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Person {

    @XmlElement(name = "firstName")
    @JsonbProperty(value = "firstName")
    private String first;
    @JsonbProperty(value = "lastName")
    @XmlElement(name = "lastName")
    private String last;
    @JsonbProperty(value = "age")
    @XmlElement(name = "age")
    private String age;

    public Person() {
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "first='" + first + '\'' +
                ", last='" + last + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
