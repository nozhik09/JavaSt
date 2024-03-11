package lesson_39;

import java.util.*;

public class MapExample {


    public static void main(String[] args) {


        Map<Integer, String> oldTable = new Hashtable<>();// !!!старый образец !не рекомендуемое к использованию
        Map<Integer, String> map = new HashMap<>();// не рекомендуемое к использованию
//        Возвращает старое значение - соответсвующее ключу ранее

        System.out.println(map.put(1, "Hello"));
        map.put(2,"Java");
        map.put(3,"World");

        System.out.println(map.put(1, "Phyton"));
        map.put(17,"Orange");
        System.out.println(map);
        String value = map.get(17);
        System.out.println("value " + value);
        System.out.println("\n=========================\n");

        String value1 = map.get(100);
        String defaultValue = "Defolt";
        if (value1==null) value1=defaultValue;
        System.out.println(value1);

        String valueWithCheckNull = map.getOrDefault(1, "NotNullValue");
        System.out.println(valueWithCheckNull);


        System.out.println(map.containsKey(100));
        System.out.println(map.containsValue("Java"));


        map.isEmpty(); // возвращает тру если карта пуста
        int size = map.size();//возвразает колво пар ключ значений
        System.out.println(size +  "|" + map.isEmpty());

        //V remove(Object key)
        System.out.println(map);
        System.out.println(map.remove(100));
        System.out.println(map);

        System.out.println(map.remove(1, "Java"));
        System.out.println(map.remove(1,"Phyton"));
        System.out.println(map);

        //put vs replace
        // replace (K key , V value)
        map.put(99,"Banana");
        System.out.println(map.replace(2, "Value"));


        map.replace(99,"Banana" , "Kiwi");
        System.out.println(map);

//        Set<Key>
        Set<Integer> keySet = map.keySet();
        System.out.println("keySet " + keySet);
        for (Integer key: map.keySet()){
            System.out.println("Current value-> " + map.get(key) );
        }

//           Collection<V> map.values();возвращает коллекцию всех занчений
        System.out.println("\n=======================\n");

        Collection<String> collection = map.values();
        System.out.println(collection);

        Set<Map.Entry<Integer,String>> entrySet = map.entrySet();

        for (Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println("getKey" + entry.getKey());
            if (entry.getValue().equals("Value")){
                entry.setValue("Banana");
            }
            System.out.println("getValue->" + entry.getValue());
            System.out.println("=============");

        }

        System.out.println(map);
        map.forEach((key, val)-> System.out.println("Key: " + key + "|" + "value: " + val));
        Map<Integer, String>newMap = new LinkedHashMap<>();
        newMap.put(77,"Kotlin");
        newMap.put(0,"tree");
        newMap.put(87,"JS");
        System.out.println(newMap);
        map.put(87,"OuplicatedValue");
        System.out.println("map-> " + map);

        newMap.putAll(map);
        System.out.println(newMap);






    }








}
