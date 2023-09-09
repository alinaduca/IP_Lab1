package org.example;

public class Main {
    public static void main(String[] args) {
        Masina bmw = new Combustie("BMW");
        bmw.adaugaPasager(new Sofer("Alexandra",29));
        bmw.adaugaPasager(new Pasager("Bianca",20));
        bmw.adaugaPasager(new Pasager("Alina",21));
        bmw.adaugaPasager(new Pasager("Andreea",21));

        Masina tesla = new Electrica("Tesla");
        tesla.adaugaPasager(new Sofer("Miruna",20));
        tesla.adaugaPasager(new Pasager("Emilia",23));
        tesla.adaugaPasager(new Pasager("Catalina",24));
        tesla.adaugaPasager(new Pasager("Ecaterina",20));

        System.out.println(bmw);
        System.out.println(tesla);
    }
}