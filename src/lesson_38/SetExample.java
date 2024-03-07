package lesson_38;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        //Контракт между hashCode() and equals()
        //1.если 2 обьекта равны между собой по equals(), то их хэш-коды тоже должны быть равны между собой
        //2.если хэш коды двух обьектов различны, то эти обьекты точно не равны по методу equals
        //3.Вызов метода hashCode должен возвращать одинаковое значение при многократных вызовах на неизмененном обьекте


        Set<Integer> integersConstructor = new HashSet<>();// 16 Корзин, loadFactory 0,75
        Set<Integer> integers1 = new HashSet<>(32);// задаем кол-во корзин только в степени 2 -- 16-32-64-128....
        Set<Integer> integers2 = new HashSet<>(28, 0.8f);// задаем кол-во корзин только в степени 2 -- 16-32-64-128.... залаем loadFactory
        Set<Integer> integers3 = new HashSet<>(integersConstructor);// Принимает коллекцию и создает Set из уникальных элементов этой коллекции

        List<Integer> startValues = List.of(15, 1, 2, 3, 4, 5, 6, 13, 8, 15, 7, 3, 15, 7, 0, 16, 32, 64);

        Set<Integer> integers = new HashSet<>(startValues);
        System.out.println("integers->" + integers);
//
//        Set<String> strings = new HashSet<>(List.of("String" , "Java", "Python", "hello","String","String","String","String","String","sdads","String"));
//        System.out.println(strings);
        Set<Integer> linkedSet = new LinkedHashSet<>(startValues);//сохраняет порядок добавления элементов
        System.out.println(linkedSet);
        // add(E e) добюавляет
        System.out.println(integers.add(100));// true - Элемент добавлен так как не было еще такого числа в сете
        System.out.println(integers.add(100));//false - Элемент не добавлен так как уже было иакое знач в сете
        //remove(Object)
        System.out.println("integers.remove(100)->" + integers.remove(100));
        System.out.println("integers.remove(100)numb2->" + integers.remove(100));

//        boolean contains(Object onj)
        System.out.println(integers.contains(32));
//        sizq
//        integers.size();
//        integers.isEmpty();
//        integers.iterator();
        Iterator<Integer> iterator = integers.iterator();
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//      clear - удаляем все элементы из Set

        Set<Integer> treeSet0 = new TreeSet<>();// Простое упорядоченое сортируемое в естесвеннном порядке множество
        Set<Integer> treeSet1 = new TreeSet<>(integers); //
        Set<Integer> treeSet2 = new TreeSet<>(Comparator.reverseOrder());//
//        Set<Integer> treeSet3 = new TreeSet<>(TreeSet<T>); создает новое множество , содрежащее те же элемменты в том же порядке
        Set<Integer> treeSet = new TreeSet<>(startValues);
        System.out.println(treeSet);
//        Set<Integer> sortedRevrsed = new TreeSet<>(Comparator.reverseOrder());
        Set<Integer> sortedRevrsed = new TreeSet<>((i1, i2) -> i2.compareTo(i1));
        sortedRevrsed.add(11);
        sortedRevrsed.addAll(startValues);
        System.out.println("sortedRevrsed-> " + sortedRevrsed);


        System.out.println(startValues);
        List<Integer> uniqueList = getUniqueList(startValues);
        System.out.println("uniqueList-> " + uniqueList);

        List<Integer> sortInt = getUniqueListSort(startValues);
        System.out.println(sortInt);




    }


    //написать метод котрый принимает список и возвращает список состоящий из уникальных елементов       отсортированых в порядке убывания

    public static List<Integer> integerList(List<Integer> listInteger) {
        Set<Integer> integerSet = new HashSet<>(listInteger);

        return new ArrayList<>(integerSet);
    }

    public static <T> List<T> getUniqueList(List<T> list) {
        Set<T> set = new LinkedHashSet<>(list);

        return new ArrayList<>(set);

    }


    public static <T> List<T> getUniqueListSort(List<T> list) {
        Set<T> set = (Set<T>) new TreeSet<>(Comparator.reverseOrder());
        set.addAll(list);

        return new ArrayList<>(set);
    }


}
