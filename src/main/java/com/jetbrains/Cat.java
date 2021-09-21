package com.jetbrains;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "cat")
public class Cat extends Pet{
    public void meow() {
        System.out.println("Meeeeeoooooow");
    }
}
