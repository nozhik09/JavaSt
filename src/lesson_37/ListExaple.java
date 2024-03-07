package lesson_37;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ListExaple {
    public static void main(String[] args) {


        //конструкторы класса ArrayList
        List<Integer> integers = List.of(1,2,3,4,5,6);
        System.out.println(integers);

        List<String> strings = new ArrayList<>(List.of("Str1","Str2","Str3","Str4"));
        System.out.println(strings);
        strings.addAll(List.of("Strings" , "Java", "saddsa" , "Java"));
        System.out.println(strings);
        System.out.println(strings.get(3));

        System.out.println(strings.indexOf("Java"));
        System.out.println(strings.lastIndexOf("Java"));
        System.out.println(strings);
        strings.sort(Comparator.comparing(String::length));
        System.out.println(strings);

        List<String > subList =strings.subList(1,4);
        System.out.println(subList);


    }
}
