package lesson_14.homeWork13;

public class Task44 {

    public static void main(String[] args) {
String string ="He";
String str = substringToUpperCase(string);
        System.out.println(str);

    }
    public static String substringToUpperCase(String string){
        if (string==null) return " ";


        String result = "";
        if (string.length()>1){
            char char2 = string.charAt(1);
            result+=char2;

        }

        if (string.length()>2){
            char char3 = string.charAt(2);
            result+=char3;

        }




        return result.toUpperCase();

    }
}
