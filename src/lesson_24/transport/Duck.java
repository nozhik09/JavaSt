package lesson_24.transport;

public class Duck implements SwimmAble , FlyAble {

    private String color;

    public Duck(String color) {
        this.color = color;
    }

    @Override
    public void fly() {

        System.out.println("Duck " + color + " flies south ");

    }

    @Override
    public void swim() {
        System.out.println(color+" duck swims on the lake ");

    }

    public String getColor() {
        return color;
    }
}
