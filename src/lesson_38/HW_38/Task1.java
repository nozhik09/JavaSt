package lesson_38.HW_38;


import java.util.*;

public class Task1{
    public static void main(String[] args) {
        String testString = "Тестовая вы строка для удаления слов, которые повторяются. строка для удаления !";
        System.out.println(getUniqueSortedWords(testString));
    }

    public static List<String> getUniqueSortedWords (String testString) {
        String[] words = testString.split("\\s+");

        Set<String> uniqueWords = new TreeSet<>(Comparator.comparing(String::length));
        for (String word : words){
            uniqueWords.add(word);
        }
        return new LinkedList<>(uniqueWords);
    }





}
