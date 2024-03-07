package lesson_37.HM_37;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/*
Создайте два списка. Один на реализации ArrayList, второй на LinkedList.

Заполните их 5_000 одинаковыми случайными значениями от 0 до 1_000.

Создайте 4 метода, принимающий реализацию интерфейса List.

В первом методе - получение всех значений элементов списка по его индексу
Второй метод - вставка 2_000 новых значений по случайному индексу (диапазон индексов от 0 до размера списка)
Третий метод - удалить 1_000 элементов по случайному индексу. (диапазон индексов от 0 до размера коллекции)
Удалить 1_000 элементов по значению (диапазон случайных значений от 0 до 10_000)
Все методы должны возвращать время, затраченное на выполнение метода в миллисекундах.

Сравните для каждого из списка время выполнения каждого метода.

И сравните время последовательного выполнения всех методов для каждой реализации List-а.
 */

public class Task1 {

    private static final int CAPASITY = 5000;
    private static final int BOUND = 5000;

   private static final Random random = new Random();

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>(CAPASITY);
        List<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < CAPASITY; i++) {
            int reandomVlaue = random.nextInt(BOUND);
            arrayList.add(reandomVlaue);
            linkedList.add(reandomVlaue);
        }
        System.out.println("=======================ArrayList");
        long totalDuration = 0;
        long duretion1 = getAllByIndex(arrayList);
        totalDuration+=duretion1;


        System.out.println("getAllByIndex(arrayList)-> " + getAllByIndex(arrayList));
    }



    public static  long getAllByIndex(List<Integer> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }
        long end = System.currentTimeMillis();
        return (end-start);
    }


    public static  long insertRandomElements(List<Integer> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 2000; i++) {
            int index = random.nextInt(list.size());
            list.add(random.nextInt(),random.nextInt());
        }
        long end = System.currentTimeMillis();
        return (end-start);
    }
    public static  long removeRandomElementsByIndex(List<Integer> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            list.remove(random.nextInt(list.size()));
        }
        long end = System.currentTimeMillis();
        return (end-start);
    }

    public static long removeElementsByValue(List<Integer> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            list.remove(random.nextInt(10000));
        }
        long end = System.currentTimeMillis();
        return (end-start);
    }

}
