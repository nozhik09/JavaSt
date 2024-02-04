package lesson_11.homeWork;

public class Task1 {

    public static void main(String[] args) {
        int index = 2;
        boolean bol = false;


        int[] array = {1, 4, 3, 6, 7};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
        arrayopp(array);
        arrayopp(array, index);
        arrayopp(array, bol);
    }

    public static void arrayopp(int[] array , boolean bol ) {
        if(!bol){
            for (int i = array.length - 1; i >= 0; i--) {

            System.out.print(array[i] + ", ");
        }
        }
        else {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + ", ");
            }
        }
    }

    public static void arrayopp(int[] array) {
        arrayopp(array, 0);
    }

    public static void arrayopp(int[] array, int index) {


        for (int i = 0; i < index; i++) {
            System.out.print(array[i] + ", ");
        }
        for (int i = array.length - 1; i >= index; i--) {

            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }
}