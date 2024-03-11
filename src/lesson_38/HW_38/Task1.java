package lesson_38.HW_38;


import java.util.*;

public class Task1{
    public static void main(String[] args) {
        String testString = "Тестовая вы строка для удаления слов, которые повторяются. \"строка\" для удаления !";
        System.out.println(getUniqueSortedWords2(testString));
    }

    public static List<String> getUniqueSortedWords (String testString) {
        String[] words = testString.split("\\s+");
        Set<String> uniqueWords = new TreeSet<>(Comparator.comparing(String::length));
        for (String word : words){
            uniqueWords.add(word);
        }
        return new ArrayList<>(uniqueWords);
    }

//Способ № 2

    public static List<String> getUniqueSortedWords2 (String testString) {
        String withoutPunchsSymbol = testString.replaceAll("[^a-zA-Z0-9а-яА-я ]", "");
        System.out.println(withoutPunchsSymbol);
        String[] words= withoutPunchsSymbol.split("\\s+");
        Set<String> uniqueWords = new TreeSet<>(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder()));
        uniqueWords.addAll(Arrays.asList(words));
        return new ArrayList<>(uniqueWords);

    }





}
