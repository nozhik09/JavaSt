package lesson_19;

import java.util.Arrays;

public class ArraysUse {
    public static void main(String[] args) {
        //Класс Arrays набор стат методов для операций над массивами


        int[] ints = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        // toString - возвращает массив в строку
        String stringArray = Arrays.toString(ints);
        System.out.println(stringArray);

        System.out.println(Arrays.toString(ints));

        // copyOf()
        // создает неогвый массив указаной длины
        // при этом копирует элементы указанного массива
        int[] newInts = Arrays.copyOf(ints, 20);
        System.out.println(Arrays.toString(newInts));

        // скопироваьб диапазщон знач из старого массива
        int[] intsRange = Arrays.copyOfRange(ints, 2, 7);
        System.out.println("Arrays.copyOfRange от 2 по 7 " + Arrays.toString(intsRange));

// метод заполняющий массив значениями
        int[] fillAArray = new int[10];
        Arrays.fill(fillAArray, 50);
        System.out.println(Arrays.toString(fillAArray));
// сравнеение массивов
        int[] number = {1,2,3,4};
        int[] digits = {1,2,3,4};
        System.out.println(Arrays.equals(number,digits));


        //deepToString позволяет получать строковое представление многомерного массива
        int[][] matrix = new int[3][4];

        System.out.println(Arrays.deepToString(matrix));

        





    }



}
