package lesson_36.HW_36.Task1;

import java.util.Arrays;
import java.util.Comparator;

public class MyComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1 % 2 == 0 && o2 % 2 != 0) {
            return -1;
        } else if (o1 % 2 != 0 && o2 % 2 == 0) {
            return 1;
        } else {
            return o1.compareTo(o2);
        }
    }


    public static void main(String[] args) {
        Integer[] integers = { 1, 6, 5, 4, 7, 8, 9, 2, 7, 3 };
//        MyComparator myComparator = new MyComparator();
        Arrays.sort(integers,new MyComparator());
        System.out.println(Arrays.toString(integers));
    }
}
