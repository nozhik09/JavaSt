package lesson_10;

public class BreakContinio {

    public static void main(String[] args) {

        //оператор continue , break
        // continue при вызове завершает его операцию м пере

        for (int i = 1; i <11 ; i++) {
            if (i==4) continue;
            if (i==9) break;

            System.out.println(i);

        }
// напечатать все чеьтгные числа от 1 .-20
        for (int i = 1; i < 20 ; i++) {
            if (i%2!=0) System.out.println(" от 20 " + i);
        }

    }
}
