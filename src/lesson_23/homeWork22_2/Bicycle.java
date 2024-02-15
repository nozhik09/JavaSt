package lesson_23.homeWork22_2;

public class Bicycle extends Vahicle {


    public String toString() {
        return "Bicycle {id: " + getId() + "; engine: Двигателя нет " + "}";


    }

    @Override
    public void startEngine() {
        System.out.println("Двигателя нет");
    }
}
