package org.example;

public class Electrica extends Masina {

    public Electrica(String name) {
        super(name);
    }

    @Override
    public String getType() {
        return "electric";
    }

}