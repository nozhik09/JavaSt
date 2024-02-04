package lesson_06;

public class IfStatement {

    public static void main(String[] args) {

        // Оператор блок. Определяет область видимости пременных.
        int x =10;

        {
            int y=5;
            x+=y;
        }

        //    x+=y; -> не имеем доступа за {}

        int y= 11; // можно переприсвот имя переменной

        System.out.println("x = " + x);
        System.out.println("==================================");

        // if (Условие) код , оператор=== выполняющийся если условие верно

        int n = 8;
        // if (n>10) System.out.println("x > 10");


        if (n>5) {

            System.out.println( "Всем провет");
            System.out.println( "Сейчас ч > 10");
        } else if ( n > 7) {

            System.out.println("dsadsad");
            System.out.println( "sdasdda");

        } else
        {

            System.out.println(" Я ушел");
            System.out.println("Сейчас x не больше 10");
        }


        System.out.println("End program ");





    }
}
