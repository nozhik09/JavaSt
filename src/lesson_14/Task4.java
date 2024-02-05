package lesson_14;

public class Task4 {
    public static void main(String[] args) {
        String str = "Hello";
        String second = fristAndSecondWords(str);

        System.out.println("Строка целиком " + str);
        System.out.println("Строка из 2го и 3го символа входящей строки, переведенная в верхний регистр - " + second);
    }


    public static String fristAndSecondWords(String str) {
        if (str.length() < 3) return "";


        char secondWords = Character.toUpperCase(str.charAt(1));
        char thirdWords = Character.toUpperCase(str.charAt(2));


        return String.valueOf(secondWords) + thirdWords;

    }
}
