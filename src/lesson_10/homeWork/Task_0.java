package lesson_10.homeWork;

public class Task_0 {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
arrayopp(array);
    }

public static void arrayopp(int[]array){
    System.out.println("[ ");
    for (int i = array.length -1; i >=0 ; i--) {
        System.out.print(array[i] + ", ");

    }
}
}
