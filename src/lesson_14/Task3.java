package lesson_14;

public class Task3 {
    public static void main(String[] args) {

        String[] array = {"Hello", "world", "Java"};
        String str = "Java";
        int index = (findString(array , str));
        if (index!=-1) {
            System.out.printf("Строка " + str + " найдена в массиве на индексе " + index);
        }
else{System.out.println("Строка " + str + " не найдена в массиве");

        }
    }


    public static int findString(String[] array , String str){
        for (int i = 0; i < array.length; i++) {
            if (array[i]==str) return i;

        }
return -1;

    }

}
