package lesson_09.homeWorkl;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int month;
        float dep;
        System.out.println("Введите сумму вклада");
        dep = scanner.nextFloat();

        System.out.println( " Введите кол-во месяцев ");
        month= scanner.nextInt();
        float lastsum = dep;
        for (int i = 0; i < month; i++) {


            lastsum+=dep * 0.07;
        }

        System.out.println(lastsum);





    }
}
