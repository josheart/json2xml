package util;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.FileOutputStream;
import java.io.IOException;

public class XmlUtils {

    public static void serializeToXml(Class<?> T, Object object, String filePath) {

        JAXBContext context = null;
        try {
            context = JAXBContext.newInstance(T);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(object, new FileOutputStream(filePath));
        } catch (JAXBException | IOException e) {
            e.printStackTrace();
        }
    }

}
