package service;

import model.Person;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import util.FileUtils;
import util.JsonUtils;
import util.XmlUtils;

import java.sql.SQLOutput;

@Service
public class PersonConverter {
//
//    private static FileUtils fileUtils = new FileUtils();
//    private static JsonUtils jsonUtils = new JsonUtils();
//    private final static String JSON_PATH = "src/main/resources/json/person.json";
//    private static XmlUtils xmlUtils = new XmlUtils();
//    private final static String XML_PATH = "src/main/resources/json/xml.json";


//    public Class<?>  deserializePerson() {
//        return jsonUtils.deserializeJson(fileUtils.fetchFile(JSON_PATH), Person.class);
//    }

    public void serializeXml() {
        //xmlUtils.serializeToXml(Person.class, deserializePerson(), XML_PATH);
        System.out.println("Hello World");
    }
}
