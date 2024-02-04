package lesson_08.homeWork;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] rand = new int[5];
        int i = 0;
        while (i < rand.length) {
            rand[i] = random.nextInt(100);
            System.out.print(rand[i++] + " , ");

        }
        i = 0;
        int min = rand[0];
        while (i < rand.length) {
            if (min > rand[i]) {
                min = rand[i];
            }
            i++;

        }
        System.out.println();
        System.out.println("Минимальное значение = " + min);


        i = 0;
        int max = rand[0];
        while (i < rand.length) {
            if (max < rand[i]) {
                max = rand[i];
            }
            i++;

        }
        System.out.println();
        System.out.println("Максимальное значение = " + max);


        i = 0;
        double sum=0;

        do {sum = (sum + rand[i]);
            i++;
        }
        while (i< rand.length); {
            sum=sum/ rand.length;
        }

        System.out.println("среднее арифметическое всех значений в массиве= " + sum);

    }


}
