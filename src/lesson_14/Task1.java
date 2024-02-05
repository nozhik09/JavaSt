package lesson_14;

public class Task1 {

    public static void main(String[] args) {
int[] array = {1,2,3,4,5,6};
int i = 1;
int j = 5;
swap(array, i, j);

    }

public static void swap (int[ ] array , int i , int j){
int temp = array[i] ;
array[i]=array[j];
array[j] = temp;




}



}
