package lesson_12.homeWorkAr13;

public class Task22 {
    public static void main(String[] args) {
        int[] array = {0, 13, -25, 11, 31, 55, 98, 11, 5};
        int[] primeValue = arrayOnlyPrimeValues(array);
    }

    public static int[] arrayOnlyPrimeValues(int[] array) {
        //Что бы обьявть массив нам надо указать его размер
        // Но мы не знаем скольо у нас будет простых чисел
        // Создать массив будет проблкматичнло
// 1.Перебрать все значения массива и посчиьаьб кол-во простых чисел
        // Перебраьть опять масси и записать числа в рузульт массив
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (easy(array[i])) count++;

        }
        int[] result = new int[count];
        for (int i = 0, k = 0; i < array.length; i++) {
            if (easy(array[i])) {
                result[k] = array[i];
                k++;
            }


        }


        return result;

    }


    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }


    }


    public static boolean easy(int num) {
        if (num <= 1) return false;
        if (num == 2 || num == 3) return true;
        if (num % 2 == 0 || num % 3 == 0) return false;

        for (int i = 0; i <= Math.sqrt(num); i += 6) {
            if (num % i == 0 || num % (i / 2) == 0) {
                return false;
            }

        }
        return false;
    }

}