package lesson_12.homeWork;

public class Task2 {

    public static void main(String[] args) {

        int[] array = {0, 13, -25, 11, 31, 55, 98, 11, 5};

        int count = easy(array);
        System.out.println(count);



    }


    public static int easy(int[] array) {
        int count = 0;
        boolean[] bol = new boolean[array.length];
        for (int i = 2; i < array.length; i++) {
            bol[i] = true;
        }
        for (int i = 2; i * i < array.length; i++) {
            if (bol[i]) {
                for (int j = i * i; j < array.length; j += i) {
                    bol[j] = false;
                }
            }
        }
        for (int i = 2; i < array.length; i++) {
            if (bol[i]) count++;

        }

        return count;


    }
}
