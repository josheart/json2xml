package util;

import model.Person;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class Converter {

    public static void main(String[] args) throws IOException, JAXBException {
        Jsonb jsonb = JsonbBuilder.create();

        Person person;
        try(InputStream inputStream = new FileInputStream("src/main/resources/json/person.json")) {
            person = jsonb.fromJson(inputStream, Person.class);
        }
        JAXBContext context = JAXBContext.newInstance(Person.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(person, new FileOutputStream("src/main/resources/xml/person.xml"));
    }
}
