package lesson_36.HW_36.Task1;

import java.util.Arrays;
import java.util.Comparator;

public class MyComparator2 implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1 % 2 == 0 && o2 % 2 == 0) {
            return o1 - o2;
        } else if (o1 % 2 == 1 && o2 % 2 == 1) {
            return o2 - o1;
        } else if (o1 % 2 == 0) {
            return -1;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Integer[] integers = { 1, 6, 5, 4, 7, 8, 9, 2, 7, 3 };



        Arrays.sort(integers,new MyComparator2());
        System.out.println(Arrays.toString(integers));
    }




    }

