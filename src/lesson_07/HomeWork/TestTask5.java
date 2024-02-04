package lesson_07.HomeWork;

import java.util.Scanner;

public class TestTask5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввкдите слово hello");
        String hello = scanner.nextLine();

        while (!hello.equals("hello")) {
            System.out.println("введите слово hello");
            hello = scanner.nextLine();

        }
        System.out.println("Спасибо, досвидание");


//способ 2
        String helloDo;
        do {
            System.out.println("Введите hello do while");
            helloDo = scanner.nextLine();
        }
        while (!helloDo.equalsIgnoreCase("hello"));
        System.out.println("Спасибо, досвидание");


    }
}
