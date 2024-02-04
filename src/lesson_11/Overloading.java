package lesson_11;

import java.util.Random;

public class Overloading {
    public static void main(String[] args) {


        printNumber(10);

        printNumber(5,12);

        printNumber(5 , " Hello");
        printNumber(" Hello" , 5 );
        int[] ints = new int[10];


        printArray(ints);
        fillArray(ints);

        fillArray(ints, 1000);






        //сигнатура метода
        // Совокупность названия меиода и его параметров
        // последовательность параметров важна


    }//Methods =====================================
    // Метод который выводит числа на экран от 1 до 10




    public static void printArray(int[] inst){
        System.out.println(" [ ");
        for (int i = 0; i < inst.length ; i++) {
            System.out.print( inst[i] + ((i< inst.length-1) ? " ; " : " ]"));
        }
        System.out.println();

    }



    public static void fillArray(int [] ints , int bound){
        Random random = new Random();
        for (int i = 0; i <ints.length ; i++) {
            ints[i] = random.nextInt(bound + 1);

            System.out.print(ints[i] + " --- ");

        }

    }


   public static void fillArray(int [] ints){
       Random random = new Random();
       for (int i = 0; i <ints.length ; i++) {
           ints[i] = random.nextInt(101);

           System.out.print(ints[i] + " = ");

       }
       System.out.println();
   }




    public static void printNumber (String string , int didg){
        System.out.println( string + didg + "  ");

    }


public static void printNumber (int num, String str){
    for (int i = 1; i <=num; i++) {
        System.out.println( i + str  + "  ");

    }


}

    public static void printNumber(int star , int end){
        for (int i = star; i <= end ; i++) {
            System.out.print( i + " ,");

        }
        System.out.println();



    }

    public static void printNumber(int number) {

        System.out.println(" мы в методе инт 1 ") ;
        printNumber(4,number);
        sayHello();
    }


    public static void sayHello() {

        System.out.println("Hello");
    }


}
