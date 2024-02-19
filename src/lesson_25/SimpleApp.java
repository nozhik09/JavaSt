package lesson_25;

public class SimpleApp {


    public static void main(String[] args) {
        SimpleBox simpleBox1 = new SimpleBox(10);
        System.out.println(simpleBox1);

        SimpleBox simpleBox2 = new SimpleBox(20);

        System.out.println(simpleBox1);
        int sum = (int) simpleBox1.getValue() + (int) simpleBox2.getValue();

        System.out.println("SUM = " + sum);

        SimpleBox simpleBox3 = new SimpleBox(50);

        SimpleBox[] boxes = new SimpleBox[3];
        boxes[0] = simpleBox1;
        boxes[1] = simpleBox2;
        boxes[2] = simpleBox3;


        int sum1 = 0;

        for (int i = 0; i < boxes.length; i++) {
            sum1 += (int) boxes[i].getValue();
        }

        System.out.println("Сумма из масива" + sum1);

    }

}
