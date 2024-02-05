package lesson_14;

public class Task3 {
    public static void main(String[] args) {

        String[] array = {"Hello", "world", "Java"};
        String str = "Java";
        int index = (findString(array, str));
        if (index != -1) {
            System.out.printf("Строка %s найдена в массиве на индексе %d" ,str , index);
        } else {
            System.out.printf("Строка %s не найдена в массиве" , str);

        }
    }


    public static int findString(String[] array, String str) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(str)) return i;

        }
        return -1;

    }

}
