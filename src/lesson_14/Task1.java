package lesson_14;

public class Task1 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        printArray(array);
        System.out.println();
        int i = 1;
        int j = 5;

        swap(array, i, j);
        printArray(array);

    }

    public static void swap(int[] array, int i, int j) {

        if (array == null || i <= 0 || j >= array.length || j <= 0 || i >= array.length) return;
        // после return в методе void дальше код не выполняется
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;


    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " , ");
        }


    }


}
