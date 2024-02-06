package lesson_14.homeWork13;

public class Task33 {
    public static void main(String[] args) {
        String[] strings ={"java" , "Orange" , "JS" , "hello"};
        System.out.println(srechString(strings, "java"));

    }
    public static int srechString(String[] strings , String findMe){




        if (strings==null||findMe==null) return -1;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equals(findMe)) return i;

        }
        return -1;
    }


}
