package lesson_06.homework_6;

import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {


        System.out.println("Введите четырехзначное число");

        Scanner scan = new Scanner(System.in);

        String x = scan.nextLine();


        if (x.length() == 4) {
            System.out.println("Четырехзначное число = " + x);
        } else if (x.length() != 4) {
            System.out.println("Ошибка программы");
            System.exit(1);
        }

        //опция 2
        if (x.length() == 4) {
            int digit = Integer.parseInt(x);// пытается вытащить число и записать в int
            System.out.println("Четырехзначное число = " + x);
            // откусфывает по 1-й цифре
            int didgit0 = digit % 10;
            digit /= 10;

        }



      /*  int first = 1313;
        int second = 6521;
        int first1 = first / 100%10 + first/1000%10;
        int first2 = first % 100 /10 +  first %10;
        int second1 = second / 100%10 + second/1000%10;
        int second2 = second % 100/10 + second%10;
        if (first1 == first2) {
            System.out.println(first1 + "=" + first2 + "- Число счастливое");
        }
        if (first1 != first2) {
            System.out.println(first1 + "=" + first2 + "- число НЕ является счастливым");
        }
        if (second1 == second2) {
            System.out.println(second1 + "=" + second2 + "- Число счастливое");
        }
        if (second1 != second2) {
            System.out.println(second1 + "=" + second2 + "- число НЕ является счастливым");
        }

       */


    }
}



