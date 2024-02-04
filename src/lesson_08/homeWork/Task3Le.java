package lesson_08.homeWork;

import java.util.Random;

public class Task3Le {

    public static void main(String[] args) {
        Random random = new Random();
        int size = random.nextInt(15)+1;

        System.out.println("Size - " + size);
        int[] array =new int[size];

        int i =0;
        while (i<array.length){
            array[i] = random.nextInt(100);
            System.out.print(array[i] + ((i<array.length-1)? " ;" : ""));
            i++;
        }

        System.out.println("]");
        int min =array[0];
        int max = array[0];
        int sum = 0;
        i=0;
        while (i< array.length){
            sum+= array[i];
            if (max<array[i]) max = array[i];
            if (min>array[i]) min = array[i];
            i++;
        }
        System.out.println("Min " + min);
        System.out.println("Max " + max);
        System.out.println("Avarege " + ((double) sum/array.length));


    }
}
