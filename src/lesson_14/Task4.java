package lesson_14;

public class Task4 {
    public static void main(String[] args) {
        String str = "Hello";
        String second = fristAndSecondWords(str);

        System.out.println(str);
        System.out.println(second);
    }


    public static String fristAndSecondWords(String str) {
        if (str.length() < 3) return "";


        char secondWords = Character.toUpperCase(str.charAt(1));
        char thirdWords = Character.toUpperCase(str.charAt(2));


        return String.valueOf(secondWords) + thirdWords;

    }
}
