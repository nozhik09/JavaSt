package lesson_14;

public class Task0 {
    public static void main(String[] args) {
        String str = "a b c d e f g";
        upperCase(str);
    }

    public static void upperCase(String str) {


        for (int i = 0; i <str.length() ; i++) {
            char c = str.charAt(i);
            if (Character.isLowerCase(c)){
                c-=32;
            }
            System.out.print(c);
        }




    }


}
