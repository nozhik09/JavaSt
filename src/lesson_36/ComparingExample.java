package lesson_36;

import java.util.Arrays;
import java.util.Comparator;

public class ComparingExample {


    public static void main(String[] args) {
        Car[] cars = new Car[7];
        cars[0] = new Car("Alfa", 2021, 120);
        cars[1] = new Car("BMW", 2000, 190);
        cars[2] = new Car("Citroen", 2018, 190);
        cars[3] = new Car("Bentley", 2023, 310);
        cars[4] = new Car("Ferrari", 2021, 300);
        cars[5] = new Car("Alfa", 2019, 150);
        cars[6] = new Car("null", 2019, 180);
        //static метод comparing - возвращает новый компаратор
        // :: -> Ссылка на методы. Позволяет ссылаться на метод без его выполнения
//        Comparator<Car> carComparator = Comparator.comparing(Car::getMaxSpeed);
//        Arrays.sort(cars, Comparator.comparing(Car::getMaxSpeed));

        // Специализированная версия для сравнения примитивов
//        Arrays.sort(cars, Comparator.comparingInt(Car::getMaxSpeed));

        System.out.println(Arrays.toString(cars));
        //обратный порядок сортировки
        Arrays.sort(cars, Comparator.comparing(Car::getMaxSpeed).reversed());
        Arrays.sort(cars, Comparator.comparing(Car::getMaxSpeed, Comparator.reverseOrder()));
        Arrays.sort(cars, Comparator.comparing(Car::getMaxSpeed, Comparator.naturalOrder()));
        Arrays.sort(cars, Comparator.comparing(Car::getModel, Comparator.nullsFirst(String::compareTo)));
        System.out.println(Arrays.toString(cars));
        System.out.println("===================================================");
        //Сравнить по модели если == сравнить по году выпуска
        Comparator<Car> carComparator1 = Comparator.comparing(Car::getModel, Comparator.nullsFirst(String::compareTo)).thenComparing(Car::getYear);

        Arrays.sort(cars, carComparator1);
        System.out.println(Arrays.toString(cars));
        //Реализовать сортировку машин по макс скорости
        Comparator<Car> carComparator2 = Comparator.comparing(Car::getMaxSpeed).reversed().thenComparing(Car::getYear);
        Arrays.sort(cars, carComparator2);
        System.out.println(Arrays.toString(cars));
        System.out.println("======================================");

        // реализовать сортировку по годлу выпуска, если год совпадает по убыванию скорости
        Arrays.sort(cars, Comparator
                .comparing(Car::getYear)
                .thenComparing(Car::getMaxSpeed, Comparator.reverseOrder())

        );
        System.out.println(Arrays.toString(cars));


    }
}
