package lesson_23.homeWork22_2;

abstract public class Vahicle {

    private final long id;

    private static long idCounter;

    private Engine engine;


    public Vahicle() {
        this.id = idCounter++;

    }


    abstract public void startEngine();





    public long getId() {
        return id;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}

