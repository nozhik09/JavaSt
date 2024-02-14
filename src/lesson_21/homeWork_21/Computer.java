package lesson_21.homeWork_21;

public class Computer {
    private String model;
    private Proccesor proccesor;
    private Memory memory;

    private Storage storage;

    public Computer(String model) {
        this.model = model;
        proccesor = new Proccesor("AMD", "Ryzen-7", 2500);

        memory = new Memory("Samsung", "EvoPRo", 16);
        storage = new Storage("WD", "baracuda", 1000);
    }

public String toString(){
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("Computer { ");
        stringBuilder.append("Prossecor: ").append(proccesor.getModel()).append("; ");



        return stringBuilder.toString();



}

    public static void main(String[] args) {
        Computer computer=new Computer("ROG AMD");

            computer.toString();

    }


}
