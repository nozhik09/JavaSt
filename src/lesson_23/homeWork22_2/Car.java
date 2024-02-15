package lesson_23.homeWork22_2;

public class Car extends Vahicle {


//    public Car(){
//
//        super();
//    }

    public Car(Engine engine) {
        super();
        this.setEngine(engine);
    }

    public String toString() {
        // TODO если двигателя нет - поменять вывод
        return "Car{ id: " + getId() + "; engine " + getEngine() + "}";

    }

    @Override
    public void startEngine() {
        if (getEngine() != null) {
            getEngine().start();
        }
    }
}
