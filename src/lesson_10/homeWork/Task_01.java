package lesson_10.homeWork;

public class Task_01 {

    public static void main(String[] args) {
        int i = 31;
        raise(i);

    }


    public static void raise(int i) {
        int absPow = (i > 0) ? i : i * -1;
        int res = 1;
        for (int j = 0; j < absPow; j++) {
            res *= 2;
        }


        System.out.printf("2 в степени %d = %d", i, res);
    }
}
