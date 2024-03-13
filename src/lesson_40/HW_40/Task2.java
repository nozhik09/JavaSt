package lesson_40.HW_40;

import java.util.function.Function;

public class Task2 {
    /*
    Создайте цепочку функций,
    которая сначала удаляет пробелы из строки,
    затем преобразует её в верхний регистр, и в конце
    считает количество символов в измененной строке
     */
    public static void main(String[] args) {
        String text = "Строка для проверки количества вхождений слов" +
                ".\n Строка для проверки и теста. и количества слов для проверки теста";
        System.out.println(text.length());

//        Function<String,String> deleteSpace = str-> str.replace(" ","");
//        Function<String,String> toUpperCase = String::toUpperCase;
//        Function<String,Integer> counting = String::length;
//        Function<String,Integer> concatenation = deleteSpace.andThen(toUpperCase).andThen(counting);
        Function<String,Integer> all = str-> str.replace(" ","").toUpperCase().length();
        System.out.println(all.apply(text));
    }
}
