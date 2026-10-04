public class Person {

    private String name;
    private int geburtsjahr;

    public Person(String name, int geburtsjahr) {
        this.name = name;
        this.geburtsjahr = geburtsjahr;
    }

    public String getName() {
        return name;
    }

    public int getGeburtsjahr() {
        return geburtsjahr;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Geburtsjahr: " + geburtsjahr;
    }
}