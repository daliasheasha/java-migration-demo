package com.jetbrains;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;

public class MyApp {
    public static void main(String[] args) {
        String personXML =
                "<person>" +
                "    <name>Dalia</name>" +
                "    <dog>" +
                "        <color>Black</color>" +
                "        <petName>Lucy</petName>" +
                "    </dog>" +
                "</person>";

        Person personObject = convertXMLToObject(personXML);
        if (personObject != null) {
            Pet pet = personObject.getPet();
            if (pet instanceof Dog) {
                Dog dog = (Dog) pet;
                dog.bark();
            } else if (pet instanceof Cat) {
                Cat cat = (Cat) pet;
                cat.meow();
            }
        }

        System.out.println(personObject.getPet().getColor()); //check NPE
    }

    public static Person convertXMLToObject(String xmlString) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Person.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

            StringReader reader = new StringReader(xmlString);
            return (Person) jaxbUnmarshaller.unmarshal(reader);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }
}
