public class Main {
    public static void main(String[] args) {
        Masina Skoda = new Combustie("Skoda", 10);
        Masina Audi = new Combustie("Audi", 15);
        Masina BMW = new Electrica("BMW", 9);
        Masina Dacia = new Electrica("Dacia", 14);
        People p1 = new Pasager("Bianca", 20);
        People p2 = new Pasager("Alina", 21);
        People p3 = new Pasager("Maria", 19);
        People p4 = new Pasager("Eliza", 23);
        People p5 = new Pasager("Iustina", 14);
        People s1 = new Sofer("Miruna", 27);
        People s2 = new Sofer("Alexandra", 29);
        Skoda.adaugaPasager(p1);
        Skoda.adaugaPasager(p3);
        Skoda.adaugaSofer(s1);
        Audi.adaugaPasager(p2);
        Audi.adaugaPasager(p4);
        Audi.adaugaPasager(p5);
        Audi.adaugaSofer(s2);
        BMW.adaugaPasager(p1);
        BMW.adaugaPasager(p3);
        BMW.adaugaPasager(p5);
        BMW.adaugaSofer(s2);
        Dacia.adaugaPasager(p2);
        Dacia.adaugaPasager(p5);
        Dacia.adaugaSofer(s1);
        BMW.info();
        BMW.Consum();
    }
}