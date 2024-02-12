package lesson_18;

public class StaticBlockDemo {
    private static String[] color;

    private static int number = 10;


    static {
        System.out.println("Static init block stert ");
        color = new String[3];
        color[0] = " red";
        color[1] = " Yellow";
        color[2] = " Cyan";

    }

    static {
        System.out.println("non statil init block");
    }


    public void printColors() {
        for (int i = 0; i < color.length; i++) {
            System.out.println(color[i]);
        }


    }
}
