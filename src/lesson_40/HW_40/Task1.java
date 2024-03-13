package lesson_40.HW_40;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1,2,3,4,5,15,651,8541,62,15,52,14,31,26,55,13,44,64,58);

        filterListIntegers(integers);

    }
private static List<Integer> filterListIntegers(List<Integer> integers){
    Predicate<Integer> isEven = integer -> integer%2==0;
    Predicate<Integer> more10 = integer -> integer>10;
    Predicate<Integer> less100 = integer -> integer<100;
    List<Integer> filter  = integers.stream().filter(isEven.and(more10).and(less100)).collect(Collectors.toList());
    System.out.println(filter);
    return filter;
}


}
