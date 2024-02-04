package lesson_09.homeWorkl;

import java.util.Random;

public class Task0 {

    public static void main(String[] args) {

        Random random = new Random();
        int rand = random.nextInt();
        int[] array = new int[20];

        int sum = 0;


        for (int i = 0; i < array.length; i++) {

            array[i] = random.nextInt(101);
            System.out.print(array[i] + " , ");

        }

        System.out.println();

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sum += array[i];
                System.out.print(array[i] + " , ");

            }

        }
        System.out.println();
        System.out.println(" Сумма четных чисел = " + sum);

    }


}