package com.jetbrains;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "dog")
public class Dog extends Pet {
    public void bark() {
        System.out.println("Woof Woof");
    }
}
