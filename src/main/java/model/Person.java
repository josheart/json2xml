package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.json.bind.annotation.JsonbProperty;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    @JsonbProperty(value = "firstName")
    private String first;

    @JsonbProperty(value = "lastName")
    private String last;

    @JsonbProperty(value = "age")
    private String age;

    @Override
    public String toString() {
        return "Person{" +
                "first='" + first + '\'' +
                ", last='" + last + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
