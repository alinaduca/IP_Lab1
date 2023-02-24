public class Electrica extends Masina {
    @Override
    void Consum() {
        System.out.println("Masina este electrica si are urmatorul consum: " + super.consum);
    }
    Electrica(String name, int consum) {
        super(name, consum);
    }
    @Override
    public String info() {
        return super.info();
    }
}
