package lesson_40;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {


        //Stream API
        // Stream -
        // промежуточные методы
    /*
    filter(Predicate<T>) - отфильтровать элементы, соотв данному предикату
    sorted() - сортирует элементы
    map(Function<T,R) преобразует элемент потока с использованием мапера
    peek(Consumer<T> action) выполняет дейсвие для каждого потока

    терминальные методы





     */

//        task1();
//        task2();
//        task3();
//        task4();
//        task5();
        task6();


    }

    private static void task6() {
        List<Cat> cats = getListCats();
        List<String> nameLeght = cats.stream()
                .filter(cat -> cat.getName().length()<5).map(Cat::getName).collect(Collectors.toList());
        System.out.println(nameLeght);





    }

    private static void task5() {
        List<Cat> cats = getListCats();

        List<String> nameCats = cats.stream()
                .filter(cat -> cat.getWeight() > 4)
                .map(Cat::getName)
                .collect(Collectors.toList());
        System.out.println(nameCats);


    }

    private static void task4() {
        List<Cat> cats = getListCats();
        Stream<String> nameCats = cats.stream()
                .map(cat -> cat.getName());

        List<String> getNames = cats.stream()
                .map(Cat::getName)
                .collect(Collectors.toList());
        System.out.println(getNames);


    }

    private static void task3() {
        List<Cat> cats = getListCats();
        //фильтрация по длине имени
        Stream<Cat> catStream = cats.stream()
                .filter(cat -> cat.getName().length() > 4);


        List<Cat> catList = catStream.collect(Collectors.toList());
        System.out.println(catList);


        System.out.println("End");
    }

    private static void task2() {
        List<Cat> cats = getListCats();
        Stream<Cat> catStream = cats.stream()
                .filter(cat -> cat.getWeight() > 4);
        List<Cat> fatCats = catStream.collect(Collectors.toList());
        System.out.println(fatCats);

    }


    private static List<Cat> getListCats() {

        return List.of(
                new Cat("Bear", 5, "braun"),
                new Cat("Python", 7, "white"),
                new Cat("Tiger", 3, "gary"),
                new Cat("Panda", 4, "black")


        );
    }


    private static void task1() {

        List<Integer> integers = List.of(1, 12, 6, 4, 1, -15, 24, 8);

//        List<Integer> result = new ArrayList<>();
//        for(Integer intg: integers){
//            if(intg>0) result.add(intg);
//        }
//        Collections.sort(result);
//        System.out.println(result);

        // содаю поток на основании коллекции

        List<Integer> resultStream = integers.stream()
                .filter(integer -> integer > 0)
                .sorted()
                .collect(Collectors.toList());//преобразует элементы потока в список
        System.out.println(resultStream);

    }


}
