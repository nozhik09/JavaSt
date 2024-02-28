package lesson_29.HW_29;

import lesson_25HW_24.MyArrayList;
import lesson_25HW_24.MyList;
import lesson_29.MyLinkedList;

import java.util.Arrays;

public class ListMain {

    public static void main(String[] args) {
        MyList<String> list = new MyArrayList<>();
        String[] strings = list.toArray();
        list.add("Str");

        System.out.println(Arrays.toString(strings));

        System.out.println(list.remove("str"));
        System.out.println(list);
        list.addAll(" Str1", "Str2", "Str3", "Str4", "Str5", "Str6", "Str7");

        System.out.println(list.remove(0));
        System.out.println(list);
        System.out.println(list.remove(5));
        System.out.println(list);


        MyLinkedList<Integer> list1 = new MyLinkedList<>();
        list1.addAll(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);

        MyQueue<Integer> queue  = new MyLinkedList<>();







    }


}
