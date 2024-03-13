package lesson_39.HW_39;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Task3 {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("apple", 50);
        map1.put("banana", 20);
        map1.put("cherry", 30);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("banana", 25);
        map2.put("cherry", 30);
        map2.put("date", 40);
        System.out.println(map1);


        Map<String, Integer> intersectionMap = intersection(map1, map2);
        intersectionMap.forEach((key, value) -> System.out.println(key + ": " + value));
        System.out.println("map1 " + map1);

    }


    private static Map<String, Integer> intersection(Map<String, Integer> map1, Map<String, Integer> map2) {
        Map<String, Integer> result = new HashMap<>();
        Set<String> keySet = map1.keySet();
        //из набора ключей удалить ключи который присутствуют во 2 карте
        keySet.retainAll(map2.keySet());
        for (String key : keySet) {
            result.put(key, map1.get(key));
        }
        return result;
    }


    private static Map<String, Integer> intersection2(Map<String, Integer> map1, Map<String, Integer> map2) {
        Map<String,Integer> result = new HashMap<>(map1);
        Set<String> keyResult = result.keySet();
        keyResult.retainAll(map2.keySet());
        return result;



    }



}
