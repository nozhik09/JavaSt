package lesson_36;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ComparableExaple {

    public static void main(String[] args) {
        int[] ints = {9, 5, 1, 4, 2, 7, 6, 0};
        Arrays.sort(ints);
        System.out.println(Arrays.toString(ints));

        Car[] cars = new Car[5];
        cars[0] = new Car("Alfa", 2021, 120);
        cars[1] = new Car("BMW", 2000, 190);
        cars[2] = new Car("Citroen", 2018, 190);
        cars[3] = new Car("Bentley", 2023, 310);
        cars[4] = new Car("Ferrari", 2021, 300);

        Arrays.sort(cars);

        System.out.println(Arrays.toString(cars));
        //Comparable<T>
        //Comparator<T>
        CarSpeedComparator speedComparator = new CarSpeedComparator();
        Arrays.sort(cars, speedComparator);

        System.out.println(Arrays.toString(cars));
        String[] strings = {"Бббб", "Ссссс", "bbbbb", "Фффффф", "бббб"};
        Arrays.sort(strings);
        System.out.println(Arrays.toString(strings));
        Integer[] integers = {4, 56, 54, 14, 16, 24, 526, 16, 285, 634, 16};

        Arrays.sort(integers);
        System.out.println(Arrays.toString(integers));


        Arrays.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car car1, Car car2) {
                return car1.getModel().compareTo(car2.getModel());
            }
        });

        System.out.println(Arrays.toString(cars));


        Arrays.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car car1, Car car2) {
                return car1.getMaxSpeed() - car2.getMaxSpeed();
            }
        });
        System.out.println(Arrays.toString(cars));


        Arrays.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car car1, Car car2) {
                return car2.getMaxSpeed() - car1.getMaxSpeed();
            }
        });

        System.out.println("=========================");
        System.out.println(Arrays.toString(cars));
        // функциональный интерфейс - особый тип иньтерфейса который имеет роано 1 абстрактный метод

        //лямбда выражения - способ короткой записи анонимной функции "->"

        Arrays.sort(cars, ((car1, car2) -> car1.getMaxSpeed() - car2.getMaxSpeed()));
        System.out.println(Arrays.toString(cars));

        // Сравнить модели по году выпуска. если год выпуска одинаковы то сравнить по модели
        Arrays.sort(cars, (car1, car2) -> {
//            int yearCompare = car1.getYear()-car2.getYear();
            int yearCompare = Integer.compare(car1.getYear(), car2.getYear());
            if (yearCompare != 0) {
                return yearCompare;
            } else {
                return car1.getModel().compareTo(car2.getModel());
            }
        });
        System.out.println(Arrays.toString(cars));
        Comparator<Car> carComparator = (c1 , c2) -> Integer.compare(c1.getYear(),c2.getYear());


    }


}
