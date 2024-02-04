package lesson_03;

import java.util.Random;

public class HomeWork03 {
    public static void main(String[] args) {

        int a = 0;
        int b = 1;
        int c = 2;
        int d = 3;
        int e = 4;
        int f = 5;
        int g = 6;
        int h = 7;
        int i = 8;
        int j = 9;
        int sum = a + b + c + d + e + f + g + h + i + j;
        int div = sum / 10;
        double result;
        int rest = sum % 10;
        result = (double) sum / 10;
        System.out.println(result); //4.5
        System.out.println(div);//4
        System.out.println(rest);//5


        System.out.println("Задание 2");

        double z = 1010d;
        double x = 549d;
        int m = 10;

        double resultt = (z + x) * m / 100;
        System.out.println("resultt = " + resultt + " Euro");  // 150.0

        double priseDisc = (z + x) - resultt;
        System.out.println("priseDisc = " + priseDisc + " Euro");


        System.out.println("Задание 3");

        int aa = -1;
        int bb = -4;
        int cc = 7;
        int dd = 13;
        int ee = 16;
        int ff = 19;
        int gg = 23;
        int summ = aa + bb + cc + dd + ee + ff + gg;
        double wether = ((double) summ) / 7;
        System.out.println("wether= " + wether); //10.428571428571429


        System.out.println("Задание 4");
        int var1 = 13;
        int var2 = var1 % 2;
        int var3 = var1 % 3;

        System.out.println(var2);//1
        System.out.println(var3);//1

        Random random = new Random();//рандомное число
        int rand = random.nextInt(10);
        System.out.println("rand " + rand);
        System.out.println(rand % 3);


        System.out.println("Задание 5");

        //инкримент , увеличение

      //  int p = 3;
      //  p += p++;
      //  System.out.println(p); //6

        int q = 5;
        q++;

        System.out.println(q);


        // x++ = постинеримент
        //++x = преинкремент

//        декремент
//        x--
//        -- x


    }


}
