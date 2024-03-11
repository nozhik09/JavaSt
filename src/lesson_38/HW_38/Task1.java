package lesson_38.HW_38;

import org.junit.platform.commons.util.StringUtils;

import java.util.*;

public class Task1{
    public static void main(String[] args) {
        String testString = "Тестовая строка для удаления слов, которые повторяются. строка для удаления !";
        System.out.println(getUniqueSortedWords(testString));
    }

    public static List<String> getUniqueSortedWords (String testString) {
        String[] words = testString.split("\\s+");

        Set<String> uniqueWords = new HashSet<>();
        for (String word : words){
            uniqueWords.add(word);
        }
        List<String> sortedWords = new ArrayList<>(uniqueWords);
        sortedWords.sort(Comparator.comparingInt(String::length));
        return sortedWords;
    }





}
