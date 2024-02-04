package lesson_08;

import java.util.Random;

public class ArraysExaple {

    public static void main(String[] args) {
        // обьявление масивва

        int[] array; //обьявление масива
        int nummbers [];//альтернативный способ, не рекомендуемый



        // инициализация массива
        array = new int[5]; // массив создаетсфя в памяти. Мы обязаны указать размер массива
        // 5 размер массива, кол-во ячеек

        String[] string =new String[7]; // обьявил и сразу инициализировал массив
        //мы созджали переменную которая будет хранить ссылку на массив строк
        //мы создали обьект в памяти
        // какждую ячейку масива мы заполнили значиниями по умолчанию

        // значения по умолчанию
        // для всех числовых это будет 0 - (0.0)
        // для boolean -false
        // для всех ссылочных типов null (null-ничего)
        //явная инициализация массива
        int[] didgits = {56, 98,14,10005,1443};
String[] string1 = {"1" , "hello" , "Java" , "J8" , "orange"};
        // доступ к значениям в ячейках массива

        int value = didgits[2]; // в переменную value было записано значение ячейки с индексом 0

        System.out.println(value);
        System.out.println( string1[2]);


        System.out.println(didgits);

        //размер масива
        int lenght =didgits.length;
        int i=0;
        while (i<lenght){
            System.out.print(didgits[i++]+" , ");

        }
        System.out.println();


        //изменение значения в ячейки массива
        didgits[2] = 5000;
        i=0;
        while (i<didgits.length){
            System.out.print(didgits[i++]+" , ");

        }
        System.out.println();

        string[5]= "Pascal";
        System.out.println(string[5]);


        Random random =new Random();
        int [] rend=new int[5];
        int k =0;
        System.out.println("{");
        while (k<rend.length){
            rend[k]= random.nextInt(101);
            System.out.print(rend[k++] + " = ");

        }
        System.out.println(" } ");

k=0;
int min = rend[0];
while (k<rend.length){

    if(min>rend[k]){
        min=rend[k];
    }
    k++;
}
        System.out.println(min);



    }


}
