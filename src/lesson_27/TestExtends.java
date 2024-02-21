package lesson_27;

import lesson_25HW_24.MyArrayList;
import lesson_25HW_24.MyList;

public class TestExtends {
    public static void main(String[] args) {
        System.out.println(GenericMethods.sum(Long.valueOf(1565561)));

        System.out.println(GenericMethods.sum(Double.valueOf(5.465), (165.654)));

        MyList<? super Integer> list = new MyArrayList<>();



    }
}
