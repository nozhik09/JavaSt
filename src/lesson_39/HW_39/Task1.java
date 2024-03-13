package lesson_39.HW_39;

import java.util.HashMap;
import java.util.Map;

public class Task1 {

    public static void main(String[] args) {
        String text = "Строка для проверки количества вхождений слов" +
                ".\n Строка для проверки и теста. и количества слов для проверки";

        Map<String, Integer> frequencyMap = frequencyDictionary3(text);
        frequencyMap.forEach((key, value) -> System.out.println(key + ": " + value));


    }

    private static Map<String, Integer> frequencyDictionary(String text) {
        String[] words = text.replaceAll("[^a-zA-Zа-яА-Я ]", "").split("\\s+");

        Map<String, Integer> result = new HashMap<>();

        for (String word : words) {
            Integer amount = result.getOrDefault(word, 0);

            result.put(word, ++amount);
        }

        return result;

    }

    private static Map<String, Integer> frequencyDictionary2(String text) {
        String[] words = text.replaceAll("[^a-zA-Zа-яА-Я ]", "").split("\\s+");

        Map<String, Integer> result = new HashMap<>();

        for (String word : words) {
            Integer amount = result.get(word);
            if (amount == null) amount = 0;
            amount += 1;
            result.put(word, amount);
        }

        return result;
    }

    private static Map<String, Integer> frequencyDictionary3(String text) {
        String[] words = text.replaceAll("[^a-zA-Zа-яА-Я ]", "").split("\\s+");

        Map<String, Integer> result = new HashMap<>();

        for (String word : words) {
            result.compute(word, (key, oldValue) -> oldValue == null ? 1 : oldValue + 1);


            result.computeIfPresent(word, (k, v) -> v + 1);
            result.computeIfAbsent(word, k -> 1);


        }

        return result;

    }

    private static Map<String, Integer> frequencyDictionary4(String text) {
        String[] words = text.replaceAll("[^a-zA-Zа-яА-Я ]", "").split("\\s+");

        Map<String, Integer> result = new HashMap<>();

        for (String word : words) {
//            если get(key) -> вернет null , то будет результат аналог метода put(key,value(2qgfhfvtnh)
//Еслм же ключ существует в карте ,то будеет применяться функция обьединение
//            если результат обьеденения будет null - то пара из карты будет удалена
           result.merge(word,1,(oldValue,value)->oldValue+1);
            System.out.println(word);


        }

        return result;

    }

}
