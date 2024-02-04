package lesson_05;

public class BollMethods {

    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        boolean bool;

        bool = true;
        bool = false;

        // сравнение равенства

        bool = x == y; //x равне y
        System.out.println("x==y -- " + bool);


        bool = x == 10;
        System.out.println(bool);


        // сравнение на НЕ равенство

        boolean bool2 = x != y;
        System.out.println("x!=Y -> " + bool2);

        bool2 = x != 10;

        System.out.println(bool2);


        // больше чем >
        boolean bool3 = x > y;
        System.out.println("x>y -> " + bool3);

        // больше ранов >=

        boolean bool4 = x >= y;
        System.out.println("x>=y -> " + bool4);

        //меньше равно


        boolean bool5 = x <= y;
        System.out.println("x<=y -> " + bool5);


        //Логические операции
        boolean bol6 = true;
        System.out.println(bol6);
        bol6 = !true;
        System.out.println("!true ->" + bol6);
        System.out.println(!false);

        System.out.println("4=5 ->" + !(4 == 5));

        // Kju jgthfwb\z &
        //& Логическое И (AND) - Возвращает true если оба операнда равны true.
        //Рим столица Италии и Берлин столица Англии -true и false
        //Рим столица Италии и Лондон столица Англии -true и true

        boolean bol7 = (2 < 5) & (11 == 10);

        System.out.println(bol7);
        boolean bol8 = (2 < 5) & (10 == 10);
        System.out.println(bol8);


        //| Логическое ИЛИ (OR) - Возвращает true если хотя
        // бы один из операндов равен true.
        boolean bol9 = (2<5) | (11==10);

        System.out.println(bol9);

        boolean bol10 = (2<1) | (11==10);
        System.out.println(bol10);


    }
}
