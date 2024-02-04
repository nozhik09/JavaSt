package lesson_10;

public class MethodsEx {
    public static void main(String[] args) {
        sayHello();

        char ch = 'A';
        char ch1 = 'G';
        char ch2 = 'y';
        // нужен кусок кода который умеет выводить на экран код в десят систкмк
        printDecimaCode('V');
        printDecimaCode(ch);
        printDecimaCode(ch1);

        int[] array = {1, 45, 7, 37, 98, 5432, 0, 45};
        printArray(array);
        array[4] = 2131;
        array[2] = 46;
        printArray(array);

        int var = 10 ;
        changeVar(var);
        System.out.println("Var from main " + var);

        System.out.println("===================");
        printArray(array);
        changeArrayElements(array);
        System.out.println("array[0] from methid" + array[0]);



    }

    public static void printDecimaCode(char ch) {
        System.out.println("Принял в метод значение");
        System.out.println((int) ch);

    }


    public static void sayHello() {

        System.out.println("hello");
        int x = 5;
        int y = 10;
        int z = x + y;
        System.out.println(z);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + ((i < array.length - 1) ? ", " : "]\n"));
        }


    }
public static void changeVar(int number){
        number+=15;
    System.out.println("number from method " + number);


}

public static void changeArrayElements(int[] nummbers){
        nummbers[0] = 1000;
    System.out.println("numbers " +nummbers[0]);


}


}
