package consult1.cons4;

import java.util.Scanner;

public class TemometrCalc {
    public static void main(String[] args) {
        /*
Пользователь вводит температуру в градусах цельсия
а вам нужно напечатать температуру в фаренгейтах
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Введите температуру в цельсиях");
        double tCel = scanner.nextDouble();
        double tFarengeit = tCel*1.8+32;
        System.out.println("Температура в фаренгейтах = " + tFarengeit);


    }


}
