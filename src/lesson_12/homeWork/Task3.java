package lesson_12.homeWork;

public class Task3 {


    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6};
        int leg = 10;
        int[] newArray = lowArray(array, leg);
    }

    public static int[] lowArray(int[] array, int leg) {
        int[] newArray = new int[leg];
        for (int i = 0; i < array.length && i < newArray.length; i++) {
            newArray[i] = array[i];
            System.out.print(newArray[i] + " ,");
        }

        return newArray;
    }


}
