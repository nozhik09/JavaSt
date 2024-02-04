package lesson_12.homeWork;

public class Task1 {

    public static void main(String[] args) {

String[] str ={ " Hello" , "Vlad", "How are you?", "I am fine"};

        String[] longAndShort = longest(str);
        System.out.println(longAndShort[0]);
        System.out.println(longAndShort[1]);

    }

public static String [] longest (String[] str){
        String shortest = str[0];
        String longes = str[0];
    for (int i = 0; i < str.length; i++) {
        if (str[i].length()<shortest.length()){
            shortest= str[i];
        }
if (str[i].length()>longes.length()){
    longes=str[i];


}
    }

return new String[]{ shortest, longes};


}

}
