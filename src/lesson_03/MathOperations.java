package lesson_03;

public class MathOperations {

    public static void main(String[] args) {

        int var1 = 20;
        int var2 = 7;
        int result;
        //сложение

        result = var1 + var2;
        System.out.println("result " + result);

        result = 21 + 7;
        System.out.println("result " + result);

        int res2;
        res2 = 21 + 22;
        System.out.println(res2);

        // вычитание
        result = var1 - var2;
        System.out.println(result);
        //умножение
        result = var1 * var2;
        System.out.println(result);

        // целочисленноу деление
        result=var1/var2;
        System.out.println("result "+ result);

        //остаток от деления===========================
        result=var1 % var2;
        System.out.println("result " + result);

        System.out.println("целочисленое деление 4/2 =" + (4/2));
        System.out.println("целочисленое деление 4%2 =" + (4%2));

        System.out.println("==========================");



        double doublevar = 20.0d;
        double doubleSeven = 7.0;
        double doubleResult = doublevar / doubleSeven;
        System.out.println("doubleResult " + doubleResult);

        //форматированный вывод==========================
        int  intResult=20/7;
        System.out.println("результат  деления" +var1+var2+intResult);
        System.out.printf("результат деления %d на %d =  %d\n",var1,var2,intResult);
        System.out.println("Что нибудь");
        // \n перевод  коретки

        //под %d подставляется шаблон цифри

        System.out.println("=============================");
        //%f для числа с точкой
        //%.(колво знгаков 2)2f

        System.out.printf("округленный вывод рузультата %.1f\n",doubleResult);

        System.out.println("=====================================");
        //IEEE 754
        //проблемы с double
        double x = 0.1;
        double y = 0.2;
        double z = x+y;
        System.out.println("z= " +z);

        x=1.0;
        y=3.0;
        z=x/y;
        System.out.println(z);














    }


}
