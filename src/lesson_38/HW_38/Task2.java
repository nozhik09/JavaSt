package lesson_38.HW_38;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>(List.of("Java", "Python", "C++", "C#"));
        Set<String> set2 = new HashSet<>(List.of("Python", "Kotlin", "Java", "JavaScript"));
        System.out.println("set1 " + set1);
        System.out.println("set2 " + set2);
        System.out.println("Метод union " + union(set1, set2));
        System.out.println("\n=============================\n");

        System.out.println(" Метод intersection " + intersection(set1, set2));


        System.out.println("Метод difference " + difference(set1,set2));


    }
    //Реализуйте метод union(Set<String> set1, Set<String> set2),
// который возвращает множество, содержащее все уникальные элементы из обоих множеств (объединение множеств).
    public static List<String> union(Set<String> set1, Set<String> set2) {

        Set<String> sorted = new HashSet<>();

        sorted.addAll(set1);
        sorted.addAll(set2);


        return new ArrayList<>(sorted);
    }
    //Реализуйте метод intersection(Set<String> set1, Set<String> set2),
// который возвращает множество, содержащее только элементы, которые присутствуют в обоих исходных множествах (пересечение множеств).
    public static List<String> intersection(Set<String> set1, Set<String> set2) {

        Set<String> intersection = new HashSet<>();

        for (String str : set1) {
            if (set2.contains(str)) {
                intersection.add(str);
            }
        }

        return new ArrayList<>(intersection);
    }
//    Реализуйте метод difference(Set<String> set1, Set<String> set2),
//    который возвращает множество элементов, которые есть в первом множестве, но отсутствуют во втором (разность множеств).
    public static List<String> difference(Set<String> set1, Set<String> set2) {

        Set<String> difference = new HashSet<>();

        for (String dif : set1) {
            if (!set2.contains(dif)) {
                difference.add(dif);
            }
        }
        return new ArrayList<>(difference);
    }

}
