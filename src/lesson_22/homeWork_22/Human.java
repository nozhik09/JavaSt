package lesson_22.homeWork_22;

public class Human {
    private String name;
    public int speedRun = 10;

    public int timeRelax = 15;

    public Human(String name) {
        this.name = name;

    }

    public void run(){
        System.out.println(" participant " + name + "Runs at speed " + speedRun + "km/h" );
        relaxTime(timeRelax);

    }
public void relaxTime(int timeRelax){
    System.out.println(name+ " relax " + timeRelax + "min");



}


}
