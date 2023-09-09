package org.example;

public class Sofer extends Person {
    Sofer(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Sofer: " + this.name + ", " + this.age + " ani";
    }
}
