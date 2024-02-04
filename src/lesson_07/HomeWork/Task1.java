package lesson_07.HomeWork;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Ввести число от 1 до 7");
        int num = scan.nextInt();

        switch (num){
            case 1:
                System.out.println("Понедльник");
                break;
            case 2:  System.out.println("Вторник");
            break;
            case 3:  System.out.println("Среда");
            break;
            case 4:  System.out.println("Четверг");
            break;
            case 5:  System.out.println("Пятница ");
            break;
            case 6:
            case 7:  System.out.println("Выходной");
            break;
            default:
                System.out.println("Ваш код не распознан");
        }
    }
}
