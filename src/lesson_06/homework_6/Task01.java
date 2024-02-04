package lesson_06.homework_6;

import java.util.Random;

public class Task01 {
    public static void main(String[] args) {

        Random x = new Random();
        int in1 = x.nextInt(100);
        int in2 = x.nextInt(100);
        int in3 = x.nextInt(100);
        int in4 = x.nextInt(100);
        System.out.println("Рандом 1- " + in1 + " Рандом 2- " + in2 + " Рандом 3 - " + in3 + " Рандом 4 - " + in4);

        int max = in1;
        if (in2 > max) {
            max = in2;
        }
        if (in3 > max) {
            max = in3;
        }
        if (in4 > max) {
            max = in4;
        }

        System.out.println(max);





    }
}
