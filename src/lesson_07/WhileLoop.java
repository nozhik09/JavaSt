package lesson_07;

public class WhileLoop {
    public static void main(String[] args) {

        /*while ( услолвие) {
           Тело цикла
      }



        while (true) {
            System.out.println("Hello");
        }
        */

        int i=0;
        while (i<10){
            System.out.println("i =" +i);
            i++;
        }
        System.out.println("===========");


        String str = "Петя Привет";
        int idx = 0;

       while (idx<str.length()){
        System.out.print(str.charAt(idx) + "");
        idx++;
           System.out.println();}


        // распечатать все числа от 0 до 21 с шагом 1
        // перебрать все чилсла от 1 до 21 с шагом 1

        int i1 = 1;
        while (i1<=21){
            if (i1%2==0)System.out.println(i1);
            i1++;

        }







    }
}
