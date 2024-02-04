package lesson_06;

public class DevZero {
    public static void main(String[] args) {

      /*  int result = 1108/0;

        System.out.println(result);

        если в инте то ошибка

       */

double result = 100.00 / 0;
double result2 = 1000.00 / 0;
        System.out.println(result);
        System.out.println(result==result2);

        double result3 = result/result2;
        System.out.println(result3);



    }
}
