package lesson_4;

public class ClassChar {

    public static void main(String[] args) {

        char a = 'A'; //в Чар будет храниться только 1 символ A
        char a1 = 65; //Чар может храниться только 1 символ A
        char a2 = 0x0041;// xbckj d 16nbhbxyjq cbc bcxbcktybz
        char a3 =  '\u0041';

        System.out.println("a= " + a);
        System.out.println("a1= " + a1);
        System.out.println("a2= " + a2);
        System.out.println("a3= " + a3);

        /*
        48...57 для цифр от 0-9
        65...90 Большие  буквы латинского алфавита
        97...122 маленькте  буквы латинского алфавита
         */


        char digit0 =48;
        System.out.println(digit0);

        digit0++;
        digit0+=4;

        System.out.println(digit0);

        char simpleZ=90;
        System.out.println("simpleZ= "+ --simpleZ);

        char smallA = 97;

        System.out.println("smallA= "+ smallA);


        smallA=  (char)(smallA+10);
        System.out.println("smallA "+smallA);

        char ch= 31; // int в диапазоне от 0-65535 кастируется  в тип  char
        System.out.println(ch);
        System.out.println("============================");

        //переполнение данных
        byte bt= 127;
        System.out.println(bt);


        bt+=10;

        System.out.println(bt);

        short sh  = 32767;
        sh+=10;

        System.out.println("sh "+ sh);

        char cs=28;

        System.out.println("cs "+ cs);



        System.out.println("==============");

        char home = 36;
        System.out.println(home);











    }
}
