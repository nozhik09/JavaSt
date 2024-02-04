package lesson_06;

public class BooleanEx2 {

    public static void main(String[] args) {
// ^ логияескому исключение ИЛИ
        boolean bol = true ^ false;

       /* System.out.println("True ^ false ->"  + (true ^ false));
        System.out.println("false ^ false ->"  + (true ^ false));
        System.out.println("True ^ false ->"  + (true ^ true));
        System.out.println("True ^ True ->"  + (true ^ true));
        System.out.println("True ^ false ->"  + (false ^ false));

        */


        // && логическое сокращенное И -

        int a = 5;
        int b = 10;
        a= 1;
        boolean b2 = (a !=0) && (b/a>5);
        System.out.println("b/2>5-> " + b2);

        // лог сокращкете
        boolean b3 = (a==0) && (b/a >5);

        System.out.println("a==0) || (b/a >5) " + b3);


        System.out.println("=========================================================");
        System.out.println( true ^ true && false);
        System.out.println( true ^ true & false);

        /* порядок лог операций
        1  !
        2  &
        3  ^
        4  |
        5  &&
        6  ||
         */

        boolean aa =true;
        boolean bb = false;
        int cc = 25;
        int qq = 2 ;

        System.out.println(aa | bb | cc < 100 & !aa ^ qq ==5);
        System.out.println(true | false | 25 < 100 & !true ^ 2 ==5);
        System.out.println(true | false | true & !true ^ false);
        System.out.println(true | false | true ^ false);
        System.out.println(true | false | false);








    }
}
