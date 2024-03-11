package lesson_38.HW_38;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Task3 {
//Написать метод, возвращающий первый неповторяющийся символ в строке

    public static void main(String[] args) {
        String string = "abcdefj ab,cdf,";
        System.out.println(Task3.getFirstUniqueChar(string));
    }
    public static Character getFirstUniqueChar(String str) {
        Set<Character> charSet = new LinkedHashSet<>();
        Set<Character> replase = new HashSet<>();
        for (char ch: str.toCharArray()){
            if (replase.contains(ch)){
                continue;
            }
            if (charSet.contains(ch)){
                charSet.remove(ch);
                replase.add(ch);
            }
            else {
                charSet.add(ch);
            }



        }

        return charSet.iterator().next();
    }






}
