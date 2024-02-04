package lesson_08.homeWork;

import javax.naming.PartialResultException;

public class Task4 {
    public static void main(String[] args) {


        int[] mass = {5, 6, -25, 0, 31, -15};
        int min = mass[0];
        int max = mass[0];
        int i = 0;
        int minIndex = 0;
        int maxIndex = 0;


        while (i < mass.length) {
            if (max < mass[i]) {

                max = mass[i];
                maxIndex = i;
            }
            if (min < mass[i]) {
                min = mass[i];
                minIndex = i;
            }
            i++;

        }
        System.out.println(" " + max + " " + maxIndex);
        System.out.println(min + minIndex);
        mass[minIndex] = max;
        mass[maxIndex] = min;


    }


}




