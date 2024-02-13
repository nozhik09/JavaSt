package lesson_20.homeWork_20;

public class Smartphone extends ElectronicDevice {

    private double screenSize;

    private String OS;

    public Smartphone(String name, int batteryPower, int precent, double screenSize, String OS) {
        super(name, batteryPower, precent);
        this.screenSize = screenSize;
        this.OS = OS;
    }

    public int charging(int percent){
    for (int i = 0; i < percent; i++) {
        if (percent<100){
            System.out.println("Телефон заряжается" +percent);
            percent+=10;
        }
    }
    System.out.println("Телофон заряжен " + percent +"%");
return percent;
}




    public double getScreenSize() {
        return screenSize;
    }

    public String getOS() {
        return OS;
    }


    @Override
    public String toStingg() {
        return super.toStingg() + " размер экрана " + screenSize + " операционная система " + OS;
    }
}
