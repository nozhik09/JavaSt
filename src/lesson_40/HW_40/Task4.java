package lesson_40.HW_40;

import java.util.List;
import java.util.stream.Collectors;

public class Task4 {


    public static void main(String[] args) {

        List<String> stringList = List.of("Apple", "Banana", "Apricot", "Avocado", "Cherry","Apricot");

        List<String> filtrString = stringList.stream()
                .filter(str -> str.startsWith("A"))
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(filtrString);





    }
}
