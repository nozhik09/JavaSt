package lesson_4;


public class HomeWork_04 {
    public static void main(String[] args) {

        System.out.println("task 1===============================");

        String name = "VladyslavN"; //1
        System.out.println("Кол-во символов в имени " + name.length());//2
        char first = name.charAt(0);    //3
        char last = name.charAt(name.length() - 1);//3

        System.out.println("Первый символ= " + first);
        System.out.println("Второй символ= " + last);

        System.out.println("Десятичный код первого символа 1= " + (int) (first));
        System.out.println("Десятичный код первого символа 1= " + (int) (last));


        System.out.println("task 2===================================");


        String a1 = "Java ";  //1
        String a2 = "is ";
        String a3 = "a ";
        String a4 = "powerful ";
        String a5 = "language ";

        String all = a1 + a2 + a3 + a4 + a5;
        System.out.println("Вывод строки сп1= " + all);
        System.out.println("all= " + all.length());

        System.out.println("Вывод строки сп2" + (all = a1.concat(a2 + a3 + a4 + a5)));

        System.out.println(all.length());

        String concatStr = String.join("" , a1 , a2 , a3, a4 , a5 );
        System.out.println( concatStr);;

        System.out.println("task 2.2==============================================");
        System.out.println(all.replace("powerful", "Super"));

        boolean exa = all.contains("age");
        System.out.println(exa);


        System.out.println("task 3======================");


        String str1 = "string";
        String str2 = "code";
        String str3 = "Practice";

        int mid1 = str1.length() / 2;
        int mid2 = str2.length() / 2;
        int mid3 = str3.length() / 2;

        System.out.println(str1.charAt(mid1 - 1) + ""  + str1.charAt(mid1));
        System.out.println(str2.charAt(mid2 - 1) + "" + str2.charAt(mid2));
        System.out.println(str3.charAt(mid3 - 1) + "" + str3.charAt(mid3));

        String subscript = str1.substring(mid1-1,mid2 +1);

        System.out.println(subscript);




        System.out.println("NewHW==========================================");


        char ch1 = 'v';
        char ch2 = 'l';
        char ch3 = 'a';
        char ch4 = 'd';
        char ch5 = 'y';
        char ch6 = 's';
        char ch7 = 'l';
        char ch8 = 'a';
        char ch9 = 'v';


        /* String namew = ("" +
                (ch1 = (char) (ch1-'v' + 'V'))
                + (ch2 = (char) (ch2 -'l' + 'L'))
                + (ch3 = (char) (ch3-'a' + 'A'))
                + (ch4 = (char) (ch4-'d' + 'D'))
                + (ch5 = (char) (ch5-'y' + 'Y'))
                + (ch6 = (char) (ch6-'s' + 'S'))
                + (ch7 = (char) (ch7-'l' + 'L'))
                + (ch8 = (char) (ch8-'a' + 'A'))
                + (ch9 = (char) (ch9-'v' + 'V')) );

         */

        ch1-=32;
        ch2-=32;

        System.out.println(""+ ch1+ ch2);


    }


}
