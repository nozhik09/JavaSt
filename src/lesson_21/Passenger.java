package lesson_21;

public class Passenger {

    private static int countrId;
    private final int id;
    private String name;

    public Passenger(String name) {
        this.name = name;
        this.id=++countrId;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
