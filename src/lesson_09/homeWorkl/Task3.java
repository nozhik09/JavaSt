package lesson_09.homeWorkl;

public class Task3 {
    public static void main(String[] args) {
        int tre = 6;

        for (int i = 1; i <= tre ; i++) {

            String line = "";
            for (int j = 1; j <=i ; j++) {
                line+=j;

            }
            System.out.println(line);
        }
    }
}
