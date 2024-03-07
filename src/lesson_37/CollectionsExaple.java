package lesson_37;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionsExaple {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        // методы интерфейса Collection
        //Все эьт методы гарантированно есть во всех коллекциях

        //add(E e) добавляет елеммент в коллекцию
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(2, 100);
        System.out.println("List.seze= " + list.size());
        System.out.println(list);
        list.remove(0);  //пои индексу
        list.remove(Integer.valueOf(100));// по значению
        System.out.println(list);

        //boolean isEmpty() возвращает true если коллекция пустая
        System.out.println("list.isEmpty()" + list.isEmpty());


        System.out.println("list.contains(4)" + list.contains(4));


        System.out.println("=====================");

        List<Integer> listA = new ArrayList<>();
        listA.add(5);
        listA.add(6);
        listA.add(7);
        listA.add(8);
        list.addAll(listA);
        System.out.println(list);

        list.addAll(1, listA);
        System.out.println(list);
        // boolean containsAll (коллекцию) - возвращает true если коллекция содержит все элементы
        List<Integer> listB = new ArrayList<>();
        listB.add(8);
        listB.add(7);
        listB.add(2);
        System.out.println("listB " + listB);
        System.out.println("list.containsAll(listB)" + list.containsAll(listB));
        System.out.println("======================");
        // removeAll(Collection c)-> удаляет все элемменты из текущей коллекции которая содержится в коллекции
        System.out.println(list.removeAll(listB));
        System.out.println(list);
        System.out.println("\n================================\n");
        System.out.println("list" + list);
        System.out.println("listA " + listA);
//        retainAll() оставляет в текущей колекции только те элементы которые содержаться в указанной коллекции
        System.out.println(list.retainAll(listA));
        System.out.println(list);
//        clean удаляет все елементы
        listA.clear();
        System.out.println(listA);

        //toArray
        Object[] objects = list.toArray();
        System.out.println(Arrays.toString(objects));

        Integer[] integers = list.toArray(new Integer[0]);
        System.out.println(Arrays.toString(integers));
        // removeIf - удаляет все эллементы из коллекции удовлетворяющий предикат
        list.removeIf(i-> i%2==0);
        System.out.println(list);

    }
}
