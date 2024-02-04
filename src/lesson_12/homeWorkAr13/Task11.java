package lesson_12.homeWorkAr13;

public class Task11 {
    public static void main(String[] args) {

        String[] strings ={ " Hello" , "Vlad", "How are you?",null, "I am fine"};

        String[] res = arraySmallestAndLongestStrings(strings);
        printArray(res);

String[] testArray = null;





    }



    public static String[]arraySmallestAndLongestStrings(String[] strings){


        // 0.Проверить а существует ли обьект массива
        //1.Надо найти строку найменьшей длины и найбольшей длины
        //2.создать массив из двух строк. Записать туда строки и вернуть их туда
        if (strings==null){
            return new String[2];
        }


        String minLen = strings[0];
        String maxLen = strings[0];
        for (int i = 0; i < strings.length; i++) {
            if (strings[i]!=null&& minLen!=null&&minLen.length() > strings[i].length()) {
                minLen=strings[i];
            }
            if (strings[i]!=null&& maxLen!=null&&maxLen.length()<strings[i].length()){
                maxLen=strings[i];


            }

        }
        return new String[]{minLen,maxLen};


    }
    public static void printArray(String [] strings){
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);

        }




    }


}


