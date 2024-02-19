package lesson_24.homeWork_24.Task2;

public class Triathlete implements Swimmer,Runner{



    private String name;



    public Triathlete(String name) {
        this.name = name;
    }

    @Override
    public void run(double distance) {

        if (distance<=0) System.out.println("Incorrect number");
        else {
            System.out.println(name + "Run " + distance + "km");
        }
    }

    @Override
    public void swim(double distance) {
        if (distance<0) System.out.println("Incorrect number");
        else {
            System.out.println(name + "Swim " + distance + "km");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Triathlete triathlete= new Triathlete("Emma ");
        triathlete.swim(-1);
        triathlete.run(15.12256);
    }



}
