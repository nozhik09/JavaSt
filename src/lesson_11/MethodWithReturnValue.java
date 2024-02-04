package lesson_11;

public class MethodWithReturnValue {

    public static void main(String[] args) {

int x = 5;
int y = 10;
int[] testArray ={11,55,34,65,43};
int findMW=65;
sumNumbers(x,y);
int sum = sumNumberWihthReturn(x,y);
        System.out.println("sum " + sum);
        System.out.println(sumNumberWihthReturn(10,55));
       boolean tr = isDidginArray(testArray , findMW);
        System.out.println(tr);




    }
    // Написать метод который определяет присуттсвет ли число в масиве
    // тип возвращение boolean

    static public boolean isDidginArray(int[] numbers, int search ){

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == search) return true;
        }
        return false;

    }





    public static void sumNumbers(int i, int k){
        int result = i +k;
        System.out.println(result);
    }


    public static int sumNumberWihthReturn( int i, int k){
        int result = i +k;
        return result;
    }






}
