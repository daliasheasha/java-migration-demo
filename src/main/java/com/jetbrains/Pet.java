package com.jetbrains;

import javax.xml.bind.annotation.XmlSeeAlso;

@XmlSeeAlso({Dog.class, Cat.class})
public abstract class Pet {
    private String petName;
    private String color;

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
