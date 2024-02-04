package lesson_11.homeWork;


import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(10);
        System.out.println(num);

        boolean bol = easy(num);
        System.out.println(bol);
        int[] array = {3, 6, 11, 31, 66, 100, 73, 75, 19};

        System.out.println(countPrime(array));
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

    public static int countPrime(int[] array) {
        int count = 0;
        //1. перебрать все знач в массиве
        //2. проверить каждое на простоту
        //3. при нахождении простого увелить счетчик на +1
        //4. после перебора всех вернуть значение счетчика
        for (int i = 0; i < array.length; i++) {
            if (easy(array[i])) {
                count++;
            }


        }

        return count;
    }


}

//        for (int i = 2; i*i <= num; i++) {
//            if (num % i == 0) {
//                return false;
//            }
//        }
//        return true;




