package lesson_06;

import java.util.Scanner;

public class ScannerExaple {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);// говорит что нам нужен сканер

        System.out.println("Введите ваше имя: "); //

        String name = scanner.nextLine();

        System.out.println("Получили имя" + name);


        System.out.println("Ведите ваш возраст: " + name);


        int age = scanner.nextInt(); //считывает число
      //  scanner.nextLine();

        System.out.println("возраст = " + age);


        System.out.println("Введите число с запятой : ");
        double dob = scanner.nextDouble();

        System.out.println("Double" + dob);


    }


}
