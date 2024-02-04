package lesson_05;

public class StringMethods {


    public static void main(String[] args) {
        // конкатинайя
        String str1 = "one";
        String str2 = " ";
        String str3 = "hello";
        String str4 = "Strring4";

        String concatStr4 = str1.concat(str2 + str3 + str4);

        System.out.println(concatStr4);

        //разлиянык методыф конкатенации

        //1
        String concatStr = str1 + str2 + str3;// склеивание строкыщ


        System.out.println(concatStr);

        //2. метод Concat

        String concatStr2 = str1.concat(str2 + str3);
        System.out.println(concatStr2);

        concatStr2 = str1.concat(str2 + str3).toUpperCase();

        System.out.println(concatStr2);

        //3 метод join статический

        String concatStrJoin = String.join("!!!!!", str1, str3, str4);
        System.out.println(concatStrJoin);
        concatStrJoin = String.join("====", str1, str3, str4);
        System.out.println(concatStrJoin);


        int int1 = 1;
        int int2 = 2;
        System.out.println(int1 + int2); // мат опер
        System.out.println(" " + int1 + int2); // если добавить "" переводится в текст
        System.out.println(int1 + int2 + " "); // если добавить "" переводится в текст cслева на право послке знака
        System.out.println(" " + (int1 + int2)); //

        int fe = 18;
        int fx = 222;

        System.out.println("My age= " + fe + fx);


        System.out.println("========================");

        String didgits = "0123456789-01";
        System.out.println(" длинна строки" + didgits.length());
        //взятие символа
        char first = didgits.charAt(4);
        System.out.println(first);
        char last = didgits.charAt(didgits.length() / 2);
        System.out.println(last);

        // выделение строки из подстроки
        //substring выделяется строка от отпределного индекса

        String sub = didgits.substring(5);
        System.out.println(sub);

        String sub2 = didgits.substring(5, 8);//1 индекс включительно, последний не включительно.

        System.out.println(sub2);

        int index = didgits.indexOf('4');
        System.out.println("index= " + index);
        index = didgits.indexOf("79");
        System.out.println(index);
        index=didgits.indexOf("1");
        System.out.println(index);
        index=didgits.lastIndexOf("1");//
        System.out.println(index);


       /*
        boolean isCons = didgits.contains("01");
        System.out.println(isCons);
       */


        System.out.println("==================");
        String target ="abdqfqfqabfdsqq";
        String output = target.replace("ab","156161");
        System.out.println(output);

        output= target.replaceFirst("ab" , "1232131212");
        System.out.println(output);

        output = target.replaceAll("ab" , "1111111");
        System.out.println(output);












    }
}
