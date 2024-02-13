package lesson_20.homeWork_20;

public class ElectronicDeviseMain {
    public static void main(String[] args) {
        ElectronicDevice electronicDevice = new ElectronicDevice("Electronic Device", 1700, 50);
        System.out.println(electronicDevice.toStingg());

        Smartphone smartphone = new Smartphone("Samsung", 1700, 50, 7.5, "Android");

        System.out.println(smartphone.toStingg());
        smartphone.charging(50);
        Laptop laptop = new Laptop(" Samsung ", 4000, 90, 16, 1000);
        System.out.println(laptop.toStingg());
        laptop.turnOn();
        laptop.watchMovie();
        laptop.playGame();
        System.out.println(laptop.toStingg());

    }
}
