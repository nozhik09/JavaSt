package lesson_03;

public class Lesson_03 {


    public static void main(String[] args) {

        int myFirstVariable; //Дукларация переменной

        myFirstVariable = 1; //знак  присвоения

        System.out.println(myFirstVariable);

        int mySecondVariable = 25;

        System.out.println(mySecondVariable);

        mySecondVariable = 50;

        System.out.println(mySecondVariable);
        byte byteVar = 127; // обьявление переменной типа байт
        System.out.println("имя переменно " + byteVar);

short shortVar = 31000;
        System.out.println(shortVar);

        long longVar = 2_100_000_000_000L; // знак _ не алияет на переменную
        // в конце L скакзать что жто в формате long
        System.out.println(longVar + " longVar");


        double doubleVar = 10.5421;

        float floutVar = 11.65F;
        System.out.println(floutVar);

    }


}
