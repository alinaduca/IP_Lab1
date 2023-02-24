public abstract class People {
    String nume;
    int age;
    People(String nume, int age) {
        this.nume = nume;
        this.age = age;
    }
    public String infoPeople() {
        return this.nume + " " + this.age + " ani";
    }
}
