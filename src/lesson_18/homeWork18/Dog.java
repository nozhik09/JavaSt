package lesson_18.homeWork18;

public class Dog {

    private String name;
    private double heightJump;
    private double maxJump;


    public Dog(String name, double heightJump) {
        this.name = name;
        this.heightJump = heightJump;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) this.name = " ";
    }

    public double getHeightJump() {
        return heightJump;
    }

    public void setHeightJump(double heightJump) {
        this.heightJump = heightJump;
    }

    void jump() {
        System.out.println(" я прыгаю");

    }

    void training() {


        if (heightJump < heightJump * 2) {
            heightJump += 10;
            System.out.println("Собака тренируется "+name + "новая макс высота прыжка = " + heightJump);

        } else System.out.println("Выше я не прыгну");
    }

    public void jump(int barrier) {

        if (heightJump >= maxJump) {
            System.out.println("Собака перепрыгнула барьер");
        } else {
            if (heightJump < maxJump) {
                System.out.println("Собака не может перепрыгнуть Б макс высота прыжка" + heightJump);
                if (heightJump<barrier) training();
            }
            System.out.println("Собака " + name + " ");
        }


    }


}










