package consult1.cons4;

public class SimpleNumbersServise {

    public static void main(String[] args) {
        /*
    1) пройтись по всем числам от 0 до 100
    2) для каждого числа нужно проверить а есть ли в диапазоне от 2 до нашего числа
       такой делитель который дает остаток от деления =0
     3)если такой делитьль найден то число не простое
       если не найден , напечатать его
         */





    }


    public boolean checkSimple(int number){
        for (int i = 2; i <number ; i++) {
            if (number%i ==0){
                return false;
            }
        }
return true;
    }




}
