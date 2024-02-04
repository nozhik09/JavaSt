package lesson_08.homeWork;

public class Task5 {

    public static void main(String[] args) {

        String[] strings = {"Hi", "Hello", "How are you?", " I am fine"};

        String longestStr = strings[0];
        int i = 0;

        while (i < strings.length) {
            if (strings[i].length() > longestStr.length()) {
                longestStr = strings[i];
            }
            i++;

        }

        System.out.println(" Longest: " + longestStr);
        char [] chars = longestStr.toCharArray(); // преобразует строку в соотвест массив символом
        int k = 0;
        while (k< chars.length){
            System.out.println(chars[k++]);


        }


    }
}
