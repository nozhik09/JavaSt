package lesson_05;


import java.util.Random;

public class HomeWork_5 {
    public static void main(String[] args) {


        Random r = new Random();

        int rand = r.nextInt(200);
        System.out.println(rand);

        //rand = 0;


        boolean bol1 = (rand !=0) & (rand % 2 == 0);
        boolean bol2 = rand % 2 == 0;
        boolean bol3 = rand % 3 == 0;
        boolean bol4 = rand % 3 == 0;
        boolean bol5 = bol1 & bol3;
        boolean bol6 = bol2 & bol4;
        System.out.println(rand + " четное: " + bol1 + "; кратно 3: " + bol3 + "; четное и кратное 3: " + bol5);
        System.out.println(rand + " четное: " + bol2 + "; кратно 3: " + bol4 + "; четное и кратное 3: " + bol6);


    }
}
