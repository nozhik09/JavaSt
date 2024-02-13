package lesson_20.homeWork_20;

public class Laptop extends ElectronicDevice {


    private int ram;

    private int memory;


    public Laptop(String name, int batteryPower, int precent, int ram, int memory) {
        super(name, batteryPower, precent);
        this.ram = ram;
        this.memory = memory;

    }

    public void playGame() {
        turnOn();
        System.out.println(" Играем в игру");
        if (getPrecent()<=0) {
            turnOff();
        }


    }

    public void watchMovie() {
        turnOn();
        System.out.println("Самотеть фильм");
        if (getPrecent()<=0) turnOff();

    }


    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return memory;
    }

    public void setStorage(int storage) {
        this.memory = storage;
    }

    @Override
    public String toStingg() {
        return super.toStingg() + ", Количество оперативной памяти " + ram + ", количество памяти " + memory;
    }
}
