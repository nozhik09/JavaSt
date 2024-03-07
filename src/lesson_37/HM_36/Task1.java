package lesson_37.HM_36;

import java.util.Arrays;
import java.util.Comparator;

public class Task1 {
    public static void main(String[] args) {
        Integer[] integers = { 1, 6, 5, 4, 7, 8, 9, 2, 7, 3 };
//        Arrays.sort(integers, new Task1Comparatoe());
        System.out.println(Arrays.toString(integers));

        Arrays.sort(integers, Comparator
                .<Integer>comparingInt(n -> n  % 2 == 0 ? -1 : 1 )
                .thenComparing(n->n)
        );


//        System.out.println(Arrays.toString(integers));
//
//        Arrays.sort(integers, (int1, int2)-> {
//            boolean isFirstEven = (int1 % 2)==0;
//            boolean isSecondEven = (int1 % 2)==0;
//            if (isFirstEven && isSecondEven){
//                return int1-int2;
//            } else if (isFirstEven) {
//                return -1;
//            } else if (isSecondEven) {
//                return 1;
//            }else {
//                return int2-int1;
//            }
//        });

        System.out.println(Arrays.toString(integers));

        Arrays.sort(integers, Comparator
                .<Integer>comparingInt(n -> n  % 2 == 0 ? -1 : 1 )
                .thenComparing(x->x % 2 == 0 ? x:-x)
        );


        System.out.println(Arrays.toString(integers));

    }


}
