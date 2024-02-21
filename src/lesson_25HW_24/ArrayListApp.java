package lesson_25HW_24;

import java.util.Arrays;

public class ArrayListApp {

    public static void main(String[] args) {
        MyArrayList<Integer> integerList = new MyArrayList<>();

        MyList<String> stringList = new MyArrayList<>();

        MyList<Number> numberList = new MyArrayList<>();
        System.out.println(stringList);

        integerList.add(100);
        System.out.println(integerList);
        integerList.addAll(200, 300, 400, 500, 20, 30, 40, 99);
        System.out.println(integerList);
        System.out.println("size String " + numberList.size());
        System.out.println("size Integer " + integerList.size());

        Integer value = integerList.get(5);
        System.out.println(value);
        integerList.set(5, -500);
        System.out.println(integerList);

        System.out.println("integerList.indexOf(1000) " + integerList.indexOf(1000));
        System.out.println("integerList.indexOf(500) " + integerList.indexOf(500));

        integerList.add(500);
        System.out.println(integerList);

        System.out.println(integerList.lastIndexOf(500));

        System.out.println("============================");
        stringList.addAll("Hello", "Java ", "Some String", "Orange");
        System.out.println(stringList);
        System.out.println(stringList.contains("hello"));
        System.out.println(stringList.contains("Hello"));

       integerList.addAll(1,2,3,4,5,6,7);
        System.out.println(integerList);
        Object[] array = integerList.toArray();
        System.out.println(Arrays.toString(array));
        System.out.println(array.length);

        System.out.println("\n ==============================\n");

        System.out.println(integerList.remove( Integer.valueOf(30)));
        System.out.println(integerList);

        System.out.println(integerList.remove(1));
        System.out.println(integerList);

        System.out.println(numberList.isEmpty());
        System.out.println(stringList.isEmpty());


        numberList.addAll(15,16,5.6,0,5.7,-54645);
        System.out.println(numberList);
        




    }
}
