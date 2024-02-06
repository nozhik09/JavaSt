package lesson_14;

public class Task2 {
    public static void main(String[] args) {
        String str = " 0123456789";
        System.out.println(substring(str , 2 , 5));

    }

    public static String substring(String strings, int startindex, int endIndex) {
        String result = "";
        if (strings == null) return result;
        if (strings == null || startindex < 0
                || startindex > strings.length()
                || endIndex > strings.length()
                || endIndex < startindex)
            return result;

        char[] chars = new char[endIndex - startindex];

        for (int i = 0; i < chars.length ; i++) {
            chars[i]=strings.charAt(i+startindex);

        }



       /*  for (int i = startindex; i < endIndex; i++) {
            result +=  strings.charAt(i);

        }

        */
        return String.valueOf(chars);
    }


}
