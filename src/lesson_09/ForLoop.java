package lesson_09;

import java.util.Random;

public class ForLoop {

    public static void main(String[] args) {

        // for( <инициализация;  < блок проверок> ; изменения счетчиков){
      //      тело цикала }

            int k = 0;
            while (k<20){

                k++;
            }

        System.out.println("k->" + k);

        for (int i=0; i<10; i++) {
            System.out.println(i);

        }
        // System.out.println(i); // за пределами цикла i не видно

        //1.выполняется блок инициализации
            //2. выполняется проверка /
            //3. Если проверка True - выполняется проверкаесли false выходим из цикла
            //4 По оканчанию выполнения цикла, переходим в блок изменений
            //5.Проверка условий


           // for (i =0; ;i++){
          //      System.out.println("Hello" + i);}
            // Ни один из блоков не является обязательным
int j=0;
for (j=0; j<20;j++){
    System.out.print("j=" + j);
}


for (int i =0;i>=0; i+=1000000)//цикл завершится при переполнееии типа int

{
    System.out.println(i);

}



for (String str = "Hello";str.length()<7; str+="$" ){
    System.out.println(str);
}
//мы можем инициализировать несколько переменных . Изменять несколко переменных
    int k1 = 0;
k1 = 15;
//for (int a= 0 , f=1; k1>0 || f<10;k1-- , a=++a+k1++,f++) {
  //  System.out.println(k1 + " : " + a + ": " + f);



// создать массив случайно длин (от 5 до 15) целых случайных чисел
    // Заполнить массив случайх чисел в диапозое от -58 др 58


    Random random = new Random();
    int rand= random.nextInt(15);
    int[] randNum = new int[random.nextInt(11)+5];
        System.out.println("Размер массива - " + randNum.length);

        System.out.println("random " + rand);

for (int i =0; i<randNum.length; i++  ){

    randNum[i] = random.nextInt(101)-50;
    System.out.println(" dasdsa" + randNum[i]);

}



        }




    }





