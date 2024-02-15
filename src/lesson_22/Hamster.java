package lesson_22;

public class Hamster extends Animal{

    @Override
    public void voice() {

        System.out.println(" Hamster say HrumHrum");

    }

    public void voice(String string){

        System.out.println(" Hamster say: " + string);

    }

    @Override
    public String toString() {
        return "Hamster";
    }
}
