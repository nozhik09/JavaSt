package lesson_07.HomeWork;

import java.util.Scanner;

public class Task0 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число от 1 до 3 ");
        int num = scanner.nextInt();

        switch (num) {
            case 1:
                System.out.println("Вы ввели число 1");
                break;
            case 2:
                System.out.println("Вы ввели число 2");
                break;
            case 3:
                System.out.println("Вы ввели число 3");
                break;
            default:
                System.out.println("Вы ввели неверное число");

        }
    }
}
