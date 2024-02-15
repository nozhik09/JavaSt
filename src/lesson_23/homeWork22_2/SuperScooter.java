package lesson_23.homeWork22_2;

public class SuperScooter extends Scooter {

    @Override
    public void startEngine() {
        System.out.println("Start");
    }
    public void hello(String string){
        super.hello();
        System.out.println(string);
    }

}
