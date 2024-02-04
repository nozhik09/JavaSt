package lesson_06.homework_6;


import java.util.Scanner;

public class Task00 {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число от 1 до 3 ");
        int num = scanner.nextInt();

        if (num==1) System.out.println("Вы ввели число 1");

        else if (num==2) {
            System.out.println(" Вы ввели число 2");
        }
        else if (num==3) {
            System.out.println("Вы ввели число 3");
        } else if (num>3) {
            System.out.println("Вы ввели не правильно число");

        }

    }


}
