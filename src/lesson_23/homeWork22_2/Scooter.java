package lesson_23.homeWork22_2;

public class Scooter extends Vahicle{
    @Override
    public void startEngine() {
        setEngine(new Engine(30, "Benz"));

    }


    @Override
    public String toString() {
        return "Scooter";
    }

    public final void hello(){
        System.out.println("Hello");
    }

    public void hello(String s ){
        System.out.println("Hello " +s);
    }
}
