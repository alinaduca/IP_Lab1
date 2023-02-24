public class Combustie extends Masina {
    @Override
    void Consum() {
        System.out.println("Masina este pe combustie si are urmatorul consum: " + super.consum);
    }
    Combustie(String name, int consum) {
        super(name, consum);
    }
    @Override
    public String info() {
        return super.info();
    }
}

