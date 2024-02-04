package lesson_09.homeWorkl;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();


        int size = 50;
        int rage = 101;
        int[] ints = new int[size];
        int countPrime = 0;


        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(rage);
            System.out.print(ints[i] + ((i < ints.length - 1) ? " ," : "]\n "));

            int number = ints[i];

            boolean isPrime = true;

            for (int j = 2; j < number; j++) {
                if (number % j == 0) isPrime = false;

                if (isPrime) {
                    System.out.println(number + ", ");

                }
                countPrime++;

            }
        }

        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(rage);
            System.out.print(ints[i] + ((i < ints.length - 1) ? " ," : "]\n "));

            int number = ints[i];

            boolean isPrime = true;

            for (int j = 2; j < number; j++) {
                if (number % j == 0) isPrime = false;

                if (isPrime) {
                    System.out.println(number + ", ");

                }
                countPrime++;

            }
        }

    }
}
