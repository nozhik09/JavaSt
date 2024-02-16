package lesson_24.transport;

public class Ship extends Transport implements SwimmAble {
    public Ship(int capacity) {
        super(capacity);
    }

    @Override
    void takePassenger() {
        System.out.println("Корабль берет пассажира");
    }


    @Override
    public void swim() {
        System.out.println("Корабль идет");

    }
}
