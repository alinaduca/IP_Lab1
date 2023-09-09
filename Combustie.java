package org.example;

public class Combustie extends Masina {
    @Override
    public String getType() {
        return "combustion";
    }
    public Combustie(String nume) {
        super(nume);
    }
}