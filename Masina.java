package org.example;
import java.util.ArrayList;

public abstract class Masina {
    String name;
    ArrayList<Person> pasageri;
    Sofer sofer;
    Masina(String name) {
        this.pasageri = new ArrayList<>();
        this.name = name;
    }

    public abstract String getType();

    public void adaugaSofer(Sofer sofer) {
        this.sofer = sofer;
    }

    public Sofer getSofer() {
        return this.sofer;
    }

    public void adaugaPasager(Person pasager) {
        this.pasageri.add(pasager);
    }

    @Override
    public String toString() {
        String infos = this.name + " " + getType() + " fueled car driven by " + this.sofer + ", passengers:\n";
        for(Person p : pasageri) {
            infos += p + "\n";
        }
        return infos;
    }
}