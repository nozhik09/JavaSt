package lesson_14.homeWork13;

public class Task11 {
    public static void main(String[] args) {
String strTest = "fsadSADfdsdaasdfSAFFSAd";
        System.out.println(toUpperCase(strTest));
        System.out.println(toUpeerCaseOp2(strTest));


    }


public static String toUpperCase (String str){
    /*
    1.Проверка
    2.перебрать строку если встречается символ в нижним регистре поменять на верхний

     */
        if (str==null) return "";
        /*
        1. преобразую строку в массив char
        2.перебрать символы. Если нужно поменять регистр
        3. сформировать из масива char строку и вернуть
         */
        char[] cahrs = str.toCharArray();
    for (int i = 0; i < cahrs.length; i++) {
        if (cahrs[i]>='a' && cahrs[i]<= 'z'){
            cahrs[i]= (char) (cahrs[i]-32);

        }
    }
       // return String.valueOf(cahrs);
        return new String(cahrs);
}
public static String toUpeerCaseOp2(String str2){
        String result ="";

    for (int i = 0; i < str2.length(); i++) {
        char current=str2.charAt(i);

        if (current>=97 && current<=122){
            result+=String.valueOf(current - 32);
        }
        else {
            result+=String.valueOf(current);
        }
    }
return result;



}


}
