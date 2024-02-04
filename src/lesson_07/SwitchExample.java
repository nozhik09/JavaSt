package lesson_07;

import java.util.Random;

public class SwitchExample {
    public static void main(String[] args) {

        int x = 8;


        if (x == 5) System.out.println("if x== 5 ");

        else if (x == 7) {
            System.out.println("if x==  ");


        } else {
            System.out.println("else x имеет друге знач  ");
        }


//String name = "Fred";

        switch (x) {
            case 5:
                System.out.println("switch x == 5 ");
                break;
            case 7:
            case 8:
                System.out.println("switch x == 7 or 8 ");
                break;
            default:
                System.out.println("switch x имеет другое значение ");


        }

        System.out.println("switch x имеет другое значение ");

        /*
        У ребенка карманные деньги. Допустим есть 100 денег
        Ребенок получает в школе оценки (от1 до 5)
        5-> +20 денег
        4-> +10
        3 -> не измкеняется
        2-> 20
        1- все
         */


        Random ran = new Random();
        int note = ran.nextInt(5)+1;
        int money = 100;

        System.out.println(note);

        switch (note) {
            case 5:
                System.out.println("Оценка 5= " + (money=money+20));
            break;
            case 4:System.out.println("Оценка 4= " + (money=money+10));
            break;
            case 3:System.out.println("Оценка 3= " + (money=money));
            break;
            case 2:System.out.println("Оценка 2= " + (money=money-20));
            break;
            case 1:System.out.println("Оценка 1= " + (money=money-100));
            break;
            default:System.out.println("Таких оценок не бывает");


        }
        System.out.println("Остаток мани =" + money);













    }
}
