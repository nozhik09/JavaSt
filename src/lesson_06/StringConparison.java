package lesson_06;

public class StringConparison {

    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "Java";
        String str3 = new String("Java");
        String str4 = new String("JaVa");

        System.out.println(str1 == str2); // сравнения адресов
        System.out.println(str1 == str3); // сравнения адресов


        // String pool

        System.out.println("str1.equals(str2 " + str1.equals(str2)); // сравнивает по значениям
        System.out.println("str1.equals(str2 " + str1.equals(str3)); // сравнивает по значениям
        System.out.println("str1.equals(str2 " + str1.equalsIgnoreCase(str4)); // сравнивает по значениям


    }
}
