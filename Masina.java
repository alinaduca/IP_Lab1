import java.util.ArrayList;

public abstract class Masina {
    String name;
    int consum;
    ArrayList<People> pasageri = new ArrayList<>();
    People sofer = new Sofer("", 0);
    Masina(String name, int consum) {
        this.name = name;
        this.consum = consum;
    }
    abstract void Consum();
    void adaugaSofer(People sofer) {
        this.sofer = sofer;
    }
    void adaugaPasager(People pasager) {
        pasageri.add(pasager);
    }
    public String info() {
        String infos = "";
        for(People p : pasageri) {
            System.out.println(p.infoPeople());
            infos = infos + p.infoPeople() + "\n";
        }
        return infos;
    }
}
